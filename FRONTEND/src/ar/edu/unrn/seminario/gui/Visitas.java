package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Visitas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visitas frame = new Visitas();
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
	public Visitas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//construccion de la tabla, de momento como no se crea el modelo de visita uso un string y lo coloco en un DefaultTableModel
		// para luego ponerlo en la variable JTable tabla, para ser finalmente colocada en el scrollPane.
		// esto sirve para tener una "base" de modelo pero si o si es necesario una clase ModeloVisita para poder explayar bien cada variable
		// como diagnostico Diferencial o notasAdicionales
		String columnas[]= {"fecha","veterinarioNombre","animalNombre","motivo","Diagnostico Diferencial","Notas Adicionales"};
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0); 
		tabla = new JTable(modelo);

		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(10, 10, 722, 253);
		
		contentPane.add(scrollPane);
		
		
	}
}
