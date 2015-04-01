import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.*;
import java.io.Console;


public class testURL_Regex
{
       
    public static void main(String[] args) 
    {
        Console console = System.console();
        try {
            // Url con la foto
            URL url = new URL("http://www.ucr.ac.cr");
	    URLConnection urlCon = url.openConnection();
	    System.out.println(urlCon.getContentType());
	    
	    InputStream is = url.openStream();//.getInputStream();
            FileOutputStream fos = new FileOutputStream("web.txt");
 
            byte[] array = new byte[10000]; // buffer temporal de lectura.
            int leido = is.read(array);
            //String temp = new String(array);
            //System.out.println(temp);
           // System.out.println("Leido Out:\t"+leido);
            while (leido > 0) 
            {
                
                String temp = new String(array);
                //System.out.println(temp);
                String cadena="[<.*>].*[<.*>]";//(<.*>)[^.*]</title>
		Pattern patron = Pattern.compile(cadena);
		String resultado2="";
		Matcher matcher = patron.matcher(temp);
		boolean found = false;
		while (matcher.find()) 
		{
		 
		 //console.format("I found the text" +" \"%s\" starting at " + "index %d and ending at index %d.%n", matcher.group(), matcher.start(),matcher.end());
		 resultado2 = matcher.replaceAll("");
		  System.out.println("Resultado:\t"+resultado2);
		  found = true;
		 }
		 
		 //char[] array2 = resultado.toCharArray();
		 
		 fos.write(resultado2.getBytes(), 0,resultado2.getBytes().length);
		 
		 leido = is.read(array);
	  if(!found)
	  {
		console.format("No match found.%n");
	  }
		  
	      }
  
	      // cierre de conexion y fichero.
	      is.close();
	      fos.close();
	  } catch (Exception e) {
	      e.printStackTrace();
	  }
    }
}