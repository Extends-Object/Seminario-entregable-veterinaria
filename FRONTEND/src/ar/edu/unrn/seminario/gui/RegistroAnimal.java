package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.AplicacionAPI;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroAnimal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroAnimal frame = new RegistroAnimal();
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
	public RegistroAnimal() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(115, 62, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 129, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 197, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 272, 96, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(140, 39, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Clase");
		lblNewLabel_1.setBounds(140, 109, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Raza");
		lblNewLabel_2.setBounds(140, 175, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento");
		lblNewLabel_3.setBounds(115, 249, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(291, 62, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(291, 129, 96, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(291, 197, 96, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(291, 272, 96, 19);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setBounds(317, 39, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Sexo");
		lblNewLabel_4_1.setBounds(317, 109, 45, 13);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Peso");
		lblNewLabel_2_1.setBounds(317, 175, 45, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Está castrado");
		lblNewLabel_3_1.setBounds(305, 249, 71, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Características particulares");
		lblNewLabel_4_2.setBounds(460, 39, 178, 13);
		contentPane.add(lblNewLabel_4_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(470, 59, 170, 89);
		contentPane.add(textArea);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //agregarAnimal();
            }
        });
		btnAceptar.setBounds(524, 330, 85, 21);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Cierra la ventana
			}
		});
		btnCancelar.setBounds(619, 330, 85, 21);
		contentPane.add(btnCancelar);
	}
	
	
}
