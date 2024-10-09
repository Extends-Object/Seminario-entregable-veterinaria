package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class IngresoCredenciales extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoCredenciales frame = new IngresoCredenciales();
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
	public IngresoCredenciales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoUsuario = new JTextField();
		campoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		campoUsuario.setBounds(231, 161, 161, 30);
		contentPane.add(campoUsuario);
		campoUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Ingrese su usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(231, 138, 127, 13);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Ingrese contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContraseña.setBounds(236, 214, 127, 13);
		contentPane.add(lblContraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(231, 237, 161, 30);
		contentPane.add(passwordField);
	}
}
