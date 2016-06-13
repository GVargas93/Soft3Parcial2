/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CategoriaDTO;
import java.util.ArrayList;

/**
 *
 * @author Gerardo
 */
public abstract class CategoriaDAO {

    public abstract int insert(CategoriaDTO obj) throws Exception;

    public abstract void update(CategoriaDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<CategoriaDTO> getList();

    public abstract ArrayList<CategoriaDTO> ListCategoria();

    public abstract CategoriaDTO get(int id);

    public abstract CategoriaDTO obtenernombreid(String nombrecategoria);
}
