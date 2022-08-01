package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    private String username;
    private String messageText;

    public ChatMessage(String username, String messageText) {
        this.username = username;
        this.messageText = messageText;
        return;
    }

    public String getUsername() {
        return username;
    }

    public String getMessageText() {
        return messageText;
    }
}
