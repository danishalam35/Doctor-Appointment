package com.example.callmydoctors.Models;

public class TopHospital {

    String urlImages;
    String hName,hSpecialist,hLocation;

    public TopHospital(String urlImages, String hName, String hSpecialist, String hLocation) {
        this.urlImages = urlImages;
        this.hName = hName;
        this.hSpecialist = hSpecialist;
        this.hLocation = hLocation;
    }

    public String getUrlImages() {
        return urlImages;
    }

    public void setUrlImages(String urlImages) {
        this.urlImages = urlImages;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethSpecialist() {
        return hSpecialist;
    }

    public void sethSpecialist(String hSpecialist) {
        this.hSpecialist = hSpecialist;
    }

    public String gethLocation() {
        return hLocation;
    }

    public void sethLocation(String hLocation) {
        this.hLocation = hLocation;
    }
}
