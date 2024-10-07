package ar.edu.unrn.seminario.gui;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.dto.AnimalDTO;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		ArrayList<AnimalDTO> lista= new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Registrar = new JButton("Registrar animal");
		Registrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Registrar.setBounds(210, 86, 394, 56);
		Registrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RegistroAnimal registro = new RegistroAnimal(lista);
		        registro.setVisible(true);
			}
			
		});
		contentPane.add(Registrar);
		
		JButton MostrarAnimal = new JButton("Mostrar animales");
		MostrarAnimal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MostrarAnimal.setBounds(210, 191, 394, 56);
		MostrarAnimal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuAnimal menu = new MenuAnimal(lista);
				menu.setVisible(true);
			}
			
		});
		contentPane.add(MostrarAnimal);
	}
}
