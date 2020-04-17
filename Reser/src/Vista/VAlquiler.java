package Vista;

import Modelo.Usuario1;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VAlquiler extends JFrame {

    JTextField tf = new JTextField(15);
    JTextField tf2 = new JTextField(15);
    JTextField tf3 = new JTextField(15);
    JTextField tf4 = new JTextField(15);
    JTextField tf5 = new JTextField(15);
    JTextField tf6 = new JTextField(15);
    JTextField tf7 = new JTextField(15);
    JTextField tf8 = new JTextField(15);
    JTextArea A1 = new JTextArea("Martes a Sábado - 8:00 a 22:00");
    JTextArea A2 = new JTextArea("Lunes y Domingo no hay atención");
    JLabel etiqueta = new JLabel();
    JButton aceptar;
    Usuario1 cliente;
    ImageIcon image = new ImageIcon(getClass().getResource("/img/can1.PNG"));

    public VAlquiler() {
        super("REGISTRAR RESERVA");
        setLocation(300, 300);
        etiqueta.setIcon(image);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        agregarComponentes();
        pack();
        setVisible(true);
    }

    private void agregarComponentes() {

        JPanel contentpane, panel, panel2 = null;
        panel = new JPanel(new GridBagLayout());
        contentpane = new JPanel(new GridBagLayout());
        panel2 = new JPanel();
        GridBagConstraints op = new GridBagConstraints();
        GridBagConstraints a = new GridBagConstraints();
        op.anchor = GridBagConstraints.WEST;

        op.insets = new Insets(10, 15, 10, 15);

        op.gridx = 1;
        op.gridy = 0;
        panel.add(etiqueta, op);

        op.gridx = 2;
        op.gridy = 1;
        panel.add(new JButton("5 minutos más"), op);

        op.gridx = 3;
        op.gridy = 1;

        op.gridx = 0;
        op.gridy = 1;
        panel.add(new JLabel("Horarios de Atención:"), op);

        op.gridx = 1;
        panel.add(A1, op);

        op.gridx = 0;
        op.gridy = 2;
        panel.add(new JLabel("Hora de Inicio:"), op);

        op.gridx = 1;
        panel.add(tf3, op);

        op.gridx = 0;
        op.gridy = 4;
        panel.add(new JLabel("Registro de Reserva:"), op);

        op.gridy = 4;
        op.gridx = 1;
        panel.add(tf4, op);

        op.gridx = 0;
        op.gridy = 3;
        panel.add(new JLabel("Hora de Sálida:"), op);
        op.gridx = 1;
        op.gridy = 3;
        panel.add(tf5, op);
        op.gridx = 2;
        op.gridy = 2;
        panel.add(new JButton("Cancelado"), op);
        op.gridy = 2;
        op.gridx = 3;

        op.gridx = 2;
        op.gridy = 3;
        panel.add(new JButton("Falta por Cancelar"), op);
        op.gridy = 3;
        op.gridx = 3;

        aceptar = new JButton("ACEPTAR");
        JButton eliminar = new JButton("ELIMINAR");

        panel2.add(eliminar);
        panel2.add(aceptar);
        a.gridx = 0;
        a.gridy = 0;
        contentpane.add(panel, a);
        a.gridx = 0;
        a.gridy = 2;
        contentpane.add(panel2, a);
        setContentPane(contentpane);

        eliminar.addActionListener((ae) -> {
            dispose();
        });
    }

    public static void main(String[] args) {
        VAlquiler w = new VAlquiler();
    }

}
