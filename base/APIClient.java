package com.gatakalfzzah.consumer.network.base;

import com.gatakalfzzah.consumer.BuildConfig;
import com.gatakalfzzah.consumer.ConsumerApplication;
import com.gatakalfzzah.consumer.utils.ConnectivityInterceptor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
//import com.readystatesoftware.chuck.ChuckInterceptor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 */
public class APIClient {

    private static Retrofit retrofit = null;
    private static Retrofit retrofitLongTimeout = null;
    private static IOnConnectionTimeoutListener timeoutListener;

    /**
     * @param listener
     * @returngetClient
     */
    public static Retrofit getClient(IOnConnectionTimeoutListener listener) {
        timeoutListener = listener;
        if (retrofit == null) {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder();

            builder.readTimeout(APIConstants.READ_TIMEOUT, TimeUnit.SECONDS);
            builder.writeTimeout(APIConstants.WRITE_TIMEOUT, TimeUnit.SECONDS);
            builder.connectTimeout(APIConstants.CONNECT_TIMEOUT, TimeUnit.SECONDS);
            if (BuildConfig.DEBUG) {
//                if (ConsumerApplication.getConsumerApplication() != null) {
//                    builder.addInterceptor(new ChuckInterceptor(ConsumerApplication.getConsumerApplication()));
//                }
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                builder.addInterceptor(interceptor);
            }
            builder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    final Request original = chain.request();
                    final HttpUrl originalHttpUrl = original.url();

                    final HttpUrl url = originalHttpUrl.newBuilder()
                            .build();

                    // Request customization: add request headers
                    final Request.Builder requestBuilder = original.newBuilder()
                            .url(url);

                    final Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            builder.addInterceptor(new ConnectivityInterceptor(ConsumerApplication.getConsumerApplication()));

            OkHttpClient client = builder.build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(APIConstants.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getClient(IOnConnectionTimeoutListener listener,long timeout) {
        timeoutListener = listener;
        if (retrofitLongTimeout == null) {
            OkHttpClient.Builder builder = new OkHttpClient().newBuilder().readTimeout(timeout, TimeUnit.SECONDS).
            writeTimeout(timeout, TimeUnit.SECONDS).connectTimeout(timeout, TimeUnit.SECONDS);

            if (BuildConfig.DEBUG) {
//                if (ConsumerApplication.getConsumerApplication() != null) {
//                    builder.addInterceptor(new ChuckInterceptor(ConsumerApplication.getConsumerApplication()));
//                }
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                builder.addInterceptor(interceptor);
            }
            builder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    final Request original = chain.request();
                    final HttpUrl originalHttpUrl = original.url();

                    final HttpUrl url = originalHttpUrl.newBuilder()
                            .build();

                    // Request customization: add request headers
                    final Request.Builder requestBuilder = original.newBuilder()
                            .url(url);

                    final Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            builder.addInterceptor(new ConnectivityInterceptor(ConsumerApplication.getConsumerApplication()));

            OkHttpClient client = builder.build();

            retrofitLongTimeout = new Retrofit.Builder()
                    .baseUrl(APIConstants.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofitLongTimeout;
    }

    private static Response OnIntercept(Interceptor.Chain chain) throws IOException {
        try {
            if (BuildConfig.DEBUG) {
                /*LoggerUtil.printInfo(chain.request().url().toString());
                LoggerUtil.printInfo(chain.request().headers().toString());*/
            }
            Response response = chain.proceed(chain.request());
            return response;
        } catch (Exception exception) {
            exception.printStackTrace();
            if (timeoutListener != null)
                timeoutListener.onConnectionTimeout();
            return null;
        }
    }

    public static void onUrlChanged() {
        retrofit = null;
        retrofitLongTimeout = null;
    }
}
