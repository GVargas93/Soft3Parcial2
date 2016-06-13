/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAL.Conexion;
import DTO.CategoriaDTO;
import DTO.CuentaDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public class CategoriaDAOSqlServer extends CategoriaDAO{

    @Override
    public int insert(CategoriaDTO obj) throws Exception {
    Conexion objConexion = Conexion.getOrCreate();
    
      int id = 0;
        StringBuilder query = new StringBuilder("{call DML.Ins_Transacciones(");
        query.append("'" + obj.getCategoriaId()+ "',");
        query.append("'" + obj.getTipoCategoria()+ "')");
   
        query.append("}");
        id = objConexion.ejecutarInsert(query.toString());
        if (id == 0) {
            throw new Exception("El registro no pudo ser insertado");
        }
        objConexion.desconectar();
        return id;
    }

    @Override
    public void update(CategoriaDTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CategoriaDTO> getList() {
             ArrayList<CategoriaDTO> registros = new ArrayList<CategoriaDTO>();
        try {
            Conexion objConexion = Conexion.getOrCreate();
            String query = "exec Select_Cuenta";
            ResultSet objResultSet = objConexion.ejecutarSelect(query);
            while (objResultSet.next()) {

                CategoriaDTO obj = new CategoriaDTO();
                int cuenta_id = objResultSet.getInt("Categoria_iD");
                obj.setCategoriaId(cuenta_id);

                String nrocuenta = objResultSet.getString("TipoCategoria");
                obj.setTipoCategoria(nrocuenta);


        
                registros.add(obj);
            }
        } catch (Exception ex) {

        }
        return registros;
    }

    @Override
    public ArrayList<CategoriaDTO> ListCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaDTO get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaDTO obtenernombreid(String nombrecategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
