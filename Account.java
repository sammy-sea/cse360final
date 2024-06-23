package com.example.cse360project;

import java.util.ArrayList;

public class Account {
    private Information information;
    private ArrayList<String> chatroomIds;

    public Account(Information information, ArrayList<String> chatroomIds) {
        this.information = information;
        this.chatroomIds = chatroomIds;
    }

    public Information getInformation() {
        return information;
    }

    public ArrayList<String> getChatroomIds() {
        return chatroomIds;
    }
