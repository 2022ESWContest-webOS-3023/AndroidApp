package com.sample.kakao.domain;

import com.kakao.sdk.user.model.Gender;

import java.util.Objects;

public class Patient { // 환자 정보 도메인
    private String patientId; // 환자 pk
    private String name; // 이름
    private Gender gender; // 성별
    private String birthDate; // 생년월일 ex) 1997/09/10
    private BloodType bloodType; // 혈액형
    private boolean underlyingDisease; // 기저 질환 유무
    private String diseaseDetails; // 질환 상세 설명
    private boolean contact; // 비상연락망 유무
    private String myContact; // 신고자 전화번호
    private String secondContact; // 지인 전화번호
    private String relationshipWithSecond; // 지인과의 관계
    private boolean smoke; // 흡연 유무
}