package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<ChatMessage> chatHistory;

    @PostConstruct
    void postConstruct() {
        this.chatHistory = new ArrayList<>();
        return;
    }

    public void addMessage(ChatForm messageForm) {
        String username = messageForm.getUsername();
        String messageText = messageForm.getMessageText();
        switch (messageForm.getMessageType()) {
            case ("Shout"):
                messageText = messageText.toUpperCase();
                break;
            case ("Whisper"):
                messageText = messageText.toLowerCase();
                break;
        }

        chatHistory.add(new ChatMessage(username, messageText));
        return;
    }

    public List<ChatMessage> getMessage() {
        return chatHistory;
    }
}
