/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.tblCuentaDTO;
import java.util.ArrayList;

/**
 *
 * @author Jose Clavijo
 */
public abstract class Cuentadao {
    public abstract int insert(tblCuentaDTO obj) throws Exception;

    public abstract void update(tblCuentaDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<tblCuentaDTO> getList();

    public abstract tblCuentaDTO get(int id);

    public abstract ArrayList<tblCuentaDTO> getListByTipo(String tipo); 
}
