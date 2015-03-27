import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
 

public class PruebaURL
{
       
    public static void main(String[] args) 
    {
        try {
            // Url con la foto
            //URL url = new URL("http://www.google.com");
 
            // establecemos conexion
            URLConnection urlCon = url.openConnection();
 
            // Sacamos por pantalla el tipo de fichero
            System.out.println(urlCon.getContentType());
 
            // Se obtiene el inputStream de la foto web y se abre el fichero
            // local.
            InputStream is = url.openStream();//.getInputStream();
            FileOutputStream fos = new FileOutputStream("web.txt");
 
            // Lectura de la foto de la web y escritura en fichero local
            byte[] array = new byte[10]; // buffer temporal de lectura.
            int leido = is.read(array);
           // System.out.println("Leido Out:\t"+leido);
            while (leido > 0) {
                fos.write(array, 0, leido);
//                 System.out.println("Leido In:\t"+leido);
                //for(int i=0;i<leido;i++)
// 	          //      System.out.println((char)array[i]);
                leido = is.read(array);
            }
 
            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 java.util.regex.
}