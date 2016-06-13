package Factory;

import DAL.Configuracion;
import DAO.*;

class FactoryDaoSQLServer extends FactoryDao {

    private FactoryDaoSQLServer() {
        dbEngine = "MySQL";
    }

    public static FactoryDao getFactoryInstance() {
        instancia = new FactoryDaoSQLServer();
        return instancia;
    }

    @Override
    public CuentaDAO getNewCuentaDAO() {
        return new CuentaDAOSqlServer();
    }

    @Override
    public CategoriaDAO getNewCategoriaDao() {
        return new CategoriaDAOSqlServer();
    }

    @Override
    public TransaccionDAO getNewTransaccionDAO() {
        return new TransaccionDAOSqlServer();
    }

    @Override
    public TransferenciaDAO getNewTransferenciaDAO() {
        return new TransferenciaDAOSqlServer();
    }
    
}
