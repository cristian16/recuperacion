package Comtrolador;

import Modelo.Usuario1;
import Modelo.UsuarioBD;
import Vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearUsuario implements ActionListener {

    Usuario Rcliente;
    UsuarioBD base;
    Usuario1 cliente;

    public OyenteCrearUsuario(Usuario c) {
        this.Rcliente = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //de la vista recibo un cliente
        cliente = Rcliente.guardarCliente();
        //en la base de datos se registra un cliente a guardar
        base.guardarUsuarioBD(cliente);
    }
}
