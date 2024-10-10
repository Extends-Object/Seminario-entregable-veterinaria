package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.IApi;
import ar.edu.unrn.seminario.api.MemoryApi;
import ar.edu.unrn.seminario.dto.AnimalDTO;
import ar.edu.unrn.seminario.dto.EspecieDTO;
import ar.edu.unrn.seminario.dto.RazaDTO;
import ar.edu.unrn.seminario.exception.AnimalExistsInArrayException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
@SuppressWarnings("unused")
public class RegistroAnimal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNombre;
	private JTextField campoFechaNac;
	private JTextField campoPeso;
	private JTextField campoCaractParticulares;
	//private JComboBox<EspecieDTO> comboBoxEspecie;
	private JComboBox<RazaDTO> comboBoxRaza;
	
	private int iD = 0;
	
	private IApi memoryApi; // Instancia de MemoryApi

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ArrayList<AnimalDTO> listaAnimales= new ArrayList<AnimalDTO>();
//					RegistroAnimal frame = new RegistroAnimal(memoryApi);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


	/**
	 * Create the frame.
	 */
	public RegistroAnimal(IApi memoryApi) {  // RECIBE LA MEMORY API QUE ES DONDE VA A ESTAR LA LISTA
		
		this.memoryApi = memoryApi;
        
		//CONFIGURACION DE LA VENTANA-------------------------------------------------------------------------
		setTitle("Registrar mascotas");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 784, 439);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // ETIQUETAS------------------------------------------------------------------------------------------
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNombre.setBounds(30, 31, 65, 22);
        contentPane.add(lblNombre);
        
        /*
        JLabel lblEspecie = new JLabel("Especie");
        lblEspecie.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEspecie.setBounds(30, 63, 65, 22);
        contentPane.add(lblEspecie);
        */

        JLabel lblRaza = new JLabel("Raza");
        lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRaza.setBounds(30, 98, 65, 22);
        contentPane.add(lblRaza);

        JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
        lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblFechaNacimiento.setBounds(10, 130, 129, 19);
        contentPane.add(lblFechaNacimiento);

        JLabel lblGenero = new JLabel("Género");
        lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblGenero.setBounds(30, 172, 65, 22);
        contentPane.add(lblGenero);

        JLabel lblPeso = new JLabel("Peso");
        lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPeso.setBounds(30, 218, 45, 13);
        contentPane.add(lblPeso);

        JLabel lblCaractParticulares = new JLabel("Características particulares");
        lblCaractParticulares.setBounds(462, 10, 180, 22);
        contentPane.add(lblCaractParticulares);

        JLabel lblCastrado = new JLabel("¿Está castrado?");
        lblCastrado.setBounds(30, 314, 100, 22);
        contentPane.add(lblCastrado);
        
        
        // TEXTFIELDS-------------------------------------------------------------------------------------------
        campoNombre = new JTextField();    // Nombre
        campoNombre.setBounds(165, 69, 116, 19);
        contentPane.add(campoNombre);
        campoNombre.setColumns(10);

        campoFechaNac = new JTextField();  // Fecha de nacimiento
        campoFechaNac.setBounds(149, 129, 167, 19);
        contentPane.add(campoFechaNac);
        campoFechaNac.setColumns(10);

        campoPeso = new JTextField();  // Peso
        campoPeso.setBounds(149, 215, 96, 19);
        contentPane.add(campoPeso);
        campoPeso.setColumns(10);

        campoCaractParticulares = new JTextField();  // Características particulares
        campoCaractParticulares.setBounds(462, 42, 283, 294);
        contentPane.add(campoCaractParticulares);
        campoCaractParticulares.setColumns(10);

        // BOTONES DE GENERO -------------------------------------------------------------------------------------------
        JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
        rdbtnMasculino.setBounds(149, 173, 103, 21);
        contentPane.add(rdbtnMasculino);

        JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
        rdbtnFemenino.setBounds(254, 173, 103, 21);
        contentPane.add(rdbtnFemenino);

        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rdbtnMasculino);
        grupoGenero.add(rdbtnFemenino);

        
        // BOTONES CASTRACION ------------------------------------------------------------------------------------------
        JRadioButton rdbtnCastradoSi = new JRadioButton("Si");
        rdbtnCastradoSi.setBounds(162, 315, 65, 21);
        contentPane.add(rdbtnCastradoSi);

        JRadioButton rdbtnCastradoNo = new JRadioButton("Negativo");
        rdbtnCastradoNo.setBounds(254, 315, 103, 21);
        contentPane.add(rdbtnCastradoNo);

        ButtonGroup grupoCastrado = new ButtonGroup();
        grupoCastrado.add(rdbtnCastradoSi);
        grupoCastrado.add(rdbtnCastradoNo);

        
        // BOTON ACEPTAR------------------------------------------------------------------------------------------------
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(501, 365, 85, 21);
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                // RECOGER LOS DATOS DE LOS CAMPOS
                String nombre = campoNombre.getText();
                String fechaNac = campoFechaNac.getText();
                //EspecieDTO especie = (EspecieDTO) comboBoxEspecie.getSelectedItem();
                RazaDTO raza = (RazaDTO) comboBoxRaza.getSelectedItem();
                String peso = campoPeso.getText();
                String sexo = rdbtnMasculino.isSelected() ? "Macho" : "Hembra";
                String caractParticulares = campoCaractParticulares.getText();
                boolean estaCastrado = rdbtnCastradoSi.isSelected();
                
                //int edad = calcularEdad(fechaNac);
                
                //memoryApi.agregarAnimal(nombre, fechaNac, especie, raza, peso, sexo, caractParticulares, estaCastrado);
                try {
					memoryApi.agregarAnimal(nombre, raza.getTamaño(), raza.getNombre(), LocalDate.parse(fechaNac), Float.parseFloat(peso), sexo, 
							estaCastrado, caractParticulares, generarIDUnico());
				} catch (NumberFormatException | AnimalExistsInArrayException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
                
                // MENSAJE DE CONFIRMACION
                JOptionPane.showMessageDialog(null, "Mascota registrada exitosamente.");
                
                // LIMPIEZA DE CAMPOS
                campoNombre.setText("");                
                campoFechaNac.setText("");
                campoPeso.setText("");
                campoCaractParticulares.setText("");
                
                //LIMPIEZA DE BOTONES
                ButtonGroup grupoGenero = new ButtonGroup();
                grupoGenero.clearSelection();

                ButtonGroup grupoCastrado = new ButtonGroup();
                grupoCastrado.clearSelection();
            }
        });
        contentPane.add(btnAceptar);
        
        // BOTON CANCELAR----------------------------------------------------------------------------------------------
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(651, 365, 85, 21);
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // CERRAR LA VENTANA
            }
        });
        contentPane.add(btnCancelar);
        
        /*CONFIGURACION DE COMBOBOX------------------------------------------------------------------------------------
        // ESPECIES = Cargamos las especies desde la MemoryApi
        ArrayList <EspecieDTO> listaEspecies = memoryApi.obtenerEspecies();
        for (EspecieDTO especie : listaEspecies) { //"ESPECIES" ES LA LISTA DE ESPECIESDTO QUE SE RECUPERA DE LA API
       		comboBoxEspecie.addItem(especie);
        }
        */
        JComboBox comboBoxEspecie = new JComboBox();
        comboBoxEspecie.setBounds(165, 103, 116, 21);
        comboBoxEspecie.addActionListener(e -> {		//PARA OBTENER LA ESPECIE SELECCIONADA
        	EspecieDTO especieSeleccionada = (EspecieDTO) comboBoxEspecie.getSelectedItem();
        	//SEGUN LA ESPECIE VA A OBTENER LA LISTA DE RAZAS RELACIONADAS A LA MISMA
        	//SE VAN A CARGAR DE LA MEMORY API
        	ArrayList<RazaDTO> listaRazas = memoryApi.obtenerRazas(especieSeleccionada.getTipo());
            for (RazaDTO raza : listaRazas) {
                comboBoxRaza.addItem(raza);
            }
        });
        contentPane.add(comboBoxEspecie);
        
        //RAZAS
        JComboBox comboBoxRaza = new JComboBox();
        comboBoxRaza.setBounds(165, 147, 116, 22);
        contentPane.add(comboBoxRaza);

	}


	protected int generarIDUnico() {
		return iD++;
	}
}