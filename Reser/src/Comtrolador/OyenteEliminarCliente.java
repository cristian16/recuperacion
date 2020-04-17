package Comtrolador;

import Modelo.UsuarioBD;
import Vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteEliminarCliente implements ActionListener {

    Usuario Rcliente;
    UsuarioBD base;

    public OyenteEliminarCliente(Usuario c) {
        this.Rcliente = c;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // base.eliminarCliente(Rcliente.eliminarCliente());
    }

}
