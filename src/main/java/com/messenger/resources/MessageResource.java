package com.messenger.resources;

import com.messenger.model.Message;
import com.messenger.service.MessageService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author MITRA
 */
@Path("/messages")
public class MessageResource {

    private final MessageService messageService = new MessageService();


    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

}
