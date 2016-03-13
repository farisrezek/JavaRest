package resources;

import Module.message;
import Service.messageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/03/2016.
 */
@Path("/messages")
public class messageResources {


    messageService msgService = new messageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<message> getMessage()
    {
        return  msgService.getMessages();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public message getMessage(@PathParam("id") int id)
    {
        return  msgService.getMessage(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addMessage(message m)
    {
       msgService.addMessage(m);
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateMessage(message m,@PathParam("id") int id)
    {
        m.setId(id);
        msgService.updateMessage(m);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("id") int id)
    {
        msgService.deleteMessage(id);
    }
}
