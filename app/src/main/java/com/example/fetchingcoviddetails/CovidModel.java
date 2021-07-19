package com.example.fetchingcoviddetails;

public class CovidModel {

    private String data;
    private String positive;
    private String negative;
    private String hospitalized;
    private String OnVentilator;
    private String death;
    private String checkedInDate;

    public CovidModel(String data, String positive, String negative, String hospitalized, String onVentilator, String death, String checkedInDate) {
        this.data = data;
        this.positive = positive;
        this.negative = negative;
        this.hospitalized = hospitalized;
        OnVentilator = onVentilator;
        this.death = death;
        this.checkedInDate = checkedInDate;
    }

    public String getData() {
        return data;
    }

    public String getPositive() {
        return positive;
    }

    public String getNegative() {
        return negative;
    }

    public String getHospitalized() {
        return hospitalized;
    }

    public String getOnVentilator() {
        return OnVentilator;
    }

    public String getDeath() {
        return death;
    }

    public String getCheckedInDate() {
        return checkedInDate;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public void setNegative(String negative) {
        this.negative = negative;
    }

    public void setHospitalized(String hospitalized) {
        this.hospitalized = hospitalized;
    }

    public void setOnVentilator(String onVentilator) {
        OnVentilator = onVentilator;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public void setCheckedInDate(String checkedInDate) {
        this.checkedInDate = checkedInDate;
    }
}
