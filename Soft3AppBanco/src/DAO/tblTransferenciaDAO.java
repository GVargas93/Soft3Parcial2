/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.PoolManager;

/**
 *
 * @author Alvaro
 */
public class tblTransferenciaDAO {

    private static PoolManager dbPool;

    public tblTransferenciaDAO()throws Exception {
                createPool();
    }
    
    private boolean createPool() throws Exception {
        dbPool = new PoolManager();
        return dbPool.testPool();
    }
}
