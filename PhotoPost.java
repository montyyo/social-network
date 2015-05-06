import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    //nombre del usuario
    private String username;
    //nombre de la foto o imagen
    private String filename;
    //pie de la foto
    private String caption;
    // incio temporal del post con la foto
    private long timestamp;
    // me gustan de la foto
    private int likes;
    // array de comentarios sobre la foto
    private ArrayList<String> comments;

    /**
     * contructor del post de las fotos
     * @param autor del post,filename nombre de la foto, caption pie de la foto
     */
    public PhotoPost(String author, String filename,String caption)
    {
        timestamp=System.currentTimeMillis();
        username = author;
        this.filename=filename;
        this.caption=caption;
        likes=0;
        comments = new ArrayList<>();
       
    }

    /**
     * añade un me gusta a la foto
     */
   public void like()
    {
        likes++;
    }
    
    /**
     * resta un me gusta al post pero solo si existen me gustan
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
        
       
    }
    
    /**
     * añade un comentario sobre la foto
     * @param text mensage del comentario
     */
    public void addComment(String text)
    {
         comments.add(text);
     }
     
     /**
      * devuelve el nobre de la fotografia
      * @return nombre de la fotografia
      */
     public String getImagenFile()
     {
        return filename;
   }
     
   /**
    * devuelve el momento temporal de inicio del post
    * @return inicio temporal 
    */

     public long timeStamp()
     {
         
        return timestamp;
     }

     /**
      * mensaje con datos sobre la foto
      */
   
    public void  display()
     {
        long creado = (System.currentTimeMillis() - timestamp)/1000;
		long min= creado/60;
		long seg = creado%60;
		System.out.println("\nAutor del mensaje " + username+
				   "\nNombre de la foto " + filename+
				   "\nTitulo de la foto " + caption+
				   "\nMe gusta " + likes+
				   "\n creado hace " + min + " minutos" + seg + " segundos");
	         for( String comment : comments)
	         {
			    System.out.println(comment);
	         }
     }
     
     //tiempo en milisegundos hace que fue creado el post
     /**
      * tiempo desde que se creo el post
      * @return mensaje con datos temporales desde el inicio de creacion del post
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
