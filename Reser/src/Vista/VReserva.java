package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VReserva extends JFrame {

    JFrame j = new JFrame();
    JPanel P2 = new JPanel();
    JPanel P1 = new JPanel();
    JLabel l1 = new JLabel("Usuario:");
    JLabel l2 = new JLabel("Contraseña:");
    JTextField t1 = new JTextField(15);
    JTextField t2 = new JTextField(15);
    JButton b1 = new JButton("Entrar");
    JButton b2 = new JButton("Salir");
    JLabel etiqueta = new JLabel();
    ImageIcon image = new ImageIcon(getClass().getResource("/img/2.PNG"));

    public VReserva() {
        super("LOGIN");
        etiqueta.setIcon(image);
        setLocation(300, 300);
        setSize(700, 300);
        agregarComponentes();
        dispose();
        setVisible(true);
    }

    public void agregarComponentes() {
        getContentPane().add(P1);
        P1.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        P1.add(etiqueta, g);
        g.gridx = 0;
        g.gridy = 1;
        g.insets = new Insets(10, 10, 10, 10);

        P1.add(l1, g);
        g.gridy = 1;
        g.gridx = 1;

        P1.add(t1, g);
        g.gridy = 2;
        g.gridx = 0;

        P1.add(l2, g);
        g.gridx = 1;
        g.gridy = 2;

        P1.add(t2, g);
        g.gridx = 2;
        g.gridy = 2;

        P2.setLayout(new GridBagLayout());
        GridBagConstraints x = new GridBagConstraints();
        x.gridx = 0;
        x.gridy = 0;
        x.insets = new Insets(10, 10, 10, 10);

        P1.add(b2, g);
        x.gridx = 1;
        g.gridy = 1;

        P1.add(b1, g);
        g.gridx = 0;
        g.gridy = 1;

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText() == "Salir") {
                    System.exit(0);
                } else {
                    dispose();
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String usuario = "Cristian";
                String contraseña = "cris16";
                String pass = new String(t2.getText());
                if (t1.getText().equals(usuario) && pass.equals(contraseña)) {

                    Pprincipal p = new Pprincipal();
                    p.setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                            + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                            JOptionPane.ERROR_MESSAGE);

                }

            }

        });
    }

    public static void main(String[] args) {
        VReserva reserva = new VReserva();

    }

}
