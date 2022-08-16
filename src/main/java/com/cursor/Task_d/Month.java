package com.cursor.Task_d;

public enum Month {
    JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING), APRIL(30, Season.SPRING), MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER), JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN), OCTOBER(31, Season.AUTUMN), NOVEMBER(30, Season.AUTUMN),
    DECEMBER(31, Season.WINTER);

    private int numberDays;
    private Season season;

    Month(int numberDays, Season season) {
        this.numberDays = numberDays;
        this.season = season;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Month{" + "numberDays=" + numberDays + ", season=" + season + '}';
    }
}