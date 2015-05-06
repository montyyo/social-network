import java.util.ArrayList;
/**
 * 
 * 
 * @author (marco 
 * @version (1
 */
public class NewsFeed
{
    //array de objetos que contiene mensajes del post
    private ArrayList<MessagePost> messages;
    // array de objetos que contiene datos de las fotografias
    private ArrayList<PhotoPost> photos;
    /**
     * Constructor de portal de mensajes y fotos
     * 
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * añadimos un mensaje al array 
     * @param mensaje de un usuario al post
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * añadimos una foto al post
     * @param foto al post
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }

    /**
     * nos muestra los mensajes 
     */
    public void show()
    {
        //para cada elemento photos se crea una var local tipo photopost llamada photo
        // ejecutamos el cuerpo del bucle.que invoca el metodo display

        //Este tipo de bucle puede recorrer cualquier clase que implemente la interfaz Iterable<E>.
        for (PhotoPost photo: photos)
        {
            photo.display();  
        }

        for (MessagePost message: messages)
        {
            message.display();
        }

    }

}
