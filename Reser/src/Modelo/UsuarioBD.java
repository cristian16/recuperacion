package Modelo;

import Vista.Usuario;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioBD {
    
    public static void guardarUsuarioBD(Usuario1 usuario) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:Driver://localhost/reserva","root","cris");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into usuario values('" + usuario.getNombres() + "','" + usuario.getApellidos()
                    + "','" + usuario.getCedula() + "','" + usuario.getEdad() + "','"
                    + usuario.getDireccion() + "','" + usuario.getTeléfono() + "')");
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }

    public static void eliminarCliente(String cedula) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost//resevacancha", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from clientes where Cedula = '" + cedula + "'");
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.print("Error en la conexion" + e);
        }
    }

    public static Usuario1 buscarUsuario (String cedula) {

        Usuario1 cliente = new Usuario1();;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/resevacancha", "root", "cris");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            ResultSet encontrar = sentencia.executeQuery("select * from estudiante "
                    + "where Cédula = '" + cedula + "'");

            while (encontrar.next()) {
                String cedul = encontrar.getString("Cédula");
                String nombre = encontrar.getString("Nombres");
                String apellido = encontrar.getString("Apellidos");
                String tel = encontrar.getString("Telefono");
                String dir = encontrar.getString("Direccion");
                String edad = encontrar.getString("Edad");

                cliente.setCedula(cedul);
                cliente.setNombres(nombre);
                cliente.setApellidos(apellido);
                cliente.setTeléfono(tel);
                cliente.setDireccion(dir);
                cliente.setEdad(edad);
            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return cliente;
    }

    public static ArrayList cargarNombres() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/resevacancha", "root", "cris");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select nombres,apellidos from usuario");

            ArrayList<Object> listaNombres = new ArrayList<>();
            while (necesario.next()) {

                String nom = necesario.getString("nombres");
                String ape = necesario.getString("apellidos");

                listaNombres.add(nom + " " + ape);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        ArrayList listaNombres = null;
        return listaNombres;

    }

    //actualizar cliente
    public void actualizarUsuario(Usuario1 usuario) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/resevacancha", "root", "cris");
            System.out.print("Conexion establecida!");

            Statement sentencia = conexion.createStatement();

            int update = sentencia.executeUpdate("update alumno.alumno set Nombre='" + usuario.getNombres() + "' ,'"
                    + usuario.getApellidos() + "','" + usuario.getDireccion() + "' ,'" + usuario.getEdad() + "' where ( Cedula = '" + usuario.getCedula() + "')");

            sentencia.close();
            conexion.close();
        } catch (Exception t) {
            System.out.print("Error en la conexion" + t);
        }
    }

    public static ArrayList cargarusuario() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/resevacancha", "root", "cris");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet encontrar = sentencia.executeQuery("select * from estudiante");
            Usuario1 cliente = null;

            ArrayList<Object> listaNombres = new ArrayList<>();
            while (encontrar.next()) {

                String ced = encontrar.getString("nombres");
                String nom = encontrar.getString("apellidos");
                String ape = encontrar.getString("cedula");
                String tel = encontrar.getString("edad");
                String dir = encontrar.getString("direccion");
                String corr = encontrar.getString("telefono");

                Usuario1 Usuario1 = new Usuario1();

                cliente.setCedula(ced);
                cliente.setNombres(nom);
                cliente.setApellidos(ape);
                cliente.setTeléfono(tel);
                cliente.setDireccion(dir);

            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return null;

    

}
}

