package com.gatakalfzzah.consumer.network.handlers.callbacks;

import com.gatakalfzzah.consumer.network.models.response.BaseResponse;
import com.gatakalfzzah.consumer.network.models.response.CategoriesResponse;
import com.gatakalfzzah.consumer.network.models.response.SignInResponse;

/**
 * Created by subhan on 11/27/18.
 */

public interface CategoriesCallback {
    void onCategoriesSuccess(CategoriesResponse categoriesResponse);
    void onCategoriesFailure(BaseResponse baseResponse);
}