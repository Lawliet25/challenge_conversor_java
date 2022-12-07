package challenge_conversor_monedas;

import javax.swing.*;

public class Conversor {

	public static void main(String[] args) {
	
		//declaración de variables
		double entrada = 0;
		Object opcionSeleccionada;
		
		//Conversión a double
		entrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir."));
		
		if (entrada > 0) {
			
			Object [] tipoConversion = {
				"Dolar a euro",	
				"Libras esterlinas",
				"Yen japonés",
				"Won surcoreano"
			};
			
			opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona el tipo de conversión", "Tipo de conversión",JOptionPane.QUESTION_MESSAGE,null, tipoConversion, tipoConversion[0]);

			
		}else {
			JOptionPane.showMessageDialog(null, "Debes ingresar un valor mayor a cero.", "Warning",JOptionPane.WARNING_MESSAGE);
		}
		
		
		
		
		
		
		
		//do {
			
			
			
		//} while(a<b);

	}

}
