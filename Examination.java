package com.example.cse360project;

import java.util.ArrayList;
import java.util.Date;

public class  Examination {
    private String patientId;
    private Date date;
    private ArrayList<Note> doctorNotes;
    private ArrayList<Note> nurseNotes;

    public Examination(String patientId, Date date, ArrayList<Note> doctorNotes, ArrayList<Note> nurseNotes) {
        this.patientId = patientId;
        this.date = date;
        this.doctorNotes = doctorNotes;
        this.nurseNotes = nurseNotes;
    }
  //opperations

    public String getPatientId() {
        return patientId;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Note> getDoctorNotes() {
        return doctorNotes;
    }

    public ArrayList<Note> getNurseNotes() {
        return nurseNotes;
    }
}
