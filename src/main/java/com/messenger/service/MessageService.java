package com.messenger.service;

import com.messenger.database.DatabaseMock;
import com.messenger.database.MessagesSource;
import com.messenger.model.Message;
import java.util.List;

/**
 *
 * @author MITRA
 */
public class MessageService {

    private final MessagesSource messagesSource;

    public MessageService(){
        messagesSource = new DatabaseMock();
    }
    
    public List<Message> getAllMessages() {
        return messagesSource.getMessages();
    }

    public Message getMessage(Long id) {
        return messagesSource.getMessage(id);
    }

    public Message addMessage(Message message) {
        return messagesSource.addMessage(message);
    }

    public Message updateMessage(Message message) {
        if (message.getId() < 0) {
            throw new IllegalArgumentException("The Message ID is invalid");
        }
        return messagesSource.updateMessage(message);
    }
    
    public Message removeMessage(Long id){
        return messagesSource.removeMessage(id);
    }

}
