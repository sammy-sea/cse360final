package com.example.cse360project;

import java.util.ArrayList;

public class Nurse extends Account {
    private ArrayList<String> doctorIds;
    private ArrayList<String> patientIds;

    public Nurse(Information information, ArrayList<String> chatroomIds, ArrayList<String> doctorIds, ArrayList<String> patientIds) {
        super(information, chatroomIds);
        this.doctorIds = doctorIds;
        this.patientIds = patientIds;
    }

    // Operations
    public Vitals recordVitals(String patientId) {
        return null;
    }

    public History viewPatientHistory(String patientId) {
        return null;
    }

    public Examination conductPhysicalExamination(String patientId) {
        return null;
    }

    public Message sendMessage(String accountId) {
        return null;
    }
}
