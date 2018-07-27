package velsol.com.expandblelists.helpers;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Velsol 170016 on 7/16/2018.
 */

public interface ApiService
{
    @FormUrlEncoded
    @POST("customerRequest.php")
    Call<MSG> adding(String operatorId,
                     String value);
}
