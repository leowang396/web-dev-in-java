package com.udacity.jwdnd.c1.review.model;

// Form-backing object for ChatController.
public class ChatForm {
    private String username;
    private String messageText;
    private String messageType;

    public String getUsername() {
        return this.username;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
