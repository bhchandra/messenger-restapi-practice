package com.messenger.database;

import com.messenger.model.Message;
import java.util.List;

/**
 *
 * @author MITRA
 */
public interface MessagesSource {

    public List<Message> getMessages();

    public Message getMessage(Long id);

    public Message addMessage(Message message);

    public Message updateMessage(Message message);

    public Message removeMessage(Long id);
    
}
