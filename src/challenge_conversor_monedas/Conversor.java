package challenge_conversor_monedas;

import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conversor {

	private static final DecimalFormat df = new DecimalFormat("#.00");
	public static void main(String[] args) {

		//declaración de variables
		double entrada = 0;
		int deseaContinuar;
		double conversion=0;
		Object opcionSeleccionada;
		Object opcionSeleccionadaInicial;

		Object [] tiposConversiones = {
				"Convertidor de monedas",	
				"Convertidor de temperatura",
		};

		try {
			do {

				opcionSeleccionadaInicial = JOptionPane.showInputDialog(null,"Selecciona el tipo de conversión", "Tipo de conversión",JOptionPane.QUESTION_MESSAGE,null, tiposConversiones, tiposConversiones[0]);

				if (opcionSeleccionadaInicial.toString()=="Convertidor de monedas") {

					try {
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
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: €" + df.format(conversion) + " euros.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Dólar a libras esterlinas") {
								conversion = entrada*0.82;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: £" + df.format(conversion) + " libras esterlinas.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Dólar a yen japonés") {
								conversion = entrada*136.84	;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: ¥" + df.format(conversion) + " yen japonés.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Dólar a won surcoreano") {
								conversion = entrada*1320.96;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: ₩" + df.format(conversion) + " won surcoreano.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							//De moneda extranjera a local
							else if (opcionSeleccionada.toString()=="Euro a dólar") {
								conversion = entrada*1.05;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: $" + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Libras esterlinas a dólar") {
								conversion = entrada*1.22;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: $" + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Yen japonés a dólar") {
								conversion = entrada*0.0073;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: $" + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Won surcoreano a dólar") {
								conversion = entrada*0.00076;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: $" + df.format(conversion) + " dólares.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}							
						}
						else {
							JOptionPane.showMessageDialog(null, "Debes ingresar un valor numérico mayor a cero.", "Aviso",JOptionPane.ERROR_MESSAGE);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "No están permitidas las letras ni valores vacíos.", "Aviso",JOptionPane.ERROR_MESSAGE);
					}

				} 
				//Convertidor de temperatura
				if (opcionSeleccionadaInicial.toString()=="Convertidor de temperatura") {

					try {
						entrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura a convertir."));

						if (entrada<=0 || entrada>0) {

							Object [] tipoConversionTemperatura = {
									"Celcius a Farenheit",	
									"Celcius a Kelvin",
									"Farenheit a Celcius",
									"Farenheit a Kelvin",
									"Kelvin a Celcius",
									"Kelvin a Farenheit",
							};
							opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona el tipo de conversión", "Tipo de conversión",JOptionPane.QUESTION_MESSAGE,null, tipoConversionTemperatura, tipoConversionTemperatura[0]);
							//De Celcius a Farenheit y Kelvin
							if (opcionSeleccionada.toString()=="Celcius a Farenheit"){
								conversion = (entrada*1.8)+32;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " grados Farenheit.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Celcius a Kelvin"){
								conversion = entrada+273.15;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " Kelvin.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							//De Farenheit a Celcius y Kelvin
							else if (opcionSeleccionada.toString()=="Farenheit a Celcius"){
								conversion = (entrada-32)/(1.8);
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " grados Celcius.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Farenheit a Kelvin"){
								conversion = ((entrada-32)*5/9)+273.15;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " Kelvin.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							//De Kelvin a Celcius y Farenheit
							else if (opcionSeleccionada.toString()=="Kelvin a Celcius"){
								conversion = entrada-273.15;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " grados Celcius.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
							else if (opcionSeleccionada.toString()=="Kelvin a Farenheit"){
								conversion = (entrada-273.15)*9/5+32;
								JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + df.format(conversion) + " grados Farenheit.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
							}
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "No están permitidas las letras ni valores vacíos.", "Aviso",JOptionPane.ERROR_MESSAGE);
					}

				}

				deseaContinuar = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (deseaContinuar!=0) {
					JOptionPane.showMessageDialog(null, "Programa finalizado. ","Aviso",JOptionPane.WARNING_MESSAGE);
					break;
				}
			}while(deseaContinuar==0);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Programa finalizado. ","Aviso",JOptionPane.WARNING_MESSAGE);
		}
	}
}


