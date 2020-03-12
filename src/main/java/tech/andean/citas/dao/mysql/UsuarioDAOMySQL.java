package tech.andean.citas.dao.mysql;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import tech.andean.citas.dao.mysql.singleton.MySQLConnection;
import tech.andean.citas.pojo.Usuario;
import tech.andean.citas.dao.interfaces.IUsuarioDAO;
import java.sql.PreparedStatement;

public class UsuarioDAOMySQL implements IUsuarioDAO {
    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios=new ArrayList<>();
        try{
            String consulta = "SELECT * FROM tusuario";
            PreparedStatement p;
            p=MySQLConnection.getInstance().getConnection().prepareStatement(consulta);
            ResultSet rs = p.executeQuery();

            while(rs.next()){
                Usuario u = new Usuario();
                u.setId(rs.getInt("id_usuario"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApPaterno(rs.getString("apaterno"));
                u.setApMaterno(rs.getString("amaterno"));
                u.setEmail(rs.getString("email"));
                u.setClave(rs.getString("contrasenia"));
                u.setActivo(rs.getBoolean("es_activo"));
                u.setAdministrador(rs.getBoolean("es_administrador"));
                u.setCreadoEn(rs.getString("creado_en"));
                usuarios.add(u);
            }
            return usuarios;
        }catch (SQLException ex){
            System.out.println(ex.getLocalizedMessage());
            return null;
        }
    }
    public Usuario obtenerUsuario(int id){
        return new Usuario();
    }
    public void guardarUsuario(Usuario usuario){
        try{
            String consulta = "INSERT INTO tusuario VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p;
            p = MySQLConnection.getInstance().getConnection().prepareStatement(consulta);
            p.setInt(1,usuario.getId()); // ID
            p.setString(2,usuario.getNombreUsuario()); // nombre_usuario
            p.setString(3,usuario.getNombre()); // nombre
            p.setString(4,usuario.getApPaterno()); // apPaterno
            p.setString(5,usuario.getApMaterno()); // apMaterno
            p.setString(6,usuario.getEmail()); // email
            p.setString(7,usuario.getClave()); // contrasenia
            p.setBoolean(8,usuario.isActivo()); // activo
            p.setBoolean(9,usuario.isAdministrador()); // administrador
            //p.setDate(10,new Date(new java.util.Date(usuario.getCreadoEn()).getTime())); // creado en
            p.setDate(10,new Date(0)); // creado en

            p.executeUpdate();
        }catch (SQLException ex){
            System.out.println("UsuarioDAOMySQL.guardarUsuario => "+ex.getLocalizedMessage());
        }
    }
    public void actualizarUsuario(Usuario usuario){

    }
    public void eliminarUsuario(Usuario usuario){

    }
}
