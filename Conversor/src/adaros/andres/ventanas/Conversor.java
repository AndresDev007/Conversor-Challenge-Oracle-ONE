package adaros.andres.ventanas;

import javax.swing.JOptionPane;

public class Conversor {
	
	//variables internas
	private String tipoConversion; 
	private String origen;
	private String destino;
	private double valor;
	private double resultado;
	
	//Valor de conversión de peso chileno a otra moneda
	private double dolar = 0.0012;
	private double pesoChileno = 1;
	private double euros = 0.0011;
	private double librasEsterlinas = 0.00097; /*Revisar como actualizar en tiempo real*/
	private double yenJapones = 0.17771;
	private double wonSulCoreano = 1.62;
	
	
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
	
	public double resultadoMoneda() { //pendiente !!!!
		switch (this.origen) { //para pasar la moneda de origen
		case "Peso Chileno": {  // Si hace match con peso chileno
			switch (this.destino) { // si hace match peso chileno con dolar

				case "Dólar": {
					this.resultado = this.valor * this.dolar;		
					return this.resultado;
				}
				case "Euros": {
					this.resultado = this.valor * this.euros;		
					return this.resultado;
				}
				case "Libras Esterlinas": {
					this.resultado = this.valor * this.librasEsterlinas;		
					return this.resultado;
				}
				case "Yen Japonés": {
					this.resultado = this.valor * this.yenJapones;		
					return this.resultado;
				}
				case "Won sul-coreano": {
					this.resultado = this.valor * this.wonSulCoreano;		
					return this.resultado;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + this.destino); 
				}
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.valor);
		}
		
	}
	/*
	 * Ventana que muestra el resultado
	 */
	public void ventanaResultado(){ 
		JOptionPane.showMessageDialog(null,
			    this.resultado,
			    "Valor en "+ this.destino,
			    JOptionPane.PLAIN_MESSAGE);
	};

}
