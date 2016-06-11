package DAO;

import DTO.TBLCategoriaTransaccionDTO;
import java.util.ArrayList;

public abstract class CategoriaTransaccionDao {

    public abstract int insert(TBLCategoriaTransaccionDTO obj) throws Exception;

    public abstract void update(TBLCategoriaTransaccionDTO obj) throws Exception;

    public abstract void delete(int id);

    public abstract ArrayList<TBLCategoriaTransaccionDTO> getList();

    public abstract TBLCategoriaTransaccionDTO get(int id);
    
    public abstract ArrayList<TBLCategoriaTransaccionDTO> getListByTipo(String tipo); 
}
