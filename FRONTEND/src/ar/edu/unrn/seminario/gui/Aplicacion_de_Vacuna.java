package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

import ar.edu.unrn.seminario.modelo.Droga;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Aplicacion_de_Vacuna extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_FechaAplicacion ;
	private JTextField textField_Num_dosis_total;
	private JTextField textField_Num_dosis_actual;
	private JTextField textField_Nombre;
	private JTextField textField_esquema;
	private JTextField textField_Lote;
	private JTextField textField_Prox_dosis;
	private JTextField textField_cantidadSuministrada;
	private JTextField textField_Droga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion_de_Vacuna frame = new Aplicacion_de_Vacuna();
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
	public Aplicacion_de_Vacuna() {
		setTitle("Registrar vacuna");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel FechaAplicacion = new JLabel("Fecha de Aplicacion");
		FechaAplicacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		FechaAplicacion.setBounds(32, 10, 123, 16);
		contentPane.add(FechaAplicacion);
		
		JLabel Num_dosis_total = new JLabel("Numero de dosis Total");
		Num_dosis_total.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Num_dosis_total.setBounds(32, 54, 144, 16);
		contentPane.add(Num_dosis_total);
		
		JLabel Num_dosis_actual = new JLabel("Numero de dosis actual");
		Num_dosis_actual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Num_dosis_actual.setBounds(32, 109, 144, 13);
		contentPane.add(Num_dosis_actual);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nombre.setBounds(32, 156, 71, 13);
		contentPane.add(Nombre);
		
		JLabel Observaciones = new JLabel("Observaciones");
		Observaciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Observaciones.setBounds(455, 12, 100, 13);
		contentPane.add(Observaciones);
		
		JLabel Lote = new JLabel("Lote");
		Lote.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Lote.setBounds(210, 56, 45, 13);
		contentPane.add(Lote);
		
		JLabel Prox_dosis = new JLabel("Proxima dosis");
		Prox_dosis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Prox_dosis.setBounds(210, 109, 90, 13);
		contentPane.add(Prox_dosis);
		
		JLabel cantidadSuministrada = new JLabel("Cantidad Suministrada");
		cantidadSuministrada.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cantidadSuministrada.setBounds(210, 12, 134, 13);
		contentPane.add(cantidadSuministrada);
		
		JLabel Droga = new JLabel("Droga");
		Droga.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Droga.setBounds(32, 208, 45, 13);
		contentPane.add(Droga);
		
		JLabel esquema = new JLabel("Esquema");
		esquema.setFont(new Font("Tahoma", Font.PLAIN, 13));
		esquema.setBounds(208, 154, 79, 16);
		contentPane.add(esquema);
		
		textField_FechaAplicacion = new JTextField();
		textField_FechaAplicacion .setBounds(32, 25, 134, 19);
		contentPane.add(textField_FechaAplicacion );
		textField_FechaAplicacion .setColumns(10);
		
		textField_Num_dosis_total = new JTextField();
		textField_Num_dosis_total.setColumns(10);
		textField_Num_dosis_total.setBounds(32, 80, 134, 19);
		contentPane.add(textField_Num_dosis_total);
		
		textField_Num_dosis_actual = new JTextField();
		textField_Num_dosis_actual.setColumns(10);
		textField_Num_dosis_actual.setBounds(32, 127, 134, 19);
		contentPane.add(textField_Num_dosis_actual);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setColumns(10);
		textField_Nombre.setBounds(32, 179, 134, 19);
		contentPane.add(textField_Nombre);
		
		textField_esquema = new JTextField();
		textField_esquema.setColumns(10);
		textField_esquema.setBounds(32, 225, 134, 19);
		contentPane.add(textField_esquema);
		
		textField_Lote = new JTextField();
		textField_Lote.setColumns(10);
		textField_Lote.setBounds(210, 27, 134, 19);
		contentPane.add(textField_Lote);
		
		textField_Prox_dosis = new JTextField();
		textField_Prox_dosis.setColumns(10);
		textField_Prox_dosis.setBounds(210, 80, 134, 19);
		contentPane.add(textField_Prox_dosis);
		
		textField_cantidadSuministrada = new JTextField();
		textField_cantidadSuministrada.setColumns(10);
		textField_cantidadSuministrada.setBounds(210, 132, 134, 19);
		contentPane.add(textField_cantidadSuministrada);
		
		textField_Droga = new JTextField();
		textField_Droga.setColumns(10);
		textField_Droga.setBounds(208, 180, 134, 19);
		contentPane.add(textField_Droga);
		
		JTextArea textArea_Observaciones = new JTextArea();
		textArea_Observaciones.setBounds(455, 35, 259, 209);
		contentPane.add(textArea_Observaciones);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(455, 277, 85, 21);
		Aceptar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String fechaAplicacion = textField_FechaAplicacion.getText();
		        int numDosisTotal = Integer.parseInt(textField_Num_dosis_total.getText());
		        int numDosisActual = Integer.parseInt(textField_Num_dosis_actual.getText()) ;
		        String nombre = textField_Nombre.getText();
		        String lote = textField_Lote.getText();
		        String proxDosis = textField_Prox_dosis.getText();
		        float cantidadSuministrada =Integer.parseInt(textField_cantidadSuministrada.getText());
		        String droga = textField_Droga.getText();
		        String esquema = textField_esquema.getText();
		        String observaciones = textArea_Observaciones.getText();
		        
		        // Aca hay que implementar la logica para almacenar la vacuna
		        
		        
		        textField_FechaAplicacion.setText("");
		        textField_Num_dosis_total.setText("");
		        textField_Num_dosis_actual.setText("");
		        textField_Nombre.setText("");
		        textField_Lote.setText("");
		        textField_Prox_dosis.setText("");
		        textField_cantidadSuministrada.setText("");
		        textField_Droga.setText("");
		        textField_esquema.setText("");
		        textArea_Observaciones.setText("");
		        
				
			}
			
		});
		contentPane.add(Aceptar);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setBounds(573, 277, 85, 21);
		Cancelar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				 textField_FechaAplicacion.setText("");
			     textField_Num_dosis_total.setText("");
			     textField_Num_dosis_actual.setText("");
			     textField_Nombre.setText("");
			     textField_Lote.setText("");
			     textField_Prox_dosis.setText("");
			     textField_cantidadSuministrada.setText("");
			     textField_Droga.setText("");
			     textField_esquema.setText("");
			     textArea_Observaciones.setText("");
			}
			
		});
		contentPane.add(Cancelar);
	}
}
