package Comtrolador;

import Modelo.Usuario1;
import Modelo.UsuarioBD;
import Vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.input.KeyCode.V;

class OyenteVFormulario implements ActionListener {

    Usuario u;
    UsuarioBD bd;
    Usuario1 a;

    public OyenteVFormulario(Usuario v) {
        this.u = v;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        a = u.guardarCliente();
        
        bd.guardarUsuarioBD(a);

    }
}
