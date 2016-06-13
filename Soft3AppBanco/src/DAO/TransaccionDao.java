/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TransaccionDTO;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public abstract class TransaccionDAO {

    public abstract int insert(TransaccionDTO obj) throws Exception;

    public abstract void update(TransaccionDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<TransaccionDTO> getList();

    public abstract TransaccionDTO get(int id);
}
