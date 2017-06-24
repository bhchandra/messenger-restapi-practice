package com.messenger.service;

import com.messenger.model.Message;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MITRA
 */
public class MessageService {

    public List<Message> getAllMessages() {

        Message m1 = Message.of(1L, "Mitra", LocalDate.now(), "Hello");
        Message m2 = Message.of(2L, "Jim", LocalDate.now(), "Konichua");

        return new ArrayList<>(Arrays.asList(m1, m2));
    }

}
