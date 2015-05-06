import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author Marco ibañez
 * @version 1/3/5/2015
 */
public class MessagePost
{
    //nombre del usuario
    private String username;
    //mensaje del usuario
    private String message;
    //me gustas de los mensajes
    private int likes;
    //control de tiempo 
    private long  timestamp;
    //array para guardar los comentarios
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     * @param author autor del comentario
     * @param text texto que se introduce en el comentario
     */
    public MessagePost(String author,String text)
    {
        username=author;
        message=text;
        comments = new ArrayList<>();
        timestamp=System.currentTimeMillis();
        likes=0;
    }

    /**
     * metodo para aumentar en uno los likes de nuestro mensaje
     *
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * resta un like al mensaje , pero solo si existen likes en el mensaje
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
        
       
    }
    
    
    /**
     * añade un comentario al array de comentarios
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * devuelve el mensaje del post
     * @return mensaje del usuario
     */
    public String getText()
    {
        return message;
    }
    
    /**
     * tiempo de inicio del juego
     * @return devuelve el momento temporal de inicio del mensaje
     */
    public long timeStamp()
    {
         
        return timestamp;
    }
    
    /**
     * nos indica el momento temoral en el que se crea el mensaje desade el inicio del post
     */
    public void  display()
    {
       long creado = (System.currentTimeMillis()- timestamp)/1000;
       long min= creado /60;
       long seg=creado % 60;
        
        System.out.println( "\nautor del mensaje" + username + "\nmensaje: " + message+ "\nle gusta a "+ likes+
        "\ncreado hace : " + min + " min"+ seg + " seg");
    }
    
    /**
     *  tiempo en milisegundos hace que fue creado el post
     *  @return min y seg hace que fue creado el mensaje
     */
   
    public String timeString(long time)
    {
       time = System.currentTimeMillis();
       long creado = (time - timestamp)/1000;
       long min= creado /60;
       long seg=creado % 60;
       
       return "creado hace : " + min + " min " + seg+ " seg";
        
    }
}
