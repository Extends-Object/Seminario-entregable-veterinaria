package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VerHistoriaClinica extends JFrame {

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
					VerHistoriaClinica frame = new VerHistoriaClinica();
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
	public VerHistoriaClinica() {
		setTitle("Historia Clinica");
		// estructura provisional para historia clinica y crear el jtable para ver como seria el resultado final
		String [] columnas= {"fecha","provisional","diferencial","definitivo","tratamiento","prescripciones","estudios"};
		DefaultTableModel modelo= new DefaultTableModel(columnas,0);
		tabla= new JTable(modelo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(10, 10, 416, 20);
		contentPane.add(scrollPane);
	}

}
