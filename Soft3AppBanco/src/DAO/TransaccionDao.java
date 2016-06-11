/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TBLTransaccionDTO;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public abstract class TransaccionDao {

    public abstract int insert(TBLTransaccionDTO obj) throws Exception;

    public abstract void update(TBLTransaccionDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<TBLTransaccionDTO> getList();

    public abstract TBLTransaccionDTO get(int id);

    public abstract ArrayList<TBLTransaccionDTO> getListByTipo(String tipo);
}
