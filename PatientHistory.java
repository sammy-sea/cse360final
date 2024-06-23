package com.example.cse360project;

import java.util.ArrayList;

public class History {
    private String patientId;
    private ArrayList<Examination> examinations;
    public ArrayList<Vitals> vitals;

    public History(String patientId, ArrayList<Examination> examinations) {
        this.patientId = patientId;
        this.examinations = examinations;
        this.vitals = vitals;
    }
//opperations
    public String getPatientId() {
        return patientId;
    }

    public ArrayList<Examination> getExaminations() {
        return examinations;
    }

    public ArrayList<Vitals> getVitals() {
        return vitals;
    }
}
