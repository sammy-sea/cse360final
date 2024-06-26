package com.example.cse360project;

import java.util.ArrayList;

public 
class Patient extends Account {
    private String insuranceNumber;
    private String pharmacy;
    private String doctorId;
    private ArrayList<String> nurseIds;
    private History history;

    public Patient(Information information, ArrayList<String> chatroomIds, String insuranceNumber, String pharmacy, String doctorId, ArrayList<String> nurseIds, History history) {
        super(information, chatroomIds);
        this.insuranceNumber = insuranceNumber;
        this.pharmacy = pharmacy;
        this.doctorId = doctorId;
        this.nurseIds = nurseIds;
        this.history = history;
    }

    // Operations
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public ArrayList<String> getNurseIds() {
        return nurseIds;
    }

    public Message sendMessage(String accountId) {
        // Implementation
        return null;
    }

    public ArrayList<Examination> viewExaminationHistory() {
        // Implementation
        return null;
    }

    public Examination getExamination(String examinationId) {
        // Implementation
        return null;
    }
}
