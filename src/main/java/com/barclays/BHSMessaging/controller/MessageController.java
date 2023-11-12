package com.barclays.BHSMessaging.controller;

import com.barclays.BHSMessaging.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageController {

    public List<Message> getMessages() {
        List<Message> messages = new ArrayList<>();

        Message message = new Message();
        message.setContent("Spring is awesome!");
        messages.add(message);
        
        return messages;
    }

}
