package com.example.cse360project;

import java.util.ArrayList;
import java.util.Date;

public class  Examination {
    private String patientId;
    private Date date;


    public Examination(String patientId, Date date) {
        this.patientId = patientId;
        this.date = date;

    }
  //opperations

    public String getPatientId() {
        return patientId;
    }

    public Date getDate() {
        return date;
    }

}
