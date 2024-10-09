package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VerLibretaSanitaria extends JFrame {

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
					VerLibretaSanitaria frame = new VerLibretaSanitaria();
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
	public VerLibretaSanitaria() {
		setTitle("Libreta Sanitaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// estructura provisional para Libreta Sanitaria y crear el jtable para ver como seria el resultado final
				String [] columnas= {"Fecha","Provisional","Diferencial","Definitivo","Tratamiento","Prescripciones","Estudios"};
				DefaultTableModel modelo= new DefaultTableModel(columnas,0);
				contentPane.setLayout(null);
				tabla= new JTable(modelo);
				JScrollPane scrollPane = new JScrollPane(tabla);
				scrollPane.setBounds(10, 10, 759, 426);
				contentPane.add(scrollPane);

		setContentPane(contentPane);
	}

}
