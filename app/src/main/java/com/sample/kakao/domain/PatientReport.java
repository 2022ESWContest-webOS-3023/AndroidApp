package com.sample.kakao.domain;

import java.util.ArrayList;
import java.util.List;

public class PatientReport { // 신고 도메인
    private String reportId; // 신고 내용 pk
    private Double latitude; // 위도 좌표
    private Double longitude; // 경도 좌표
    private String address; // 도로명 주소
    private ReportState reportState; // 신고 접수 현황
    private List<String> imageUrls = new ArrayList<>(); // 신고 사진 리스트
    private String content; // 신고 접수 내용
}
