package Vista;

import Comtrolador.OyenteCrearUsuario;
import Modelo.Usuario1;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Usuario {

    JFrame ventana = new JFrame("Registro Cajero");

    JPanel panel = new JPanel();
    //CREAMOS UN TEXTFIELD PARA EL ANCHO DEL CONTENIDO DE ESPACIO
    JTextField tnombre = new JTextField(10);
    JTextField tapellidos = new JTextField(10);
    JTextField tcedula = new JTextField(10);
    JTextField tedad = new JTextField(10);
    JTextField tdireccion = new JTextField(10);
    JTextField ttelefono = new JTextField(10);

    //CREAMOS UN JLABEL PARA PODER INGRESAR LOS DATOS
    JLabel nombres = new JLabel("Nombres:  ");
    JLabel apellidos = new JLabel("Apellidos:  ");
    JLabel num_cedula = new JLabel("Cédula:  ");
    JLabel edad = new JLabel("Edad:  ");
    JLabel direccion = new JLabel("Dirección:  ");
    JLabel telefono = new JLabel("Teléfono:  ");

    //CREAMOS UN JBUTTON PARA MOSTRAR LOS BOTONES 
    JButton b_guardar = new JButton("Guardar");
    JButton b_eliminar = new JButton("Eliminar ");
    JLabel etiqueta = new JLabel();
    public String verificarCliente;
    public String VerificarCliente;

    public Usuario() {
        ventana.setSize(400, 500);
        ventana.setLocation(100, 100);
        crearComponentes();
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setTitle("Registro Cajero");

    }

    public void crearComponentes() {
        ventana.getContentPane().add(panel);
        panel.setBackground(Color.CYAN);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints contenedor1 = new GridBagConstraints();
        //FIJAR EL PRIMER JLABEL Y EL JTEXTFIELD
        contenedor1.gridx = 0;
        contenedor1.gridy = 0;
        contenedor1.insets = new Insets(10, 10, 10, 10);
        panel.add(nombres, contenedor1);
        contenedor1.gridx = 1;
        contenedor1.gridy = 0;
        panel.add(tnombre, contenedor1);
        contenedor1.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor2 = new GridBagConstraints();
        contenedor2.gridx = 0;
        contenedor2.gridy = 1;
        contenedor2.insets = new Insets(10, 10, 10, 10);
        panel.add(apellidos, contenedor2);
        contenedor2.gridx = 1;
        contenedor2.gridy = 1;
        panel.add(tapellidos, contenedor2);
        contenedor2.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor3 = new GridBagConstraints();
        contenedor3.gridx = 0;
        contenedor3.gridy = 2;
        contenedor3.insets = new Insets(10, 10, 10, 10);
        panel.add(num_cedula, contenedor3);
        contenedor3.gridx = 1;
        contenedor3.gridy = 2;
        panel.add(tcedula, contenedor3);
        contenedor3.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor4 = new GridBagConstraints();
        contenedor4.gridx = 0;
        contenedor4.gridy = 3;
        contenedor4.insets = new Insets(10, 10, 10, 10);
        panel.add(edad, contenedor4);
        contenedor4.gridx = 1;
        contenedor4.gridy = 3;
        panel.add(tedad, contenedor4);
        contenedor4.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor6 = new GridBagConstraints();
        contenedor6.gridx = 0;
        contenedor6.gridy = 5;
        contenedor6.insets = new Insets(10, 10, 10, 10);
        panel.add(direccion, contenedor6);
        contenedor6.gridx = 1;
        contenedor6.gridy = 5;
        panel.add(tdireccion, contenedor6);
        contenedor6.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor7 = new GridBagConstraints();
        contenedor7.gridx = 0;
        contenedor7.gridy = 6;
        contenedor7.insets = new Insets(10, 10, 10, 10);
        panel.add(telefono, contenedor7);
        contenedor7.gridx = 1;
        contenedor7.gridy = 6;
        panel.add(ttelefono, contenedor7);
        contenedor7.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints g_boton = new GridBagConstraints();
        g_boton.gridy = 0;
        g_boton.gridy = 8;
        panel.add(b_guardar, g_boton);
        b_guardar.addActionListener(new OyenteCrearUsuario(this));

        g_boton.gridy = 1;
        g_boton.gridy = 8;
        panel.add(b_eliminar, g_boton);

    }

    public Usuario1 guardarCliente() {

        Usuario1 Usuario1 = new Usuario1();
        Usuario1.setNombres(tnombre.getText());
        Usuario1.setApellidos(tapellidos.getText());
        Usuario1.setCedula(tcedula.getText());
        Usuario1.setEdad(tedad.getText());
        Usuario1.setDireccion(tdireccion.getText());
        Usuario1.setTeléfono(ttelefono.getText());

        return Usuario1;

    }

    public Usuario1 verificarCliente() {
        Usuario1 Usuario = new Usuario1();
        Usuario.getNombres();
        Usuario.getApellidos();
        Usuario.setCedula(tcedula.getText());
        Usuario.getEdad();
        Usuario.getDireccion();
        Usuario.getTeléfono();
        

        return Usuario;

    }


    public static void main(String[] args) {
        Usuario Usuario = new Usuario();
    }
}

    
