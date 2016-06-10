/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author Alvaro
 */
public class tblTransferenciaCategoriaDTO {
    int Categoria_iD;
    String TipoCategoria;

//    el constructor
    public tblTransferenciaCategoriaDTO(int Categoria_iD, String TipoCategoria) {
        this.Categoria_iD = Categoria_iD;
        this.TipoCategoria = TipoCategoria;
    }



//    metodos getter y setter
//    ************************************************************************************
//    ************************************************************************************
    public int getCategoria_iD() {
        return Categoria_iD;
    }

    public void setCategoria_iD(int Categoria_iD) {
        this.Categoria_iD = Categoria_iD;
    }

    public String getTipoCategoria() {
        return TipoCategoria;
    }

    public void setTipoCategoria(String TipoCategoria) {
        this.TipoCategoria = TipoCategoria;
    }
//    ************************************************************************************
//    ************************************************************************************
}
