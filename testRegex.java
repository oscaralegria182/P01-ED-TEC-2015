import java.util.regex.*;

public class testRegex
{
	public static void main(String args[])
	{
		// compilamos el patron
		Pattern patron = Pattern.compile("<>");
		// creamos el Matcher a partir del patron, la cadena como parametro
		Matcher encaja = patron.matcher("<div a=6> hola <div>");
		// invocamos el metodo replaceAll
		String resultado = encaja.replaceAll(" ");
		System.out.println(resultado);
	}
}