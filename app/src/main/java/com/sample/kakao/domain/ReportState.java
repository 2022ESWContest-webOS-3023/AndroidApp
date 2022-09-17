package com.sample.kakao.domain;

public enum ReportState { // 신고 접수 현황
    READY, // 신고 접수 전
    CHECKED, // 신고 접수 완료
    ARRIVED, // 도착 완료
    FINISH, // 신고 내용 조치 완료
    CANCELED // 신고 취소
}
