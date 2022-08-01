package com.udacity.jwdnd.c1.review.controller;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(@ModelAttribute("newMessage") ChatForm newMessage, Model model) {
        return "chat";
    }

    @PostMapping
    public String addMessage(@ModelAttribute("newMessage") ChatForm newMessage, Model model) {
        messageService.addMessage(newMessage);
        model.addAttribute("messages", messageService.getMessage());
        newMessage.setMessageText("");
        newMessage.setMessageType("");
        newMessage.setUsername("");
        return "chat";
    }

    @ModelAttribute("messageTypeOptions")
    public String[] messageTypeOptions() {
        return new String[] {"Say", "Shout", "Whisper"};
    }
}
