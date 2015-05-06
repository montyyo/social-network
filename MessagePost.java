import java.util.ArrayList;

public class MessagePost extends Post
{
    
    private String message;
    

    /**
     * Constructor de la clase MessagePost
     *
     * @param author el nombre de usuario que crea el post
     * @param text el mensaje del post
     *
     **/
    public MessagePost(String author, String text)
    {
        super(author);
        this.message = text;
        
        
        
    }

    /**
     * Devuelve el texto del post
     *
     * @return el texto del post
     **/
    public String getText()
    {
        return message;
    }

    /*
    * Muestra por pantalla los datos del post
    *
    */
    public void display()
    {
        
        System.out.println("Mensaje " + message);
        super.display();
        
    }

    /**
     * metodo para imprimir un mensaje de creacion de post
     */
    public void printShortSummary()
    {
        String name = super.getUserName();
       System.out.println("Esto es un post de texto creado por " + name + 
                           "donde " + name + " es el autor del post y consigue que funcione");
    }
}







