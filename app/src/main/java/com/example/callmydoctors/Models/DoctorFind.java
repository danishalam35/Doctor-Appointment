package com.example.callmydoctors.Models;

public class DoctorFind {

    String doctorImage;
    String dName;
    String dType;
    String dLocation;

    public DoctorFind(String doctorImage, String dName, String dType, String dLocation) {
        this.doctorImage = doctorImage;
        this.dName = dName;
        this.dType = dType;
        this.dLocation = dLocation;
    }

    public String getDoctorImage() {
        return doctorImage;
    }

    public void setDoctorImage(String doctorImage) {
        this.doctorImage = doctorImage;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    public String getdLocation() {
        return dLocation;
    }

    public void setdLocation(String dLocation) {
        this.dLocation = dLocation;
    }
}
