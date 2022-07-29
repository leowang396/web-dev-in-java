package com.udacity.jwdnd.c1.review.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {
    private String message;

    MessageService(String message) {
        this.message = message;
    }

    public String uppercase() {
        return message.toUpperCase();
    }

    public String lowercase() {
        return message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("MessageService initialized!");
    }
}
