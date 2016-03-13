package Module;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by user on 10/03/2016.
 */
@XmlRootElement
public class message {
    private int id;
    private String msg;
    private String author;

    public message()
    {

    }

    public message(int i,String m , String a)
    {
        id = i;
        msg = m;
        author = a;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
