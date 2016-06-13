/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TransferenciaDTO;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public abstract class TransferenciaDAO {

    public abstract int insert(TransferenciaDTO obj) throws Exception;

    public abstract void update(TransferenciaDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<TransferenciaDTO> getList();

    public abstract ArrayList<TransferenciaDTO> ListCategoria();

    public abstract TransferenciaDTO get(int id);

    public abstract TransferenciaDTO obtenernombreid(String nombrecategoria);
}
