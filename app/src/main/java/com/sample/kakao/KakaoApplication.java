package com.sample.kakao;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "d81d8db579d9c0c625eaee8a477a5108");
    }
}
