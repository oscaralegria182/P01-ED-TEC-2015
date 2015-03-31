import java.util.regex.*;

public class testRegex
{
// 	public static void main(String args[]) throws Exception
// 	{
      public static void main(String[] args) throws Exception
      {
	// compilamos el patron
	String cadena="(<.*>)[^.*]</title>";//[\\<][ca-z][\\>]";
 	Pattern patron = Pattern.compile(cadena);
 	// creamos el Matcher a pa(rtir del patron, la cadena como parametro
 	Matcher encaja = patron.matcher("<title> hola </title>");
 	// invocamos el metodo replaceAll
 	if (encaja.find())
	{
		String resultado2 = encaja.replaceAll("_");
 		System.out.println("Resultado:\t"+resultado2);
	}
	else
	    System.out.println("None");
	/*ing input = "www.?regular.com";
	  // comprueba que no empieze por punto o @
	  Pattern p = Pattern.compile("^.|^@");
	  Matcher m = p.matcher(input);
	  if (m.find())
	    System.err.println("Las direcciones email no empiezan por punto o @");
	    
	  // comprueba que no empieze por www.
	  p = Pattern.compile("^www.");
	  m = p.matcher(input);
	  if (m.find())
	    System.out.println("Los emails no empiezan por www");

	  // comprueba que contenga @
	  p = Pattern.compile("@");
	  m = p.matcher(input);
	  if (!m.find())
	    System.out.println("La cadena no tiene arroba");
	    
	  // comprueba que no contenga caracteres prohibidos	
	  p = Pattern.compile("[^A-Za-z0-9.@_-~#]+");
	  m = p.matcher(input);
	  StringBuffer sb = new StringBuffer();
	  boolean resultado = m.find();
	  boolean caracteresIlegales = false;

	  while(resultado) {
	    caracteresIlegales = true;
	    m.appendReplacement(sb, "");
	    resultado = m.find();
	  }

	  // Añade el ultimo segmento de la entrada a la cadena
	  m.appendTail(sb);

	  input = sb.toString();

	  if (caracteresIlegales) {
	    System.out.println("La cadena contiene caracteres ilegales");
	  }*/
      }
}