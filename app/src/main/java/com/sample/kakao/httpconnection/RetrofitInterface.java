package com.sample.kakao.httpconnection;

import com.sample.kakao.domain.MyInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {

    // 유저 등록
    @POST("api/register/kakao")
    Call<MyInfo> registerForKakao(@Body MyInfo myInfo);


}
