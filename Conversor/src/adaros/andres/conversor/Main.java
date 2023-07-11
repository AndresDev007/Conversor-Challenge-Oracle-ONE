package adaros.andres.conversor;

import adaros.andres.ventanas.*;

public class Main {

	public static void main(String[] args) {
		
		Ventanas eleccion = new Ventanas(); //Creando instancia de todas las ventanas
		String seleccion = eleccion.ventanaSeleccion(); //Extrayendo el resultado de el tipo de conversión

		if (seleccion == "moneda") { //Si el usuario elige moneda
			String monedaOrigen = eleccion.ventanaMonedaOrigen(); //Moneda de origen seleccionada
			String monedaDestino = eleccion.ventanaMonedaDestino(); // Moneda de destino seleccionada
			double valor = eleccion.ventanaValor(); //Obteniendo el valor ingresado por el usuario
			
			if (valor == 0) {
				eleccion.ventanaError(); //llamamos a la ventana error si el caracter ingresado no corresponde a un double mayor a cero
			}else {
				Conversor conversor = new Conversor(seleccion, monedaOrigen, monedaDestino, valor); //Instancia al conversor
				conversor.resultadoMoneda(); //Realiza la operación de conversión
				conversor.ventanaResultado(); // Muestra el resultado de la conversión en una ventana
			}
			

		}
		
		
		
		/*------------------------------------- PENDIENTES*/
		if (seleccion == "temperatura") {
			System.out.println("Seleccionaste temperatura!");
		}
		
		if (seleccion == "presión") {	
			System.out.println("Seleccionaste presión!");
		}
	}

}
