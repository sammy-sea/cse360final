package com.example.cse360project;

import java.util.Date;

public class Message {
    private String senderId;
    private String receiverId;
    private Date date;
    private String content;

    public Message(String senderId, String receiverId, Date date, String content) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.date = date;
        this.content = content;
    }
  //opperations

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public Date getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}
