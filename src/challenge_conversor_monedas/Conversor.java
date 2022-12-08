package challenge_conversor_monedas;

import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conversor {

	private static final DecimalFormat df = new DecimalFormat("#.00");
	public static void main(String[] args) {
	
		//declaración de variables
		double entrada = 0;
		Object opcionSeleccionada;
		int deseaContinuar;
		double conversion=0;
	
		do {
			
			//Conversión a double
			entrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir."));
			
			if (entrada > 0) {
				
				Object [] tipoConversionMoneda = {
					"Dólar a euro",	
					"Dólar a libras esterlinas",
					"Dólar a yen japonés",
					"Dólar a won surcoreano",
					"Euro a dólar",
					"Libras esterlinas a dólar",
					"Yen japonés a dólar",
					"Won surcoreano a dólar"
				};
				
				opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona el tipo de conversión", "Tipo de conversión",JOptionPane.QUESTION_MESSAGE,null, tipoConversionMoneda, tipoConversionMoneda[0]);
				//De moneda local a extranjera
				if (opcionSeleccionada.toString()=="Dólar a euro"){
					conversion = entrada*0.95;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " euros.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
					}
				else if (opcionSeleccionada.toString()=="Dólar a libras esterlinas") {
					conversion = entrada*0.82;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " libras esterlinas.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (opcionSeleccionada.toString()=="Dólar a yen japonés") {
					conversion = entrada*136.84	;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " yen japonés.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (opcionSeleccionada.toString()=="Dólar a won surcoreano") {
					conversion = entrada*1320.96;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " won surcoreano.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				//De moneda extranjera a local
				else if (opcionSeleccionada.toString()=="Euro a dólar") {
					conversion = entrada*1.05;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (opcionSeleccionada.toString()=="Libras esterlinas a dólar") {
					conversion = entrada*1.22;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (opcionSeleccionada.toString()=="Yen japonés a dólar") {
					conversion = entrada*0.0073;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (opcionSeleccionada.toString()=="Won surcoreano a dólar") {
					conversion = entrada*0.00076;
					JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Debes ingresar un valor mayor a cero.", "Aviso",JOptionPane.WARNING_MESSAGE);
			}
			
			deseaContinuar = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		} 
		
		while(deseaContinuar==0);
		

	}

}
