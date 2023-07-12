package adaros.andres.conversor;

import adaros.andres.ventanas.*;

public class Main {

	public static void main(String[] args) {
		
		boolean permisivo = false;
		
		do {
			Ventanas eleccion = new Ventanas(); //Creando instancia de todas las ventanas del objeto Ventanas
			String seleccion = eleccion.ventanaSeleccion(); //Extrayendo el resultado del tipo de conversión
			if (seleccion == null) { // Si no se selecciona ningún tipo de conversión sale del programa
				break;
			}
			if (seleccion == "moneda") { //Si el usuario elige moneda
				String monedaOrigen = eleccion.ventanaMonedaOrigen(); //Moneda de origen seleccionada
				if (monedaOrigen == null) { // Si no se ingresa una opción en la moneda de origen sale del programa
					break;
				}
				String monedaDestino = eleccion.ventanaMonedaDestino(); // Moneda de destino seleccionada
				if (monedaDestino == null) { // Si no se ingresa una moneda de destino sale del programa
					break;
				}
				double valor = eleccion.ventanaValor(); //Obteniendo el valor ingresado por el usuario
				if (valor == 0) {
					eleccion.ventanaError(); //llamamos a la ventana error si el caracter ingresado no corresponde a un double mayor a cero
					int continuar = eleccion.ventanaContinuar(); // Ventana de consulta de realizar otra conversión
					if (continuar == 0) { // Si la respuesta de la vantana continuar es "si" vuelve a ejecutar el programa
						permisivo = true; //Permite seguir ejecutando el programa
					}else {
						permisivo = false; //No se vuelve a ejecutar el programa
					}
				}else {
					Conversor conversor = new Conversor(seleccion, monedaOrigen, monedaDestino, valor); //Instancia al conversor
					conversor.resultadoMoneda(); //Realiza la operación de conversión
					conversor.ventanaResultado(); // Muestra el resultado de la conversión en una ventana
					int continuar = eleccion.ventanaContinuar(); // Ventana de consulta de realizar otra conversión
					if (continuar == 0) {// Si la respuesta de la vantana continuar es "si" vuelve a ejecutar el programa
						permisivo = true;//Permite seguir ejecutando el programa
					}else {
						permisivo = false;//No se vuelve a ejecutar el programa
					}
				}
			}
		} while (permisivo);
		
	}

}
