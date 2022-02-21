package view;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor 1"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor 2"));
		double soma = valor1 + valor2;
		JOptionPane.showMessageDialog(null, valor1 + " + " + valor2 + " = " + soma);
	}
}
