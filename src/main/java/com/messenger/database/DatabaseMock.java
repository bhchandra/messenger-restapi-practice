package com.messenger.database;

import com.messenger.model.Message;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MITRA
 */
public class DatabaseMock implements MessagesSource {

    private Map<Long, Message> messages;

    public DatabaseMock() {
        initMessagesData();
    }
    
    private void initMessagesData() {
        messages = new HashMap<>();
        messages.put(1L, Message.of(1L, "Mitra", LocalDate.now(), "Hello"));
        messages.put(2L, Message.of(2L, "Jim", LocalDate.now(), "Konichua"));
    }

    @Override
    public List<Message> getMessages() {
        return new ArrayList<>(messages.values());
    }

    @Override
    public Message getMessage(Long id) {
        return messages.get(id);
    }

    @Override
    public Message addMessage(Message message) {
        message.setId(messages.size() + 1L);
        return messages.put(message.getId(), message);
    }

    @Override
    public Message updateMessage(Message message) {
        return messages.put(message.getId(), message);
    }

    @Override
    public Message removeMessage(Long id) {
        return messages.remove(id);
    }

}
