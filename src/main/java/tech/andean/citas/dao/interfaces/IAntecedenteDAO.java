package tech.andean.citas.dao.interfaces;

import java.util.List;
import tech.andean.citas.pojo.Antecedente;

public interface IAntecedenteDAO {
    public List<Antecedente> listarAntecedentes();
    public Antecedente obtenerAntecedente(int id);
    public void actualizarAntecedente(Antecedente antecedente);
    public void eliminarAntecedente(Antecedente antecedente);
}
