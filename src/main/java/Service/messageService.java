package Service;

import Module.message;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/03/2016.
 */

public class messageService {

    public static  List<message> rep = new ArrayList<>();
    public static  int NO = 1;
    public List<message> getMessages()
    {
        return  rep;
    }

    public message getMessage(int id)
    {
        for (message m:rep ) {
            if(m.getId() == id)
                return m;
        }
        return  null;
    }

    public void addMessage(message m)
    {
        m.setId(NO++);
        rep.add(m);
    }

    public void updateMessage(message ms)
    {
        message msgToDelete = null;
        for (message m:rep ) {
            if(m.getId() == ms.getId())
                msgToDelete = m ;

        }
        rep.remove(msgToDelete);
        rep.add(ms);
    }

    public void deleteMessage(int id)
    {
        message msgToDelete = null;
        for (message m:rep ) {
            if(m.getId() == id)
                msgToDelete = m;
        }
       rep.remove(msgToDelete);
    }


}
