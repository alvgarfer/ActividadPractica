
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainLibro
{
	public static void mostrar () throws Throwable
	{
		XMLReader reader = 
		XMLReaderFactory.createXMLReader();
		
		LeerLibro parserLibro = null;
		parserLibro = new LeerLibro();
		
		reader.setContentHandler(parserLibro);
		
		reader.parse
		(new InputSource
				(new FileInputStream("C:/libros.xml")));
	}
	
	public static void main(String[] args) throws SAXException
	{		
		System.out.println ("*** HashMap con Objetos y como Clave un String ***");
		Map <String, Libros> libros = new HashMap <String, Libros>();
			
		libros.put("El Ocho", new Libros("978-84-8346-520-2", "El Ocho", "Katherine Neville", "1988", "Ballantine Books"));
		libros.put("Qumran", new Libros("84-226-6765-7", "Qumran", "Eliette Abecasis", "1997", "Ediciones B"));
		libros.put("Memorias de Idhun I - La Resistencia", new Libros("84-675-069-X", "Memorias de Idhun I - La Resistencia", "Laura Gallego García", "2005", "Ediciones SM"));
	
		try
		{
			mostrar();
		} 
			catch (Throwable e)
		{
			e.printStackTrace();
		}
	} 
}
