package adaros.andres.app;

import adaros.andres.igu.*;

public class Aplicacion extends InterfazGrafica {
	
	InterfazGrafica pantalla;
	String[] listaTipoConversion = {"Moneda", "Temperatura", "Presión"};
	
	/*Constructor de clase*/
	public Aplicacion(){
		/*Instanciando la interfáz gráfica*/
		pantalla = new InterfazGrafica();
		pantalla.setVisible(true);	
		
		/*set comboBox tipoConversion*/
		pantalla.setListaTipoConversion(listaTipoConversion);
	}
	

	
	
//	Object[] tiposMonedas = {"Peso Chileno", "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano"}; // Opciones tipos de monedas para convertir
//	
//	/*
//	 * EN DESARROLLO
//	 */
//	Object[] tiposTemperatura = {"Celsius", "Fahrenheit", "Kelvin"};
	/*************************************************************/
	
	
//	public String ventanaSeleccion(){ //ventana de eleccion de tipo de conversión
//				
//		String eleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversión",
//				"Conversor", JOptionPane.PLAIN_MESSAGE,
//				null, opciones,"moneda");	
//		return eleccion;
//	};
//	
//	
//	
//	public String ventanaMonedaOrigen(){ //ventana elección del tipo de moneda de origen
//		
//		String eleccion = (String) JOptionPane.showInputDialog(null, "Selecciona moneda de origen",
//				"Conversor de moneda", JOptionPane.PLAIN_MESSAGE,
//				null, tiposMonedas,"Peso Chileno");	
//		return eleccion;
//	};
//	
//	public String ventanaMonedaDestino(){ // Ventana de elección del tipo de moneda de destino
//		
//		String eleccion = (String) JOptionPane.showInputDialog(null, "Selecciona moneda para convertir",
//				"Conversor de moneda", JOptionPane.PLAIN_MESSAGE,
//				null, tiposMonedas, "Dólar");	
//		return eleccion;
//	};
//	
//	public double ventanaValor(){ // Ventana para ingresar el valor numérico a convertir
//		
//		try {
//			double valor = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa el valor a convertir",
//					"Conversor de moneda", JOptionPane.PLAIN_MESSAGE,
//					null, null, null)); 
//			if (valor < 0) {
//				return 0;
//			}
//			return valor;
//			
//		} catch (Exception NumberFormatException) { //Atrapamos el error en caso que el valor no sea de tipo Double
//			return 0;
//		}
//
//	};
//	
//	/*
//	 * CODIGO REUTILIZABLE
//	 * */
//	public void ventanaError() { //Ventana de error si se ingresan valores que no sean números o valores menores a 0
//		JOptionPane.showMessageDialog(null,
//				"Solo se permiten valores numéricos y mayores a cero!",
//				"Error", JOptionPane.ERROR_MESSAGE); 
//	}
//	
//	public int ventanaContinuar() {		
//		int continuar = JOptionPane.showConfirmDialog(
//			    null,
//			    "¿Realizar otra conversión?",
//			    "Continuar?",
//			    JOptionPane.YES_NO_OPTION);
//		return continuar;
//	}	
	
}