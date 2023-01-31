package dao;

import entidades.Usuario;
import java.util.ArrayList;

public class UsuarioDAO extends DAO {

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();
        try {
            String query = "SELECT clave, nombre, mail FROM usuario";
            consultarBd(query);
            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setClave(resultado.getInt(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setMail(resultado.getString(3));

                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            desconectarBd();
        }
        return usuarios;
    }
}
