/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAL.Conexion;
import DTO.CuentaDTO;
import DTO.TransaccionDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public class CuentaDAOSqlServer extends CuentaDAO {
  Conexion objConexion = Conexion.getOrCreate();
    @Override
    public int insert(CuentaDTO obj) throws Exception {
      int id = 0;
        StringBuilder query = new StringBuilder("{call DML.Ins_Cuenta(");
        query.append("" + obj.getCuentaID()+ ",");
        query.append("'" + obj.getNroCuenta() + "',");
        query.append("'" + obj.getSaldo() + "')");
      
        query.append("}");
        id = objConexion.ejecutarInsert(query.toString());
        if (id == 0) {
            throw new Exception("El registro no pudo ser insertado");
        }
        objConexion.desconectar();
        return id;
    }

    @Override
    public void update(CuentaDTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CuentaDTO> getList() {
        ArrayList<CuentaDTO> registros = new ArrayList<CuentaDTO>();
        try {
            Conexion objConexion = Conexion.getOrCreate();
            String query = "exec Select_Cuenta";
            ResultSet objResultSet = objConexion.ejecutarSelect(query);
            while (objResultSet.next()) {

                CuentaDTO obj = new CuentaDTO();
                int cuenta_id = objResultSet.getInt("Cuenta_iD");
                obj.setCuentaID(cuenta_id);

                String nrocuenta = objResultSet.getString("NroCuenta");
                obj.setNroCuenta(nrocuenta);

                String saldos = objResultSet.getString("Saldo");
                obj.setSaldo(saldos);

        
                registros.add(obj);
            }
        } catch (Exception ex) {

        }
        return registros;
    }

    @Override
    public ArrayList<CuentaDTO> ListCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CuentaDTO get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CuentaDTO obtenernombreid(String nombrecategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
