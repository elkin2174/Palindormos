import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Inserte un posible palindromo");
		
		new confirmarPalindromo();
		
		if(confirmarPalindromo.esPalindromo(texto)) {
			
			JOptionPane.showMessageDialog(null, texto + " es palindromo", texto, 1);
		}else {
			JOptionPane.showMessageDialog(null, texto + " NO palindromo", texto, 0);

		}
		
		
		

		
		
	}

}
