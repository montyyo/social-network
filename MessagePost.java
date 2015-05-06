import java.util.ArrayList;

public class MessagePost
{
	private String username;
	private String message;
	private long timestamp;
	private int likes;
	private ArrayList<String> comments;

	/**
	 * Constructor de la clase MessagePost
	 *
	 * @param author el nombre de usuario que crea el post
	 * @param text el mensaje del post
	 *
	 **/
	public MessagePost(String author, String text)
	{
		this.username = author;
		this.message = text;
		this.timestamp = System.currentTimeMillis();
		this.likes = 0;
		comments = new ArrayList<>();
	}

	/**
	 * Aumenta el contador de likes en uno
	 */
	 public void like()
	 {
	 	likes++;
	 }

	 /**
	  * Disminuye el contador de likes en uno. Si ya es cero no hace nada.
	  */
	  public void unlike()
	  {
	  	if(likes > 0)
	  	{
	  		likes--;
	  	}
	  }

	/**
	 * Agrega comentarios a los post publicados
	 * 
	 * @param text El comentario que agregar al post
 	 */
	public void addComment(String text){
		comments.add(text);
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

	/**
	 * Devuelve el tiempo que ha pasado en milisegundos desde el 1 de enero
	 * de 1970 hasta que se creo el post
	 *
	 * @return el tiempo desde el 1 de enero de 1970 hasta que se creo el post.
	 */
	 public long getTimeStamp()
     {
		return timestamp;
     }

	/*
	* Muestra por pantalla los datos del post
	*
	*/
	public void display()
	{
		System.out.println("Autor del mensaje " + username);
		System.out.println("Mensaje " + message);
		System.out.println("Me gusta " + likes);
		System.out.println(timeString(System.currentTimeMillis()));
		if(comments.size() == 0)
		{
			System.out.println( "No hay comentarios aun para este post");
		}
		else
		{		   			   
	         for( String comment : comments)
	         {
			System.out.println(comment);
	         }
	        }
	}

	/**
     	* Devuelve el tiempo en string
     	*
     	* @param tiempo actual en milisegundos.
     	* @return informacion en min y segundos del tiempo que ha transcurrido 
     	*          desde que subimos la foto hasta ahora.
     	*/
    	private String timeString(long time){
		    long diferencia = time - timestamp;
		    int segundos = (int)diferencia/1000;
		    int minutos = segundos/60;
		    int horas = minutos/60;
		    minutos -= horas*60;
		    segundos -= minutos*60;
		    
		    String tiempo = " ";
		    if(horas != 0)
		    {
		        tiempo += horas + " horas ";
		    }
		    if(minutos != 0)
		    {
		        tiempo += minutos + " minutos ";
		    }
		    tiempo += segundos + " segundos ";
		    return tiempo;        
    	}
}







