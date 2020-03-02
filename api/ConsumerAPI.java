package com.gatakalfzzah.consumer.network.api;

import com.gatakalfzzah.consumer.models.Rating;
import com.gatakalfzzah.consumer.network.models.request.ChatSendRequest;
import com.gatakalfzzah.consumer.network.models.request.CreateBookingRequest;
import com.gatakalfzzah.consumer.network.models.request.OrderProduct;
import com.gatakalfzzah.consumer.network.models.request.RatingRequest;
import com.gatakalfzzah.consumer.network.models.request.ResetPasswordRequest;
import com.gatakalfzzah.consumer.network.models.request.ServiceProviderBookingRequest;
import com.gatakalfzzah.consumer.network.models.request.SignInRequest;
import com.gatakalfzzah.consumer.network.models.request.UpdateBookingRequest;
import com.gatakalfzzah.consumer.network.models.response.AddBookingResponse;
import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;
import com.gatakalfzzah.consumer.network.models.response.ChatMessageResponse;
import com.gatakalfzzah.consumer.network.models.response.ChatSendResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingServiceProviderResponse;
import com.gatakalfzzah.consumer.network.models.response.CreateBookingVendorResponse;
import com.gatakalfzzah.consumer.network.models.response.InboxResponse;
import com.gatakalfzzah.consumer.network.models.response.NotificationResponse;
import com.gatakalfzzah.consumer.network.models.response.OrderProductRequest;
import com.gatakalfzzah.consumer.network.models.response.ProductProviderHistoryResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderHistoryResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;
import com.gatakalfzzah.consumer.network.models.response.SignUpResponse;
import com.gatakalfzzah.consumer.network.models.response.SingleEmployeeResponse;
import com.gatakalfzzah.consumer.network.models.response.SingleServiceProviderResponse;
import com.gatakalfzzah.consumer.network.models.response.UpdateUserResponse;
import com.gatakalfzzah.consumer.network.models.response.VendorProductResponse;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ConsumerAPI {

    @POST("login")
    Call<SignInResponse> signInUser(@Body SignInRequest signInRequest, @Header("Content-Type") String content_type);

    /*@POST("signup")
    Call<SignUpResponse> signUpUser(@Body SignUpRequest signUpRequest, @Header("Content-Type") String content_type);*/

    @Multipart
    @POST("signup")
    Call<SignUpResponse> signUpUser(@Part MultipartBody.Part file, @PartMap() Map<String, RequestBody> partMap);

    @POST("resetpass/create")
    Call<BaseResponse> forgetPassword(@Header("Content-Type") String content_type, @Body ResetPasswordRequest resetPasswordRequest);

    @Multipart
    @POST("emailCheck")
    Call<SignInResponse> checkEmail(@PartMap() Map<String, RequestBody> partMap);

    @GET("categories")
    Call<CategoriesResponse> getCategories(@Header("Authorization") String token);

    @GET("service_providers/get/{id}")
    Call<SingleServiceProviderResponse> getSingleServiceProvider(@Header("Authorization") String token, @Path("id") Integer id);

    @GET("get/single/employee/{id}")
    Call<SingleEmployeeResponse> getSingleEmployee(@Header("Authorization") String token, @Path("id") Integer id);

    @GET("service_providers/get")
    Call<ServiceProviderResponse> getServiceProviders(@Query("category_id") int category_id, @Query("sub_category_id") int sub_category_id);

    @GET("service_providers")
    Call<ServiceProviderResponse> getMoreServiceProviders(@Query("page") int pageno);

    @GET("bookings/bookings/get/booking/serviceproviders/{id}")
    Call<CreateBookingServiceProviderResponse> getServiceProvidersForBooking(@Header("Authorization") String token, @Path("id") Integer id);

    @GET("vendors/products/{id}")
    Call<VendorProductResponse> getVendorProducts(@Header("Authorization") String token, @Path("id") Integer id);

    @POST("bookings/bookings/buy")
    @Headers("Accept: application/json")
    Call<OrderProductRequest> createVendorBooking(@Header("Authorization") String token,
                                                  @Body OrderProduct orderProductRequest);

    @POST("bookings/bookings/create")
    @Headers("Accept: application/json")
    Call<CreateBookingServiceProviderResponse> createBooking(@Header("Authorization") String token,
                                                             @Body RequestBody createBooking);

    @POST("bookings/bookings/create")
    @Headers("Accept: application/json"
    )
    Call<CreateBookingVendorResponse> createVendorBooking(@Header("Authorization") String token,
                                                          @Body CreateBookingRequest createBooking);

    @POST("bookings/bookings/edit/booking")
    @Headers("Accept: application/json"
    )
    Call<BaseResponse> updateBooking(@Header("Authorization") String token,
                                     @Body UpdateBookingRequest updateBookingRequest);

    @POST("bookings/bookings/{id}/make/offer")
    @Headers("Accept: application/json")
    Call<BaseResponse> makeOffer(@Header("Authorization") String token, @Path("id") Integer id);

    @GET("bookings/bookings/delete/booking/{id}")
    @Headers("Accept: application/json")
    Call<BaseResponse> deleteBooking(@Header("Authorization") String token, @Path("id") Integer id);

    @POST("bookings/bookings/add/serviceprovider")
    @Headers("Accept: application/json")
    Call<AddBookingResponse> addServiceProviderToBooking(@Header("Authorization") String token, @Body ServiceProviderBookingRequest serviceProviderBookingRequest);

    @POST("chat/send")
    @Headers("Accept: application/json")
    Call<ChatSendResponse> sendMessage(@Header("Authorization") String token, @Body ChatSendRequest chatSendRequest);

    @POST("chat/send")
    @Headers("Accept: application/json")
    Call<ChatSendResponse> sendMessageVoiceNote(@Header("Authorization") String token, @Body RequestBody chatSendRequest);

    @GET("bookings/bookings/mine")
    @Headers("Accept: application/json")
    Call<ServiceProviderHistoryResponse> getServiceProviderHistory(@Header("Authorization") String token);

    @GET("orders/consumer/products")
    @Headers("Accept: application/json")
    Call<ProductProviderHistoryResponse> getProductProviderHistory(@Header("Authorization") String token);

    @POST("profile/edit/consumer")
    Call<UpdateUserResponse> updateProfile(@Header("Authorization") String token, @Body RequestBody requestBody);

    @GET("chat/last-messages")
    Call<InboxResponse> getInbox(@Header("Authorization") String token);

    @GET("chat")
    @Headers("Accept: application/json")
    Call<ChatMessageResponse> getMessages(@Header("Authorization") String token, @Query("receiver_id") int id);

    @POST("service_providers/rate")
    @Headers("Accept: application/json")
    Call<Rating> rateServiceProvider(@Header("Authorization") String token, @Body RatingRequest ratingRequest);

    @GET("notifications")
    Call<NotificationResponse> getNotifications(@Header("Authorization")  String token );

    @POST("notifications/{id}/delete")
    Call<BaseResponse> deleteNotifications(@Header("Authorization") String token, @Path("id") int id);
}
