package ar.edu.unrn.seminario.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.dto.AnimalDTO;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList<AnimalDTO> listaAnimales= new ArrayList<>();
					RegistroAnimal frame = new RegistroAnimal(listaAnimales);
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
	public RegistroAnimal(ArrayList<AnimalDTO> listaAnimales) {  // Recibe la lista de animales
		ArrayList<RazaDTO> razas;
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
        lblNombre.setBounds(30, 31, 65, 22);
        contentPane.add(lblNombre);

        JLabel lblEspecie = new JLabel("Especie");
        lblEspecie.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEspecie.setBounds(30, 63, 65, 22);
        contentPane.add(lblEspecie);

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

        JLabel lblCaracteristicas = new JLabel("Características particulares");
        lblCaracteristicas.setBounds(462, 10, 180, 22);
        contentPane.add(lblCaracteristicas);

        JLabel lblCastrado = new JLabel("¿Está castrado?");
        lblCastrado.setBounds(30, 314, 100, 22);
        contentPane.add(lblCastrado);

        // Campos de texto
        textField = new JTextField();    // Nombre
        textField.setBounds(149, 33, 167, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();  // Especie
        textField_1.setBounds(149, 65, 167, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_3 = new JTextField();  // Fecha de nacimiento
        textField_3.setBounds(149, 129, 167, 19);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();  // Peso
        textField_4.setBounds(149, 215, 96, 19);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        textField_6 = new JTextField();  // Características particulares
        textField_6.setBounds(462, 42, 283, 294);
        contentPane.add(textField_6);
        textField_6.setColumns(10);

        // Botones de Radio para Género
        JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
        rdbtnMasculino.setBounds(149, 173, 103, 21);
        contentPane.add(rdbtnMasculino);

        JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
        rdbtnFemenino.setBounds(254, 173, 103, 21);
        contentPane.add(rdbtnFemenino);

        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(rdbtnMasculino);
        grupoGenero.add(rdbtnFemenino);

        // Botones de Radio para Castrado
        JRadioButton rdbtnCastradoSi = new JRadioButton("Afirmativo");
        rdbtnCastradoSi.setBounds(149, 315, 103, 21);
        contentPane.add(rdbtnCastradoSi);

        JRadioButton rdbtnCastradoNo = new JRadioButton("Negativo");
        rdbtnCastradoNo.setBounds(254, 315, 103, 21);
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
                String nombre = textField.getText();
                String especie = textField_1.getText();
                String raza = textField_2.getText();
                String fechaNac = textField_3.getText();
                int edad = Integer.parseInt(textField_5.getText());  // Edad
                String peso = textField_4.getText();
                String sexo = rdbtnMasculino.isSelected() ? "Macho" : "Hembra";
                String caractParticulares = textField_6.getText();
                boolean estaCastrado = rdbtnCastradoSi.isSelected();
                memoryApi.guardarAnimal()
                // Crear un nuevo objeto Animal y agregarlo a la lista
                //ESTO NO VA
                AnimalDTO nuevoAnimal = new AnimalDTO(nombre, especie, raza, fechaNac, edad, peso, sexo, estaCastrado, caractParticulares);
                listaAnimales.add(nuevoAnimal);

                // Mensaje de confirmación
                JOptionPane.showMessageDialog(null, "Mascota registrada exitosamente.");
                
                // Limpiar los campos
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
                textField_5.setText("");
                textField_6.setText("");
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
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(135, 100, 193, 22);
        contentPane.add(comboBox);
        comboBox.add(razas)

	}
}