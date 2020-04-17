/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;



import Modelo.Usuario1;
import Vista.Usuario;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Horarios extends JFrame {

    JTextField tf = new JTextField(15);
    JTextField tf2 = new JTextField(15);
    JTextField tf3 = new JTextField(15);
    JTextField tf4 = new JTextField(15);
    JTextField tf5 = new JTextField(15);
    JTextField tf6 = new JTextField(15);
    JTextField tf7 = new JTextField(15);
    JTextField tf8 = new JTextField(15);
    JTextArea A1 = new JTextArea("Martes a Sábado - 8:00 a 22:00");
    JLabel etiqueta = new JLabel();
    JButton aceptar;
    Usuario1 cliente;
    ImageIcon image = new ImageIcon(getClass().getResource("/imagen/can1.PNG"));

    public Horarios() {
        super("Horarios");
        etiqueta.setIcon(image);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        agregarComponentes();
        pack();
        setVisible(true);
        this.setLocationRelativeTo(null);

    }

    private void agregarComponentes() {

        JPanel contentpane, panel, panel2;
        panel = new JPanel(new GridBagLayout());
        contentpane = new JPanel(new GridBagLayout());
        panel2 = new JPanel();
        GridBagConstraints op = new GridBagConstraints();
        GridBagConstraints a = new GridBagConstraints();
        GridBagConstraints q = new GridBagConstraints();
        op.anchor = GridBagConstraints.WEST;

        op.insets = new Insets(10, 15, 10, 15);

        op.gridx = 1;
        op.gridy = 0;
        panel.add(etiqueta, op);

        op.gridx = 2;
        op.gridy = 1;

        op.gridx = 3;
        op.gridy = 1;

        op.gridx = 0;
        op.gridy = 1;

        op.gridx = 0;
        op.gridy = 2;
        panel.add(new JLabel("Fecha :"), op);

        op.gridx = 1;
        panel.add(tf3, op);

        op.gridx = 0;
        op.gridy = 4;
        panel.add(new JLabel("Cédula :"), op);

        op.gridy = 4;
        op.gridx = 1;
        panel.add(tf4, op);

        op.gridx = 0;
        op.gridy = 3;
        panel.add(new JLabel("Hora :"), op);
        op.gridx = 1;
        op.gridy = 3;
        panel.add(tf5, op);
        op.gridx = 2;
        op.gridy = 2;

        JButton verificar = new JButton("VERIFICAR");
        panel2.add(verificar);
        contentpane.add(panel, a);
        a.gridx = 0;
        a.gridy = 2;
        contentpane.add(panel2, a);
        setContentPane(contentpane);

       
        JButton N = new JButton("NUEVO");
        panel2.add(N);
        contentpane.add(panel, q);
        q.gridx = 0;
        q.gridy = 4;
        contentpane.add(panel2, a);
    
    N.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == N) {
                    new Usuario();
                }
            }
        });
    }
    public static void main(String[] args) {
        Horarios h = new Horarios();
    }
}
