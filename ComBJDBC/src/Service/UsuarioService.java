
package Service;

import dao.UsuarioDAO;
import entidades.Usuario;
import java.util.ArrayList;

public class UsuarioService {
    UsuarioDAO udao = new UsuarioDAO();
    
   public void mostrarUsuarios(){
       System.out.println("Se muestra la lista..");
       ArrayList<Usuario> usuarios = udao.listarUsuarios();
       for (Usuario usuario : usuarios) {
           System.out.println(usuario);      
       }
       
   }
}
