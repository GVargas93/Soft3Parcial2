/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAL.Conexion;
import DTO.TransaccionDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public class TransaccionDAOSqlServer extends TransaccionDAO {

    @Override
    public int insert(TransaccionDTO obj) throws Exception {
        Conexion objConexion = Conexion.getOrCreate();
        int id = 0;
        StringBuilder query = new StringBuilder("INSERT INTO DML.Tbl_Transacciones (FechaTransaccion, Monto,MotivoTransaccion, Categoria_iD_Fk,Cuenta_iD_Fk ) VALUES (");
        query.append("'" + obj.getFecha() + "',");
        query.append("'" + obj.getMonto() + "',");
        query.append("'" + obj.getMotivoTransaccion() + "',");
        query.append(+obj.getCategoriaIDFK() + ",");
        query.append(+obj.getCuentaIDFK() + ")");

        id = objConexion.ejecutarInsert(query.toString());
        if (id == 0) {
            throw new Exception("El registro no pudo ser insertado");
        }
        objConexion.desconectar();
        return id;
    }

    @Override
    public void update(TransaccionDTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TransaccionDTO> getList() {
        ArrayList<TransaccionDTO> historial = new ArrayList<TransaccionDTO>();
        try {
            Conexion objConexion = Conexion.getOrCreate();
            String query = "exec DML.Select_Transaccion";
            ResultSet objResultSet = objConexion.ejecutarSelect(query);
            while (objResultSet.next()) {

                TransaccionDTO obj = new TransaccionDTO();
                int transaccion_Id = objResultSet.getInt("Transaccion_iD");
                obj.setTransaccionID(transaccion_Id);

                String fecha = objResultSet.getString("FechaTransaccion");
                obj.setFecha(fecha);

                String motivoTransaccion = objResultSet.getString("MotivoTransaccion");
                obj.setFecha(motivoTransaccion);

                String monto = objResultSet.getString("Monto");
                obj.setMonto(monto);

                int categoria_iD_fk = objResultSet.getInt("Categoria_iD_Fk");
                obj.setCategoriaIDFK(categoria_iD_fk);

                int cuenta_iD_fk = objResultSet.getInt("Cuenta_iD_Fk");
                obj.setCuentaIDFK(cuenta_iD_fk);

                historial.add(obj);
            }
        } catch (Exception ex) {

        }
        return historial;
    }

    @Override
    public TransaccionDTO get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
