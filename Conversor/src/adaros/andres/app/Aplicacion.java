package adaros.andres.app;

import adaros.andres.igu.*;

public class Aplicacion extends InterfazGrafica {
	
	InterfazGrafica pantalla;
	String[] listaTipoConversion = {"Moneda", "Velocidad", "Peso"};
	
	String[] listasMoneda = {"Peso Chileno", "Dólar", "Euro", "Libra Esterlina", 
									"Yen Japonés", "Won Sul-coreano"};
	
	String[] listaVelocidad = {"Kilometros/hora", "Millas/hora", "Yarda/hora"};
	String[] listaPeso = {"Kilogramo", "Libra", "Onza"};
	
	/*Constructor de clase*/
	public Aplicacion(){
		/*Instanciando la interfáz gráfica*/
		pantalla = new InterfazGrafica();
		pantalla.setVisible(true);	
		
		/*set comboBox tipoConversion*/
		pantalla.setListaTipoConversion(listaTipoConversion);
		pantalla.datosListas(listasMoneda, listaVelocidad, listaPeso);
	}
	
}
