package com.example.cse360project;

import java.util.ArrayList;

public class Doctor extends Account {
    private ArrayList<String> patientIds;
    private ArrayList<String> nurseIds;

    public Doctor(Information information, ArrayList<String> chatroomIds, ArrayList<String> patientIds, ArrayList<String> nurseIds) {
        super(information, chatroomIds);
        this.patientIds = patientIds;
        this.nurseIds = nurseIds;
    }

//opperations
     public Examination conductPhysicalExamination(String patientId) {
        return null;
    }

    public History viewPatientHistory(String patientId) {
        return null;
    }

    public Message sendMessage(String accountId) {
        return null;
    }
}
