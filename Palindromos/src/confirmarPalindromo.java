
public class confirmarPalindromo {
	
	
	static boolean esPalindromo(String string) {
		
		 String cadena = string.replace(" ","");
		cadena = cadena.toLowerCase();
		
		StringBuilder cadenaInvertida = new StringBuilder();
		
		
		for(int i = cadena.length()-1; i>=0; i-- ) {
			cadenaInvertida.append(cadena.charAt(i));
		}
		
		
		
		
		return cadena.equals(cadenaInvertida.toString());
		
	}
	
	

}
