package com.sample.kakao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.sample.kakao.domain.MyInfo;
import com.sample.kakao.httpconnection.RetrofitClient;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Step1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        MyInfo myInfo = MyInfo.getInstance();

        Call<MyInfo> myInfoCall = RetrofitClient.getApiService().registerForKakao(myInfo);
        myInfoCall.enqueue(new Callback<MyInfo>() {
            @Override
            public void onResponse(Call<MyInfo> call, Response<MyInfo> response) {
                System.out.println("success");
                System.out.println(myInfo);
            }

            @Override
            public void onFailure(Call<MyInfo> call, Throwable t) {
                System.out.println("failed");
            }
        });
    }
}