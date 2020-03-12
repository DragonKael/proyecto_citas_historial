package tech.andean.citas;

import tech.andean.citas.dao.interfaces.IUsuarioDAO;
import tech.andean.citas.dao.mysql.UsuarioDAOMySQL;
import tech.andean.citas.pojo.Usuario;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String args[]){

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombreUsuario("alexove");
        usuario.setNombre("Alex");
        usuario.setApPaterno("Oviedo");
        usuario.setApMaterno("Solis");
        usuario.setEmail("alexove@alexove.me");
        usuario.setClave("1234");
        usuario.setCreadoEn(new Date().toString());

        IUsuarioDAO uDao=new UsuarioDAOMySQL();
        uDao.guardarUsuario(usuario);



        List<Usuario> usuarios = uDao.listarUsuarios();
        for(int i=0;i<usuarios.size();i++){
            Usuario u = usuarios.get(i);
            System.out.println("-> "+u.getNombre()+" "+u.getApPaterno());
        }

    }
}
