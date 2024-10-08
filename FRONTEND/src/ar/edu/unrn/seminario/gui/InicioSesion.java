package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JButton btnDueño = new JButton("Dueño");
		btnDueño.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDueño.setBounds(286, 48, 251, 50);
		contentPane.add(btnDueño);
		
		JButton btnVeterinario = new JButton("Veterinario");
		btnVeterinario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVeterinario.setBounds(286, 151, 251, 50);
		contentPane.add(btnVeterinario);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegistrarse.setBounds(286, 249, 251, 50);
		contentPane.add(btnRegistrarse);
	}
}
