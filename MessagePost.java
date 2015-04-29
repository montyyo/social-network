import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    
    private String username;
    private String message;
    private int likes;
    private long  timestamp ;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author,String text)
    {
        username=author;
        message=text;
        comments = new ArrayList<>();
        timestamp=System.currentTimeMillis();
        likes=0;
    }

    public void like()
    {
        likes++;
    }
    
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
        
       
    }
    
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    
    public String getText()
    {
        return message;
    }
    
    public long timeStamp()
    {
         
        return timestamp;
    }
    
    public void  display()
    {
       long creado = (System.currentTimeMillis()- timestamp)/1000;
       long min= creado /60;
       long seg=creado % 60;
        
        System.out.println( "\nautor del mensaje" + username + "\nmensaje: " + message+ "\ncreado hace : " + min + " min"+ seg + " seg");
    }
    
    //tiempo en milisegundos hace que fue creado el post
    public String timeString(long time)
    {
       time = System.currentTimeMillis();
       long creado = (time - timestamp)/1000;
       long min= creado /60;
       long seg=creado % 60;
       
       return "creado hace : " + min + " min " + seg+ " seg";
        
    }
}
