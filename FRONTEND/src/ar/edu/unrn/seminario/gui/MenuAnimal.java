package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    private JMenu mascotasMenu;;
	private ArrayList<AnimalDTO> listaMascotas;
	

	public MenuAnimal(ArrayList<AnimalDTO> listaMascotas) {
        this.listaMascotas = listaMascotas;
        
        // aca hay 2 ejemplos, los use para ver si anda el codigo
        /*
        listaMascotas.add(new AnimalDTO(
        	    "Max",               // nombre
        	    "Perro",             // especie
        	    "Labrador",          // raza
        	    "12/05/2018",        // fechaNac
        	    6,                   // edad
        	    "25 kg",             // peso
        	    "Macho",             // sexo
        	    true,                // estaCastrado
        	    "Color negro, amigable" // caractParticulares
        	));
        listaMascotas.add(new AnimalDTO(
        	    "Mia",               // nombre
        	    "Gato",              // especie
        	    "Siames",            // raza
        	    "23/08/2020",        // fechaNac
        	    4,                   // edad
        	    "4.5 kg",            // peso
        	    "Hembra",            // sexo
        	    false,               // estaCastrado
        	    "Ojos azules, independiente" // caractParticulares
        	));
        */
        
        // Configuración del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);

        // Panel de contenido
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Barra de menú
        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 600, 30);
        contentPane.add(menuBar);

        // Menú principal de "Mascotas"
        mascotasMenu = new JMenu("Mascotas");
        menuBar.add(mascotasMenu);

        // Agregar menús dinámicos para cada mascota
        agregarAnimalesAlMenu();

        // Mostrar la ventana
        setVisible(true);
    }

    // Método para agregar cada mascota al menú con sus opciones
    private void agregarAnimalesAlMenu() {
        for (AnimalDTO mascota : listaMascotas) {
            // Crear un nuevo menú para la mascota
            JMenu menuMascota = new JMenu(mascota.getNombre());

            // Crear las opciones del menú de la mascota
            JMenuItem historiaClinica = new JMenuItem("Historia clínica");
            JMenuItem visitas = new JMenuItem("Visitas");
            JMenuItem prescripciones = new JMenuItem("Prescripciones");

            // Submenú de "Libreta Sanitaria" con subopciones
            JMenu libretaSanitaria = new JMenu("Libreta Sanitaria");
            JMenuItem esquemaVacunatorio = new JMenuItem("Esquema vacunatorio");
            JMenuItem registrarVacuna = new JMenuItem("Registrar vacuna");

            libretaSanitaria.add(esquemaVacunatorio);
            libretaSanitaria.add(registrarVacuna);

            // Opción para eliminar la mascota
            JMenuItem eliminar = new JMenuItem("Eliminar");
            eliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Deseas borrar a " + mascota.getNombre() + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        listaMascotas.remove(mascota);
                        mascotasMenu.remove(menuMascota);
                        menuBar.revalidate();
                        menuBar.repaint();
                    }
                }
            });

            // Agregar las opciones al menú de la mascota
            menuMascota.add(historiaClinica);
            menuMascota.add(visitas);
            menuMascota.add(prescripciones);
            menuMascota.add(libretaSanitaria);
            menuMascota.add(eliminar);

            // Agregar el menú de la mascota al menú principal de "Mascotas"
            mascotasMenu.add(menuMascota);
        }

        // Refrescar la barra de menú
        menuBar.revalidate();
    }
    
    public static void main(String[] args) {
    	
		ArrayList<AnimalDTO> animales = new ArrayList<>();
		
        
        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAnimal frame = new MenuAnimal(animales);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
}