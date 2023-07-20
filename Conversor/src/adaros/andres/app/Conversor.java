package adaros.andres.app;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
	
	//variables internas
	private String tipoConversion; 
	private String origen;
	private String destino;
	private double valor;
	private double resultado;
	
	//Valor de conversión de peso chileno a otra moneda
	private double dolar;
	private double pesoChileno;
	private double euros;
	private double librasEsterlinas; /*Revisar como actualizar en tiempo real*/
	private double yenJapones;
	private double wonSulCoreano;
	
	
	/**
	 * Constructor de clase
	 * @param tipoConversion
	 * @param origen
	 * @param destino
	 * @param valor
	 */
	public Conversor(String tipoConversion, String origen, String destino, double valor) {
		this.tipoConversion = tipoConversion;
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}
	
	
	public double resultadoMoneda() { //calculando el resultado con ayuda de un diccionario
		Map<String, Double> diccionarioMonedas = new HashMap<String, Double>(); //Declarando un diccionario
		
		switch (this.origen) { //Si el origen de la moneda coincide con "Peso Chileno" asigne los siguientes valores de conversión equivalentes a 1 peso chileno
			case "Peso Chileno": {
				this.dolar = 0.0012; // = 1 peso chileno
				this.pesoChileno = 1; // = 1 peso chileno
				this.euros = 0.0011; // = 1 peso chileno
				this.librasEsterlinas = 0.00096; // = 1 peso chileno
				this.yenJapones = 0.1730; // = 1 peso chileno
				this.wonSulCoreano = 1.5904; // = 1 peso chileno
				break;
			}
			case "Dólar": {  //Misma lógica que arriba pero con la moneda de origen Dólar
				this.dolar = 1;
				this.pesoChileno = 812.8900;
				this.euros = 0.9078;
				this.librasEsterlinas = 0.7767;
				this.yenJapones = 140.7680;
				this.wonSulCoreano = 1293.9350;
				break;
			}
			case "Euro": {
				this.dolar = 1.1014;
				this.pesoChileno = 895.3252;
				this.euros = 1;
				this.librasEsterlinas = 0.8556;
				this.yenJapones = 155.0380;
				this.wonSulCoreano = 1424.8678;
				break;
			}
			case "Libra Esterlina": {
				this.dolar = 1.2873;
				this.pesoChileno = 1046.3520;
				this.euros = 1.1688;
				this.librasEsterlinas = 1;
				this.yenJapones = 181.2209;
				this.wonSulCoreano = 1665.2958;
				break;
			}
			case "Yen Japonés": {
				this.dolar = 0.0071;
				this.pesoChileno = 5.7732;
				this.euros = 0.0064;
				this.librasEsterlinas = 0.0055;
				this.yenJapones = 1;
				this.wonSulCoreano = 9.1861;
				break;
			}
			case "Won sul-coreano": {
				this.dolar = 0.00077;
				this.pesoChileno = 0.6286;
				this.euros = 0.00070;
				this.librasEsterlinas = 0.0000060;
				this.yenJapones = 0.1089;
				this.wonSulCoreano = 1;
				break;
			}
		}
		
		//Definiendo valores para el diccionario según la moneda de origen configurada en la sentencia switch-case
		diccionarioMonedas.put("Dólar", this.dolar);
		diccionarioMonedas.put("Peso Chileno", this.pesoChileno);
		diccionarioMonedas.put("Euro", this.euros);
		diccionarioMonedas.put("Libra Esterlina", this.librasEsterlinas);
		diccionarioMonedas.put("Yen Japonés", this.yenJapones);
		diccionarioMonedas.put("Won sul-coreano", this.wonSulCoreano);
		
		//Recorriendo el diccionario con ayuda de un for each
		for (Map.Entry<String, Double> valores : diccionarioMonedas.entrySet()) {
			if (valores.getKey() == this.destino) { //Si la clave del diccionario coincide con la moneda de destino;
				this.resultado = this.valor * valores.getValue(); // Multiplica por el valor de esa clave
			}
		}
		return this.resultado;
	}

}
