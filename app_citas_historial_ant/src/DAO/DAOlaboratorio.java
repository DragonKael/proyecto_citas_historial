/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.mlaboratorio;
import app_citas_historial_ant.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UNSAAC
 */
public class DAOlaboratorio {
    //atributos para las consultas varibles globales
    private Conexion mysql=new Conexion();
    private Connection cn=mysql.conectar();
    private String query="";
    public Integer totalregistros;
    //metodo
    //listar
    public DefaultTableModel listar_laboratorio(String pbuscar)
    {
        DefaultTableModel modelo_laboratorio;
        String[]titulos={   "id_laboratorio",
                            "nombre",
                            "aforo",
                            "descripcion",
                            "creado_en"};
        Object[]registro=new Object[titulos.length];
        modelo_laboratorio=new DefaultTableModel(null,titulos);
        //la consulta
        query="call usp_listar_laboratorio (?)";
        //cargamoslos datos de la tabla
        try
        {
            CallableStatement cst=cn.prepareCall(query);
            cst.setString("ppbuscar", pbuscar);
            cst.execute();
            ResultSet rs=cst.getResultSet();
            while(rs.next())
            {
                registro[0]=rs.getString("id_laboratorio");
                registro[1]=rs.getString("nombre");                
                registro[2]=rs.getString("aforo");                
                registro[3]=rs.getString("descripcion");                
                registro[4]=rs.getString("creado_en");                
                //almacenamos en un arreglo de bytes al objeto grande
                //binario con una longitud mazxima de (2^32-1)caracteres(longblob)
                modelo_laboratorio.addRow(registro);
            }
            return modelo_laboratorio;
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
            return null;
        }
    }
    //insertar
    public String insertar_laboratorio(mlaboratorio omlaboratorio)
    {
        DefaultTableModel verificacion;
        String[]titulos={   "mensaje",
                            "coderror"};
        Object[]registro=new Object[titulos.length];
        verificacion=new DefaultTableModel(null,titulos);
        query="call usp_insertar_laboratorio(?,?,?,?)";
        try
        {
            CallableStatement cst=cn.prepareCall(query);
            cst.setString (1, omlaboratorio.getNombre());
            cst.setInt(2, omlaboratorio.getAforo());
            cst.setString (3, omlaboratorio.getDescripcion());
            cst.setString (4, omlaboratorio.getCreado_en());
            ///////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////
            cst.execute();
            ResultSet rs=cst.getResultSet();
            while(rs.next())
            {
                registro[0]=rs.getString("@mensaje");
                registro[1]=rs.getString("@coderror");
                //almacenamos en un arreglo de bytes al objeto grande
                //binario con una longitud mazxima de (2^32-1)caracteres(longblob)
                verificacion.addRow(registro);
            }
            return verificacion.getValueAt(0,0).toString();
            ///////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////
            
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
            return "error al insertar";
        }
    }   
    public String modificar_laboratorio(mlaboratorio omlaboratorio)
    {
        query="call usp_modificar_laboratorio(?,?,?,?,?)";
        try
        {
            DefaultTableModel verificacion;
            String[]titulos={   "mensaje",
                                "coderror"};
            Object[]registro=new Object[titulos.length];
            verificacion=new DefaultTableModel(null,titulos);
            CallableStatement cst=cn.prepareCall(query);
            cst.setInt(1,omlaboratorio.getId_laboratorio());
            cst.setString(2,omlaboratorio.getNombre());
            cst.setInt(3,omlaboratorio.getAforo());
            cst.setString(4,omlaboratorio.getDescripcion());
            cst.setString(5,omlaboratorio.getCreado_en());
            cst.execute();
            ResultSet rs=cst.getResultSet();
            while(rs.next())
            {
                registro[0]=rs.getString("@mensaje");
                registro[1]=rs.getString("@coderror");
                //almacenamos en un arreglo de bytes al objeto grande
                //binario con una longitud mazxima de (2^32-1)caracteres(longblob)
                verificacion.addRow(registro);
            }
            return verificacion.getValueAt(0,0).toString();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
            return "error al insertar";
        }      
    }
    public String eliminar_laboratorio(mlaboratorio omlaboratorio)
    {
        query="call usp_eliminar_laboratorio(?)";
        try
        {
            DefaultTableModel verificacion;
            String[]titulos={   "mensaje",
                                "coderror"};
            Object[]registro=new Object[titulos.length];
            verificacion=new DefaultTableModel(null,titulos);
            CallableStatement cst=cn.prepareCall(query);
            cst.setInt(1,omlaboratorio.getId_laboratorio());
            cst.execute();
            ResultSet rs=cst.getResultSet();
            while(rs.next())
            {
                registro[0]=rs.getString("@mensaje");
                registro[1]=rs.getString("@coderror");
                //almacenamos en un arreglo de bytes al objeto grande
                //binario con una longitud mazxima de (2^32-1)caracteres(longblob)
                verificacion.addRow(registro);
            }
            return verificacion.getValueAt(0,0).toString();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null,e);
            return "error al eliminar";
        }
    }
}
