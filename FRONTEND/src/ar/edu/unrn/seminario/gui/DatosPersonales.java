package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DatosPersonales extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNombre;
	private JTextField campoApellido;
	private JTextField campoEmail;
	private JTextField campoCalle;
	private JTextField campoNumero;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPersonales frame = new DatosPersonales();
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
	public DatosPersonales() {
		setTitle("Datos personales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dpNombre = new JLabel("Nombre:");
		dpNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dpNombre.setBounds(112, 65, 57, 22);
		contentPane.add(dpNombre);
		
		JLabel dpApellido = new JLabel("Apellido:");
		dpApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dpApellido.setBounds(112, 155, 83, 23);
		contentPane.add(dpApellido);
		
		JLabel dpEmail = new JLabel("E-mail:");
		dpEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dpEmail.setBounds(112, 249, 57, 13);
		contentPane.add(dpEmail);
		
		JLabel dpLocalidad = new JLabel("Localidad:");
		dpLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dpLocalidad.setBounds(412, 249, 67, 13);
		contentPane.add(dpLocalidad);
		
		JLabel dpCalle = new JLabel("Calle:");
		dpCalle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dpCalle.setBounds(412, 74, 45, 13);
		contentPane.add(dpCalle);
		
		JLabel dpNumero = new JLabel("Numero:");
		dpNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dpNumero.setBounds(412, 155, 57, 23);
		contentPane.add(dpNumero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setBounds(230, 345, 109, 31);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(349, 345, 102, 31);
		contentPane.add(btnCancelar);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(112, 97, 185, 31);
		contentPane.add(campoNombre);
		campoNombre.setColumns(10);
		
		campoApellido = new JTextField();
		campoApellido.setBounds(112, 188, 185, 31);
		contentPane.add(campoApellido);
		campoApellido.setColumns(10);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(112, 272, 185, 31);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		campoCalle = new JTextField();
		campoCalle.setBounds(412, 97, 185, 31);
		contentPane.add(campoCalle);
		campoCalle.setColumns(10);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(412, 188, 185, 31);
		contentPane.add(campoNumero);
		campoNumero.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(412, 272, 185, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
