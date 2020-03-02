package com.gatakalfzzah.consumer.network.store;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.gatakalfzzah.consumer.R;
import com.gatakalfzzah.consumer.network.api.ConsumerAPI;
import com.gatakalfzzah.consumer.network.base.APIClient;
import com.gatakalfzzah.consumer.network.base.IOnConnectionTimeoutListener;
import com.gatakalfzzah.consumer.network.handlers.AddBookingRH;
import com.gatakalfzzah.consumer.network.handlers.BaseResponseRH;
import com.gatakalfzzah.consumer.network.handlers.CategoriesRH;
import com.gatakalfzzah.consumer.network.handlers.ChatMessageRH;
import com.gatakalfzzah.consumer.network.handlers.ChatSendRH;
import com.gatakalfzzah.consumer.network.handlers.CreateBookingRH;
import com.gatakalfzzah.consumer.network.handlers.CreateVendorRH;
import com.gatakalfzzah.consumer.network.handlers.InboxRH;
import com.gatakalfzzah.consumer.network.handlers.NotificationRH;
import com.gatakalfzzah.consumer.network.handlers.OrderBuyRH;
import com.gatakalfzzah.consumer.network.handlers.ProductProviderHistoryRH;
import com.gatakalfzzah.consumer.network.handlers.RatingBaseResponseHR;
import com.gatakalfzzah.consumer.network.handlers.ServiceProviderHistoryRH;
import com.gatakalfzzah.consumer.network.handlers.ProductsRH;
import com.gatakalfzzah.consumer.network.handlers.ServiceProviderRH;
import com.gatakalfzzah.consumer.network.handlers.SignInUserRH;
import com.gatakalfzzah.consumer.network.handlers.SignUpUserRH;
import com.gatakalfzzah.consumer.network.handlers.SingleEmployeeRH;
import com.gatakalfzzah.consumer.network.handlers.SingleServiceProviderRH;
import com.gatakalfzzah.consumer.network.handlers.UpdateUserRH;
import com.gatakalfzzah.consumer.network.handlers.callbacks.BaseCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.AddBookingCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.CategoriesCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ChatReceiveCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ChatSendCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.CreateBookingCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.CreateVendorCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.InboxCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.NotificationCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.OrderBuyCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ProductProviderHistoryCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.RatingCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ServiceProviderHistoryCallBack;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ProductsCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.ServiceProvidersCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SignInUserCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SignUpUserCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SingleEmployeeCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.SingleServiceProviderCallback;
import com.gatakalfzzah.consumer.network.handlers.callbacks.UpdateUserCallBack;
import com.gatakalfzzah.consumer.network.models.request.ChatSendRequest;
import com.gatakalfzzah.consumer.network.models.request.CreateBookingRequest;
import com.gatakalfzzah.consumer.network.models.request.OrderProduct;
import com.gatakalfzzah.consumer.network.models.request.RatingRequest;
import com.gatakalfzzah.consumer.network.models.request.ResetPasswordRequest;
import com.gatakalfzzah.consumer.network.models.request.ServiceProviderBookingRequest;
import com.gatakalfzzah.consumer.network.models.request.SignInRequest;
import com.gatakalfzzah.consumer.network.models.request.UpdateBookingRequest;
import com.vend.utils.ProgressBarUtil;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;


public class ConsumerStore  extends Application implements IOnConnectionTimeoutListener {

    private static ConsumerStore consumerStore;

    ConsumerAPI consumerAPI = APIClient.getClient(this,15000).create(ConsumerAPI.class);

    private ConsumerStore() {
    }

    public static ConsumerStore getInstance() {
        if (consumerStore == null)
            return new ConsumerStore();
        else
            return consumerStore;
    }


    public void signInUser(SignInRequest signInRequest, SignInUserCallback signInUserCallback) {
        consumerAPI.signInUser(signInRequest, "application/json").enqueue(new SignInUserRH(signInUserCallback));
    }

    public void signup(MultipartBody.Part body, Map<String, RequestBody> map, SignUpUserCallback signUpUserCallback) {
        consumerAPI.signUpUser(body, map).enqueue(new SignUpUserRH(signUpUserCallback));
    }


/*    public void signUpUser(SignUpRequest signUpRequest, SignUpUserCallback signUpUserCallback){
        consumerAPI.signUpUser(signUpRequest, "application/json").enqueue(new SignUpUserRH(signUpUserCallback));
    }*/

    public void forgetPassword(ResetPasswordRequest resetPasswordRequest, BaseCallback baseCallback) {
        consumerAPI.forgetPassword("application/json", resetPasswordRequest).enqueue(new BaseResponseRH(baseCallback));
    }

    public void checkEmail(Map<String, RequestBody> partMap, SignInUserCallback baseCallback) {
        consumerAPI.checkEmail(partMap).enqueue(new SignInUserRH(baseCallback));
    }

    public void getCategories(String token, CategoriesCallback categoriesCallback) {
        consumerAPI.getCategories(token).enqueue(new CategoriesRH(categoriesCallback));
    }

    public void getServiceProviders(int categoryId, int subcategoryId, ServiceProvidersCallback serviceProvidersCallback) {
        consumerAPI.getServiceProviders(categoryId, subcategoryId).enqueue(new ServiceProviderRH(serviceProvidersCallback));
    }

    public void getSingleServiceProvider(String token, int id, SingleServiceProviderCallback serviceProvidersCallback) {
        consumerAPI.getSingleServiceProvider(token, id).enqueue(new SingleServiceProviderRH(serviceProvidersCallback));
    }

    public void getSingleEmployee(String token, int id, SingleEmployeeCallback serviceProvidersCallback) {
        consumerAPI.getSingleEmployee(token, id).enqueue(new SingleEmployeeRH(serviceProvidersCallback));
    }

    public void getMoreServiceProviders(int nextPageNo, ServiceProvidersCallback serviceProvidersCallback) {
        consumerAPI.getMoreServiceProviders(nextPageNo).enqueue(new ServiceProviderRH(serviceProvidersCallback));
    }

    public void getServiceProvidersForBooking(String token, int id, CreateBookingCallback createBookingCallback) {
        consumerAPI.getServiceProvidersForBooking(token, id).enqueue(new CreateBookingRH(createBookingCallback));
    }

    public void getVendorProducts(String token, int id, ProductsCallback productsCallback) {
        consumerAPI.getVendorProducts(token, id).enqueue(new ProductsRH(productsCallback));
    }

    public void orderProduct(String token, OrderProduct orderProductRequest, OrderBuyCallBack baseCallback) {
        consumerAPI.createVendorBooking(token, orderProductRequest).enqueue(new OrderBuyRH(baseCallback));
    }

    public void createVendorBooking(String token, CreateBookingRequest createBookingRequest, CreateVendorCallBack createVendorCallBack) {
        consumerAPI.createVendorBooking(token, createBookingRequest).enqueue(new CreateVendorRH(createVendorCallBack));
    }

    public void addServiceProviderToBooking(String token, ServiceProviderBookingRequest serviceProviderBookingRequest, AddBookingCallBack baseCallback) {
        consumerAPI.addServiceProviderToBooking(token, serviceProviderBookingRequest).enqueue(new AddBookingRH(baseCallback));
    }


    public void updateBooking(String token, UpdateBookingRequest updateBookingRequest, BaseCallback baseCallback) {
        consumerAPI.updateBooking(token, updateBookingRequest).enqueue(new BaseResponseRH(baseCallback));
    }


    public void creatBooking(String token, RequestBody requestBody, CreateBookingCallback createBookingCallback) {
        consumerAPI.createBooking(token, requestBody).enqueue(new CreateBookingRH(createBookingCallback));
    }

    public void makeOffer(String token, Integer id, BaseCallback baseCallback) {
        consumerAPI.makeOffer(token, id).enqueue(new BaseResponseRH(baseCallback));
    }

    public void deleteBooking(String token, Integer id, BaseCallback baseCallback) {
        consumerAPI.deleteBooking(token, id).enqueue(new BaseResponseRH(baseCallback));
    }


    public void messageSend(String token, ChatSendRequest chatSendRequest, ChatSendCallBack chatSendCallBack) {
        consumerAPI.sendMessage(token, chatSendRequest).enqueue(new ChatSendRH(chatSendCallBack));
    }

    public void sendMessageVoiceNote(String token, RequestBody chatSendRequest, ChatSendCallBack chatSendCallBack) {
        consumerAPI.sendMessageVoiceNote(token, chatSendRequest).enqueue(new ChatSendRH(chatSendCallBack));
    }

    public void getServiceBookingHistory(String token, ServiceProviderHistoryCallBack serviceProviderHistoryCallBack) {
        consumerAPI.getServiceProviderHistory(token).enqueue(new ServiceProviderHistoryRH(serviceProviderHistoryCallBack));
    }

    public void getProviderBookingHistory(String token, ProductProviderHistoryCallBack productProviderHistoryCallBack) {
        consumerAPI.getProductProviderHistory(token).enqueue(new ProductProviderHistoryRH(productProviderHistoryCallBack));
    }

    public void updateProfile(String token, RequestBody requestBody, UpdateUserCallBack updateUserCallBack) {
        consumerAPI.updateProfile(token, requestBody).enqueue(new UpdateUserRH(updateUserCallBack));
    }

    public void getInbox(String token, InboxCallBack inboxCallBack) {
        consumerAPI.getInbox(token).enqueue(new InboxRH(inboxCallBack));
    }

    public void rateServiceProvider(String token, RatingRequest ratingRequest, RatingCallBack baseCallback) {
        consumerAPI.rateServiceProvider(token, ratingRequest).enqueue(new RatingBaseResponseHR(baseCallback));
    }

    public void getChatMessages(String token, int reciverId, ChatReceiveCallBack chatReceiveCallBack) {
        consumerAPI.getMessages(token, reciverId).enqueue(new ChatMessageRH(chatReceiveCallBack));
    }

    public void getNotifications(String token, NotificationCallback notificationCallback) {
        consumerAPI.getNotifications(token).enqueue(new NotificationRH(notificationCallback));
    }

    public void deleteNotifications(String token, int id, BaseCallback baseCallback) {
        consumerAPI.deleteNotifications(token, id).enqueue(new BaseResponseRH(baseCallback));
    }


    @Override
    public void onConnectionTimeout() {
        Log.d("timeout", "request");
        ProgressBarUtil.hideSpinnerProgressDialog();
        Toast.makeText(getApplicationContext(), getApplicationContext().getResources().getString(R.string.internet_connectivity_failed), Toast.LENGTH_SHORT).show();
    }
}
