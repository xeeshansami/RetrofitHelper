package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;
import com.gatakalfzzah.consumer.network.models.response.VendorProductResponse;

/**
 * Created by subhan on 12/28/18.
 */

public interface ProductsCallback {
    void onProductsSuccess(VendorProductResponse categoriesResponse);
    void onProductsFailure(BaseResponse baseResponse);
}