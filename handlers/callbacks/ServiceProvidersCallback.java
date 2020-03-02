package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;
import com.gatakalfzzah.consumer.network.models.response.ServiceProviderResponse;

/**
 * Created by subhan on 12/2/18.
 */

public interface ServiceProvidersCallback {
    void onServiceProviderSuccess(ServiceProviderResponse categoriesResponse);
    void onServiceProvidersFailure(BaseResponse baseResponse);
}
