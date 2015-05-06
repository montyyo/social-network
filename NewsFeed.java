import java.util.ArrayList;

public class NewsFeed
{
	private ArrayList<MessagePost> messages;
	private ArrayList<PhotoPost> photos;

	/**
	 * Constructor de la clase NewsFeed
	 *
	 **/
	public NewsFeed(){
		messages = new ArrayList<>();
		photos 	= new ArrayList<>();
   }
   
   /**
    * Añade un post de texto al muro.
    *
    * @param message el post de texto a añadir al muro
    **/
   public void addMessagePost(MessagePost message)
   {
   	messages.add(message);
   }

	/**
	* Añade una post de foto al muro
	* 
	* @param post el post de foto a añadir al muro
	**/
	public void addPhotoPost(PhotoPost post)
	{
		photos.add(post);
	}

	/**
	* Mostramos el tablon
	*/
	public void show(){
		for (MessagePost mensaje: messages)
		{
		    mensaje.display();
		}
		
		for (PhotoPost foto: photos)
		{
		    foto.display();
		}
	}
}









