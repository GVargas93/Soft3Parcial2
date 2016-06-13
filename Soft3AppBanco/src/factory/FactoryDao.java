package Factory;

import DAL.Configuracion;
import DAO.*;

public abstract class FactoryDao {

    protected static FactoryDao instancia;
    protected String dbEngine;

    public static FactoryDao getFactoryInstance() {
        Configuracion config = Configuracion.getConfiguracion();
        if (instancia == null || !instancia.getDbEngine().equals(config.getDbEngine())) {

            if (config.getDbEngine().equals("SQLServer"));
            instancia = FactoryDaoSQLServer.getFactoryInstance();
        }
        return instancia;
    }

    public abstract CuentaDAO getNewCuentaDAO();

    public abstract CategoriaDAO getNewCategoriaDao();

    public abstract TransaccionDAO getNewTransaccionDAO();

    public abstract TransferenciaDAO getNewTransferenciaDAO();

    private String getDbEngine() {
        return dbEngine;
    }

    private void setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
    }

}
