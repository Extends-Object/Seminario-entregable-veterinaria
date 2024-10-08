package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.MemoryApi;
import ar.edu.unrn.seminario.dto.AnimalDTO;
import ar.edu.unrn.seminario.dto.EspecieDTO;
import ar.edu.unrn.seminario.dto.RazaDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
	private JTextField textField_6;
	
	private static MemoryApi memoryApi; // Instancia de MemoryApi

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList<AnimalDTO> listaAnimales= new ArrayList<AnimalDTO>();
					RegistroAnimal frame = new RegistroAnimal(listaAnimales, memoryApi);
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
	public RegistroAnimal(ArrayList<AnimalDTO> listaAnimales, MemoryApi memoryApi) {  // Recibe la lista de animales
		
		this.memoryApi = memoryApi;
		
		ArrayList<RazaDTO> razas; //creo que esto se envia desde el main
        
		
		setTitle("Registrar mascotas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 784, 439);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Labels
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNombre.setBounds(30, 66, 65, 22);
        contentPane.add(lblNombre);

        JLabel lblEspecie = new JLabel("Especie");
        lblEspecie.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEspecie.setBounds(30, 101, 65, 22);
        contentPane.add(lblEspecie);

        JLabel lblRaza = new JLabel("Raza");
        lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRaza.setBounds(30, 146, 65, 22);
        contentPane.add(lblRaza);

        JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
        lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblFechaNacimiento.setBounds(30, 186, 116, 19);
        contentPane.add(lblFechaNacimiento);

        JLabel lblGenero = new JLabel("Género");
        lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblGenero.setBounds(30, 225, 65, 22);
        contentPane.add(lblGenero);

        JLabel lblPeso = new JLabel("Peso");
        lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPeso.setBounds(30, 270, 45, 13);
        contentPane.add(lblPeso);

        JLabel lblCaracteristicas = new JLabel("Características particulares");
        lblCaracteristicas.setBounds(462, 10, 180, 22);
        contentPane.add(lblCaracteristicas);

        JLabel lblCastrado = new JLabel("¿Está castrado?");
        lblCastrado.setBounds(30, 314, 100, 22);
        contentPane.add(lblCastrado);

        // Campos de texto
        campoNombre = new JTextField();    // Nombre
        campoNombre.setBounds(165, 69, 116, 19);
        contentPane.add(campoNombre);
        campoNombre.setColumns(10);

        campoFechaNac = new JTextField();  // Fecha de nacimiento
        campoFechaNac.setBounds(165, 187, 116, 19);
        contentPane.add(campoFechaNac);
        campoFechaNac.setColumns(10);

        campoPeso = new JTextField();  // Peso
        campoPeso.setBounds(165, 268, 116, 19);
        contentPane.add(campoPeso);
        campoPeso.setColumns(10);

        textField_6 = new JTextField();  // Características particulares
        textField_6.setBounds(462, 42, 283, 294);
        contentPane.add(textField_6);
        textField_6.setColumns(10);

        // Botones de Radio para Género
        JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
        rdbtnMasculino.setBounds(165, 227, 71, 21);
        contentPane.add(rdbtnMasculino);

        JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
        rdbtnFemenino.setBounds(247, 227, 79, 21);
        contentPane.add(rdbtnFemenino);

        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rdbtnMasculino);
        grupoGenero.add(rdbtnFemenino);

        // Botones de Radio para Castrado
        JRadioButton rdbtnCastradoSi = new JRadioButton("Si");
        rdbtnCastradoSi.setBounds(162, 315, 65, 21);
        contentPane.add(rdbtnCastradoSi);

        JRadioButton rdbtnCastradoNo = new JRadioButton("No");
        rdbtnCastradoNo.setBounds(247, 315, 71, 21);
        contentPane.add(rdbtnCastradoNo);

        ButtonGroup grupoCastrado = new ButtonGroup();
        grupoCastrado.add(rdbtnCastradoSi);
        grupoCastrado.add(rdbtnCastradoNo);

        // Botón "Aceptar"
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(501, 365, 85, 21);
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                // Recoger datos del formulario
                String nombre = campoNombre.getText();
                //String especie = textField_1.getText();
                String fechaNac = campoFechaNac.getText();
                String peso = campoPeso.getText();
                String sexo = rdbtnMasculino.isSelected() ? "Macho" : "Hembra";
                String caractParticulares = textField_6.getText();
                boolean estaCastrado = rdbtnCastradoSi.isSelected();
                
                memoryApi.agregarAnimal(nombre, fechaNac, peso, sexo, caractParticulares, estaCastrado);

                // Mensaje de confirmación
                JOptionPane.showMessageDialog(null, "Mascota registrada exitosamente.");
                
                // Limpiar los campos
                campoNombre.setText("");                
                campoFechaNac.setText("");
                campoPeso.setText("");                
                
                // Desmarcar los botones de radio
                ButtonGroup grupoGenero = new ButtonGroup();
                grupoGenero.clearSelection();

                ButtonGroup grupoCastrado = new ButtonGroup();
                grupoCastrado.clearSelection();
            }
        });
        contentPane.add(btnAceptar);
        
        // Botón "Cancelar"
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(651, 365, 85, 21);
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar la ventana
            }
        });
        
        contentPane.add(btnCancelar);
        
        
        //CONFIGURACION DE COMBOBOX
        
     // Cargar especies
        ArrayList<EspecieDTO> especies = memoryApi.obtenerEspecies();
        for (EspecieDTO especie : especies) {
            comboBoxEspecie.addItem(especie);
        }
        
        JComboBox comboBoxRaza = new JComboBox();
        comboBoxRaza.setBounds(165, 147, 116, 22);
        contentPane.add(comboBoxRaza);
        comboBoxRaza.add(razas);
        
        JComboBox comboBoxEspecie = new JComboBox();
        comboBoxEspecie.setBounds(165, 103, 116, 21);
        contentPane.add(comboBoxEspecie);

	}
}