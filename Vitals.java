package com.example.cse360project;

import java.util.Date;

public class Vitals {
    private Date date;
    private String patientId;
    private String weight;
    private String height;
    private int bodyTemperature;
    private int bloodPressure;

    public Vitals(Date date, String patientId, String weight, String height, int bodyTemperature, int bloodPressure) {
        this.date = date;
        this.patientId = patientId;
        this.weight = weight;
        this.height = height;
        this.bodyTemperature = bodyTemperature;
        this.bloodPressure = bloodPressure;
    }
  //opperations

    public Date getDate() {
        return date;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getWeight() {
        return weight;
    }

    public String getHeight() {
        return height;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }
}
