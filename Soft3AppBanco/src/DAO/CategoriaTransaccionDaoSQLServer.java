package DAO;

import Conexion.Conexion;
import DTO.TBLCategoriaTransaccionDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//import org.apache.log4j.LogManager;

public class CategoriaTransaccionDaoSQLServer extends CategoriaTransaccionDao {

////    private static final org.apache.log4j.Logger logger = LogManager.getRootLogger();

    public CategoriaTransaccionDaoSQLServer() {
        ;
    }

    @Override
    public int insert(TBLCategoriaTransaccionDTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TBLCategoriaTransaccionDTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TBLCategoriaTransaccionDTO> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TBLCategoriaTransaccionDTO get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TBLCategoriaTransaccionDTO> getListByTipo(String tipo) {
        ArrayList<TBLCategoriaTransaccionDTO> categorias = new ArrayList<>();
        try {
            Conexion objConexion = Conexion.getOrCreate();

            PreparedStatement ps = objConexion.getObjConnection().prepareStatement("EXEC spCategoriaPorTipo  ?");
            ps.setString(1, tipo);
            ResultSet objResultSet = ps.executeQuery();

            while (objResultSet.next()) {
                TBLCategoriaTransaccionDTO categoria = new TBLCategoriaTransaccionDTO();
                int _categoriaId = objResultSet.getInt("idCategoria");
                categoria.setIdCategoria(_categoriaId);

                String _nombre = objResultSet.getString("nombre");
                categoria.setNombre(_nombre);

                String _tipo = objResultSet.getString("tipo");
                categoria.setTipo(_tipo);

                categorias.add(categoria);
            }

            objConexion.desconectar();
        } catch (Exception e) {
           // logger.error("Error al obtener categoria por tipo: " + e.toString());
        }
        return categorias;
    }

}
