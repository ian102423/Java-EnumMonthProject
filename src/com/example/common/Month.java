package com.example.common;

public enum Month {
    MONTH("달"),
    JANUARY("일월"),
    FEBRUARY("이월"),
    MARCH("삼월"),
    APRIL("사월"),
    MAY("오월"),
    JUNE("유월"),
    JULY("칠월"),
    AUGUST("팔월"),
    SEPTEMBER("구월"),
    OCTOBER("시월"),
    NOVEMBER("십일월"),
    DECEMBER("십이월");

    private String koreanName;

    Month(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getKoreanName() {
        return koreanName;
    }
}
