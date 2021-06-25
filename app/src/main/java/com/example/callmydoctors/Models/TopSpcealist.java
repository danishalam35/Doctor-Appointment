package com.example.callmydoctors.Models;

public class TopSpcealist {

    String imgUrl;
    String nameSpecialist;
    String meet,chronic,doctors;

    public TopSpcealist(String imgUrl, String nameSpecialist, String meet, String chronic, String doctors) {
        this.imgUrl = imgUrl;
        this.nameSpecialist = nameSpecialist;
        this.meet = meet;
        this.chronic = chronic;
        this.doctors = doctors;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNameSpecialist() {
        return nameSpecialist;
    }

    public void setNameSpecialist(String nameSpecialist) {
        this.nameSpecialist = nameSpecialist;
    }

    public String getMeet() {
        return meet;
    }

    public void setMeet(String meet) {
        this.meet = meet;
    }

    public String getChronic() {
        return chronic;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic;
    }

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }
}
