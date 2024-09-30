package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBackground(new Color(204, 255, 153));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(0, 64, 0));
		lblNewLabel.setBounds(22, 20, 802, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Registrar animal");
		btnNewButton.setBounds(82, 104, 179, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mostrar animales");
		btnNewButton_1.setBounds(82, 152, 179, 21);
		contentPane.add(btnNewButton_1);
	}
}
