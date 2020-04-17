package Comtrolador;

import Vista.VReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OyenteVentanaP extends JFrame {

    JMenuBar menu = new JMenuBar();
    JMenu menu1;
    JMenuItem InicioSesion, Salir;

    public OyenteVentanaP() {
        super("Cancha Sintética");
        dispose();
        setSize(400, 400);
        setLocationRelativeTo(null);
        iniciarComponentes();
        setVisible(true);

    }

    public JMenuItem getInicioSecion() {
        return InicioSesion;
    }

    public JMenuItem getMiSalir() {
        return Salir;
    }

    private void iniciarComponentes() {

        setJMenuBar(menu);
        menu1 = new JMenu("Usuario");
        menu.add(menu1);

        InicioSesion = new JMenuItem("Inicio de Sesión");
        InicioSesion.addActionListener(new VentanaP());
        menu1.add(InicioSesion);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new VentanaP());
        menu1.add(Salir);
    }

    public class VentanaP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Salir) {
                System.exit(0);
            }
            if (e.getSource() == InicioSesion) {
                VReserva reserva = new VReserva();

            }

        }
    }

    public static void main(String[] args) {
        OyenteVentanaP p = new OyenteVentanaP();

    }

}
