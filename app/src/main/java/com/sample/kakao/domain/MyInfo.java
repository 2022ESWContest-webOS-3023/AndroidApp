package com.sample.kakao.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MyInfo {
    private String kakaoId;
    private String email;
    private String nickname;
    private String gender;
    private String age;

    @JsonIgnore
    private static MyInfo instance = null;

    public static MyInfo getInstance() {
        if (instance == null){
            instance = new MyInfo();
        }
        return instance;
    }

    public String getKakaoId() {
        return kakaoId;
    }

    public void setKakaoId(String kakaoId) {
        this.kakaoId = kakaoId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInfo myInfo = (MyInfo) o;
        return Objects.equals(kakaoId, myInfo.kakaoId) && Objects.equals(email, myInfo.email) && Objects.equals(nickname, myInfo.nickname) && Objects.equals(gender, myInfo.gender) && Objects.equals(age, myInfo.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kakaoId, email, nickname, gender, age);
    }

    @Override
    public String toString() {
        return "MyInfo{" +
                "kakaoId='" + kakaoId + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
