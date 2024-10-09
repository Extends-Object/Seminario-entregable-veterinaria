package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrarVisita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Fecha;
	private JTextField textField_Veterinario;
	private JTextField textField_Animalatendido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarVisita frame = new RegistrarVisita();
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
	public RegistrarVisita() {
		setTitle("Registrar visitas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fechaLabel = new JLabel("Fecha");
		fechaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fechaLabel.setBounds(10, 10, 97, 28);
		contentPane.add(fechaLabel);
		
		JLabel veterinarioLabel = new JLabel("Veterinario");
		veterinarioLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		veterinarioLabel.setBounds(10, 80, 97, 20);
		contentPane.add(veterinarioLabel);
		
		JLabel animalAtendidoLabel = new JLabel("Animal atendido");
		animalAtendidoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		animalAtendidoLabel.setBounds(10, 144, 131, 20);
		contentPane.add(animalAtendidoLabel);
		
		JLabel motivoLabel = new JLabel("Motivo");
		motivoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		motivoLabel.setBounds(10, 216, 97, 28);
		contentPane.add(motivoLabel);
		
		JLabel diagnosticoLabel = new JLabel("Diagnostico");
		diagnosticoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		diagnosticoLabel.setBounds(302, 10, 114, 28);
		contentPane.add(diagnosticoLabel);
		
		JLabel notasLabel = new JLabel("Notas adicionales");
		notasLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		notasLabel.setBounds(300, 144, 131, 20);
		contentPane.add(notasLabel);
		
		textField_Fecha = new JTextField();
		textField_Fecha.setBounds(10, 51, 131, 19);
		contentPane.add(textField_Fecha);
		textField_Fecha.setColumns(10);
		
		textField_Veterinario = new JTextField();
		textField_Veterinario.setBounds(11, 115, 130, 19);
		contentPane.add(textField_Veterinario);
		textField_Veterinario.setColumns(10);
		
		textField_Animalatendido = new JTextField();
		textField_Animalatendido.setBounds(10, 174, 131, 19);
		contentPane.add(textField_Animalatendido);
		textField_Animalatendido.setColumns(10);
		
		JTextArea textArea_Motivo = new JTextArea();
		textArea_Motivo.setBounds(10, 256, 186, 76);
		contentPane.add(textArea_Motivo);
		
		JTextArea textArea_NotasAdicionales = new JTextArea();
		textArea_NotasAdicionales.setBounds(302, 188, 221, 97);
		contentPane.add(textArea_NotasAdicionales);
		
		JButton RegistrarButton = new JButton("Registrar");
		RegistrarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		RegistrarButton.setBounds(276, 351, 105, 28);
		RegistrarButton.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(RegistrarButton);
		
		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cancelarButton.setBounds(391, 351, 105, 28);
		cancelarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(cancelarButton);
	}
}
