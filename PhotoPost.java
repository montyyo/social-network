import java.util.ArrayList;

public class PhotoPost extends Post
{
	
	private String filename;
	private String caption;
	

	/**
	 * Constructor de la clase PhotoPost
	 *
	 * @param author el nombre de usuario que crea el post
	 * @param filename el nombre del archivo de la foto
	 * @param caption el título asociado a la foto
	 *
	 **/
	public PhotoPost(String author, String filename, String caption)
	{
		super(author);
		this.filename = filename;
		this.caption = caption;
		
	}

	

	/**
	 * Devuelve el nombre del archivo de la imagen
	 *
	 * @return filename el nombre del archivo de imagen del post
	 **/
	public String getImageFilename()
	{
		return filename;
	}

	/**
	 * Devuelve el titulo asociado a la imagen
	 * 
	 * @return caption el título asociado a la imagen
	 **/
	 public String getCaption()
	 {
	 	return caption;
	 }

	

	/**
	* Muestra por pantalla los datos del post
	*
	*/
	public void display()
	{
		
		System.out.println("Nombre de la foto " + filename);
		System.out.println("Titulo de la foto " + caption);
		super.display();
	}

	
}












