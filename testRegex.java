import java.util.regex.*;
import java.io.Console;

public class testRegex
{
// 	public static void main(String args[]) throws Exception
// 	{
      public static void main(String[] args) throws Exception
      {
	Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
	
	// compilamos el patron
	String cadena="[<.*>].*[<.*>]";//(<.*>)[^.*]</title>
 	Pattern patron = Pattern.compile(cadena);
 	Matcher matcher = patron.matcher("</title a=3,b=7>\nhola\n</title>");
 	boolean found = false;
 	while (matcher.find()) {
                console.format("I found the text" +" \"%s\" starting at " + "index %d and ending at index %d.%n", matcher.group(), matcher.start(),matcher.end());
                String resultado2 = matcher.replaceAll("_");
  		System.out.println("Resultado:\t"+resultado2);
                found = true;
            }
        if(!found)
        {
              console.format("No match found.%n");
        }
//  	if (matcher.find())
// 	{
// 		String resultado2 = matcher.replaceAll("_");
//  		System.out.println("Resultado:\t"+resultado2);
// 	}
// 	else
// 	    System.out.println("None");
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