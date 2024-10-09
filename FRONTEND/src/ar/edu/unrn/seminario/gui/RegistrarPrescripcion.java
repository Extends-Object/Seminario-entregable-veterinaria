package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrarPrescripcion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_creacion;
	private JTextField textField_drogas;
	private JTextField textField_fechaInicio;
	private JTextField textField_fechaFin;
	private JTextField textField_frecuenciaSuministro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarPrescripcion frame = new RegistrarPrescripcion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrarPrescripcion() {
		setTitle("Registrar Prescripcion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel creacion = new JLabel("Creacion");
		creacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		creacion.setBounds(28, 10, 114, 25);
		contentPane.add(creacion);
		
		JLabel drogas = new JLabel("Drogas");
		drogas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drogas.setBounds(28, 93, 103, 25);
		contentPane.add(drogas);
		
		JLabel fechaInicio = new JLabel("Fecha de Inicio");
		fechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fechaInicio.setBounds(28, 177, 114, 25);
		contentPane.add(fechaInicio);
		
		JLabel fechaFin = new JLabel("Fecha de Fin");
		fechaFin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fechaFin.setBounds(259, 10, 123, 25);
		contentPane.add(fechaFin);
		
		JLabel frecuenciaSuministro = new JLabel("Frecuencia de suministro");
		frecuenciaSuministro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frecuenciaSuministro.setBounds(259, 93, 175, 25);
		contentPane.add(frecuenciaSuministro);
		
		textField_creacion = new JTextField();
		textField_creacion.setBounds(28, 39, 123, 25);
		contentPane.add(textField_creacion);
		textField_creacion.setColumns(10);
		
		textField_drogas = new JTextField();
		textField_drogas.setBounds(28, 128, 123, 19);
		contentPane.add(textField_drogas);
		textField_drogas.setColumns(10);
		
		textField_fechaInicio = new JTextField();
		textField_fechaInicio.setBounds(28, 218, 123, 19);
		contentPane.add(textField_fechaInicio);
		textField_fechaInicio.setColumns(10);
		
		textField_fechaFin = new JTextField();
		textField_fechaFin.setBounds(259, 45, 96, 19);
		contentPane.add(textField_fechaFin);
		textField_fechaFin.setColumns(10);
		
		textField_frecuenciaSuministro = new JTextField();
		textField_frecuenciaSuministro.setBounds(259, 128, 175, 19);
		contentPane.add(textField_frecuenciaSuministro);
		textField_frecuenciaSuministro.setColumns(10);
		
		JButton RegistrarButton = new JButton("Registrar");
		RegistrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		RegistrarButton.setBounds(378, 234, 114, 34);
		RegistrarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(RegistrarButton);
		
		JButton CancelarButton = new JButton("Cancelar");
		CancelarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CancelarButton.setBounds(509, 234, 103, 34);
		CancelarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String creacion=textField_creacion.getText();
				String drogas=textField_drogas.getText();
				String fechaInicio=textField_fechaInicio.getText();
				String fechaFin=textField_fechaFin.getText();
				String frecuenciaSuministrio=textField_frecuenciaSuministro.getText();
				
				//aca es falta la logica para almacenar la prescripcion
				
				textField_creacion.setText("");
				textField_drogas.setText("");
				textField_fechaInicio.setText("");
				textField_fechaFin.setText("");
				textField_frecuenciaSuministro.setText("");
			}
		});
		contentPane.add(CancelarButton);
	}
}
