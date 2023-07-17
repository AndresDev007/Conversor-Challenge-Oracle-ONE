package adaros.andres.igu;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.CardLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
public class InterfazGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEntrada;
	
	private JComboBox comboBoxTipoConversion = new JComboBox();
	
	/**
	 * Constructor.
	 */
	public InterfazGrafica() {
		
		/*Icóno, título, tamaño, comportamiento cierre de ventana*/
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Mis archivos\\cursos\\one_oracle_alura\\Etapa alumno\\Conversor_de_monedas_Challenge\\Conversor\\src\\adaros\\andres\\recursos\\icono.png"));
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		
		/**********Inicio menú**********/
		/*Barra menú*/
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 0, 0, 0));
		setJMenuBar(menuBar);
		
		/*Menú*/
		JMenu mnMen = new JMenu("Menú");
		mnMen.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
		mnMen.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnMen);
		
		/*Item pegar*/
		JMenuItem mntmPegar = new JMenuItem("   Pegar valor");
		mntmPegar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
		mnMen.add(mntmPegar);
		
		/*Item copiar*/
		JMenuItem mntmCopiar = new JMenuItem("   Copiar resultado");
		mntmCopiar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
		mnMen.add(mntmCopiar);
		
		/*Item salir*/
		JMenuItem mntmSalir = new JMenuItem("   Salir");
		mntmSalir.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 10));
		mnMen.add(mntmSalir);
		/**********Fin menú**********/
		
		/**********Inicio paneles**********/
		/*Panel*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*Panel principal*/
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBorder(null);
		panelPrincipal.setBackground(SystemColor.controlHighlight);
		panelPrincipal.setBounds(0, 0, 436, 309);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		/*Panel secundario*/
		JPanel panelSecundario = new JPanel();
		panelSecundario.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelSecundario.setBounds(10, 11, 416, 287);
		panelPrincipal.add(panelSecundario);
		panelSecundario.setLayout(null);
		/**********Fin paneles**********/
		
		
		/*************Inicio componentes*************/
		/*Label tipo de conversión*/
		JLabel lblTipoConversion = new JLabel("Tipo de conversión");
		lblTipoConversion.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		lblTipoConversion.setBounds(26, 11, 184, 27);
		panelSecundario.add(lblTipoConversion);
		lblTipoConversion.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*Lista desplegable tipo de conversión*/
		
		comboBoxTipoConversion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBoxTipoConversion.setBounds(26, 36, 184, 22);
		panelSecundario.add(comboBoxTipoConversion);
		comboBoxTipoConversion.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opción"}));
		
		/*Label Origen*/
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		lblOrigen.setBounds(26, 69, 184, 27);
		panelSecundario.add(lblOrigen);
		lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*Lista desplegable origen*/
		JComboBox comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBoxOrigen.setBounds(26, 94, 184, 22);
		panelSecundario.add(comboBoxOrigen);
		comboBoxOrigen.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opción", "Peso Chileno", "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano\""}));
		
		/*Label destino*/
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		lblDestino.setBounds(26, 127, 184, 27);
		panelSecundario.add(lblDestino);
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);

		/*Lista desplegable destino*/
		JComboBox comboBoxDestino = new JComboBox();
		comboBoxDestino.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBoxDestino.setBounds(26, 152, 184, 22);
		panelSecundario.add(comboBoxDestino);
		comboBoxDestino.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opción", "Peso Chileno", "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano\""}));
		
		/*Label valor de entrada*/
		JLabel lblValorDeEntrada = new JLabel("Valor en Euros");
		lblValorDeEntrada.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		lblValorDeEntrada.setBounds(241, 49, 175, 27);
		panelSecundario.add(lblValorDeEntrada);
		lblValorDeEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*Campo de entrada de dato a convertir*/
		textFieldEntrada = new JTextField();
		textFieldEntrada.setToolTipText("");
		textFieldEntrada.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFieldEntrada.setBounds(265, 76, 125, 20);
		panelSecundario.add(textFieldEntrada);
		textFieldEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEntrada.setColumns(10);
		
		/*Label nombre salida del valor calculado*/
		JLabel lblValorSalida = new JLabel("Valor en Pesos Chilenos");
		lblValorSalida.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		lblValorSalida.setBounds(241, 122, 175, 27);
		panelSecundario.add(lblValorSalida);
		lblValorSalida.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*Label resultado en pantalla del valor salida calculado*/
		JLabel lblValorSalidaValor = new JLabel("$ 5678.087");
		lblValorSalidaValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValorSalidaValor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblValorSalidaValor.setBounds(241, 147, 175, 27);
		panelSecundario.add(lblValorSalidaValor);
		lblValorSalidaValor.setForeground(new Color(0, 0, 128));
		lblValorSalidaValor.setBackground(new Color(192, 192, 192));
		lblValorSalidaValor.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*>>>>>Inicio botones<<<<<*/
		/*Boton convertir*/
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(67, 219, 89, 23);
		panelSecundario.add(btnConvertir);
		
		/*Boton limpiar*/
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(271, 219, 89, 23);
		panelSecundario.add(btnLimpiar);
		/*>>>>>Fin botones<<<<<*/	
		
		/*Imagen de fondo*/
		JLabel lblImgFondo = new JLabel("");
		lblImgFondo.setBackground(UIManager.getColor("List.foreground"));
		lblImgFondo.setIcon(new ImageIcon("D:\\Mis archivos\\cursos\\one_oracle_alura\\Etapa alumno\\Conversor_de_monedas_Challenge\\Conversor\\src\\adaros\\andres\\recursos\\instrumentos.png"));
		lblImgFondo.setBounds(0, 0, 416, 287);
		panelSecundario.add(lblImgFondo);
		setLocationRelativeTo(null);
		/*************Fin componentes*************/
	}	
	
	/*
	 * Métodos
	 */
	/*Set lista tipo de conversion*/
	public void setListaTipoConversion (String[] listaTipoConversion) {
	for (String items : listaTipoConversion) {
		comboBoxTipoConversion.addItem(items);
	}
};

	
	
	
	
	
	
	
	
	
	
	
	
	
}