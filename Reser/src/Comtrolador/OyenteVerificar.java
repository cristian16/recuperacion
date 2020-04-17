package Comtrolador;

import Modelo.Usuario1;
import Modelo.UsuarioBD;
import Vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OyenteVerificar implements ActionListener {

    Usuario cliente;
    UsuarioBD base;
    Usuario1 c;

    public OyenteVerificar(Usuario c) {
        this.cliente = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c = base.guardarUsuarioBD(cliente.verificarCliente());
        if (c.getCedula() == null) {

        } else {

            JOptionPane.showMessageDialog(base, "El Cliente: " + c.getNombres() + " " + c.getApellidos() + ", ya se encuentra registrado");
        }
    }
}

}
