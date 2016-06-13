/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CuentaDTO;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public abstract class CuentaDAO {

    public abstract int insert(CuentaDTO obj) throws Exception;

    public abstract void update(CuentaDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<CuentaDTO> getList();

    public abstract ArrayList<CuentaDTO> ListCategoria();

    public abstract CuentaDTO get(int id);

    public abstract CuentaDTO obtenernombreid(String nombrecategoria);
}
