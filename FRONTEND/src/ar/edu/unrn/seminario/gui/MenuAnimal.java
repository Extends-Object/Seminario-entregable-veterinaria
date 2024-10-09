package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ar.edu.unrn.seminario.api.IApi;
import ar.edu.unrn.seminario.api.MemoryApi;
import ar.edu.unrn.seminario.dto.AnimalDTO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

@SuppressWarnings("unused")
public class MenuAnimal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mascotasMenu;

	private IApi memoryApi;

	public MenuAnimal(IApi memoryApi) {

		this.memoryApi = memoryApi;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// BARRA DEL MENU
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 600, 30);
		contentPane.add(menuBar);

		// MENU PRINCIPAL DE LAS MASCOTAS
		mascotasMenu = new JMenu("Mascotas");
		menuBar.add(mascotasMenu);

		// AGREGAR MENU DINAMICO PARA CADA MASCOTA
		agregarAnimalesAlMenu();

		// MOSTRAR VENTANA
		setVisible(true);

	}
	//--------------------------------------------------------------------------------------------------------
	// Método para agregar cada mascota al menú con sus opciones
	private void agregarAnimalesAlMenu() {

		ArrayList<AnimalDTO> listaAnimalesDTO = memoryApi.animalToDTO();

		// AGREGAR LA LISTA DE ANIMALES AL MENU
		for (AnimalDTO animal : listaAnimalesDTO) {
			
			JMenu menuAnimal = new JMenu(animal.getNombre()); 			// CREAR EL MENU DE UNA MASCOTA

			JMenuItem historiaClinica = new JMenuItem("Historia clínica");	// OPCIONES DEL MENU DEL ANIMAL
			JMenuItem visitas = new JMenuItem("Visitas");
			JMenuItem prescripciones = new JMenuItem("Prescripciones");

			JMenu libretaSanitaria = new JMenu("Libreta Sanitaria");		// SUBMENU CON OPCIONES
			JMenuItem esquemaVacunatorio = new JMenuItem("Esquema vacunatorio");
			JMenuItem registrarVacuna = new JMenuItem("Registrar vacuna");

			libretaSanitaria.add(esquemaVacunatorio);
			libretaSanitaria.add(registrarVacuna);

			libretaSanitaria.add(esquemaVacunatorio);
			libretaSanitaria.add(registrarVacuna);

			// ----------------------------------------------------------------------------------------
			
			/*
			// ABRIR HISTORIA CLINICA
			historiaClinica.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					HistoriaClinica ventanaHistoriaClinica = new HistoriaClinica(animal, memoryApi);
					ventanaHistoriaClinica.setVisible(true);
				}
			});

			// ABRIR LIBRETA SANITARIA
			esquemaVacunatorio.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					LibretaSanitaria ventanaLibretaSanitaria = new LibretaSanitaria(animal, memoryApi);
					ventanaLibretaSanitaria.setVisible(true);
				}
			});
			*/
			// ------------------------------------------------------------------------------------------

			// ELIMINAR UNA MASCOTA
			JMenuItem eliminar = new JMenuItem("Eliminar");
			eliminar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int confirm = JOptionPane.showConfirmDialog(null, "¿Deseas borrar a " + animal.getNombre() + "?",
							"Confirmar", JOptionPane.YES_NO_OPTION);
					if (confirm == JOptionPane.YES_OPTION) {
						listaAnimalesDTO.remove(animal);
						mascotasMenu.remove(menuAnimal);
						menuBar.revalidate();
						menuBar.repaint();
					}
				}
			});

			// AGREGAR TODAS LAS OPCIONES AL MENU DE UNA MASCOTA
			menuAnimal.add(historiaClinica);
			menuAnimal.add(visitas);
			menuAnimal.add(prescripciones);
			menuAnimal.add(libretaSanitaria);
			menuAnimal.add(eliminar);

			// AGREGAR EL MENU DE UNA MASCOTA AL MENU GENERAL
			mascotasMenu.add(menuAnimal);
		}

		// REFRESCAR LA BARRA DE MENU
		menuBar.revalidate();
	}

}
