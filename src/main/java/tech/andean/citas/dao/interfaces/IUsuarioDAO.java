package tech.andean.citas.dao.interfaces;

import java.util.List;
import tech.andean.citas.pojo.Usuario;

public interface IUsuarioDAO {
    public List<Usuario> listarUsuarios();
    public Usuario obtenerUsuario(int id);
    public void guardarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}
