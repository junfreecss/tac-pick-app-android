package com.tac.pickapp.data.remote.api;
import com.tac.pickapp.data.remote.dto.Response;
import com.tac.pickapp.util.Constants;

import io.reactivex.rxjava3.core.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApi {

    @POST(Constants.BASE_URI + "/api/user/update/email")
    Observable<Response> updateEmail(@Body RequestBody body);

    @POST(Constants.BASE_URI + "/api/user/update/phone")
    Observable<Response> updatePhone(@Body RequestBody body);

    @POST(Constants.BASE_URI + "/api/user/update/change-password")
    Observable<Response> changePassword(@Body RequestBody body);

    @POST(Constants.BASE_URI + "/api/user/update/address")
    Observable<Response> updateAddress(@Body RequestBody body);

}
