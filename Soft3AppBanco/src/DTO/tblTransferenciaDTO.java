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
public class tblTransferenciaDTO {

    int Transferencia_iD;
    String FechaTransferencia;
    String Monto;
    int Categoria_iD_Fk;

    public tblTransferenciaDTO(int Transferencia_iD, String FechaTransferencia, String Monto, int Categoria_iD_Fk) {
        this.Transferencia_iD = Transferencia_iD;
        this.FechaTransferencia = FechaTransferencia;
        this.Monto = Monto;
        this.Categoria_iD_Fk = Categoria_iD_Fk;
    }

    //    metodos getter y setter
//    ************************************************************************************
//    ************************************************************************************

    public int getTransferencia_iD() {
        return Transferencia_iD;
    }

    public void setTransferencia_iD(int Transferencia_iD) {
        this.Transferencia_iD = Transferencia_iD;
    }

    public String getFechaTransferencia() {
        return FechaTransferencia;
    }

    public void setFechaTransferencia(String FechaTransferencia) {
        this.FechaTransferencia = FechaTransferencia;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public int getCategoria_iD_Fk() {
        return Categoria_iD_Fk;
    }

    public void setCategoria_iD_Fk(int Categoria_iD_Fk) {
        this.Categoria_iD_Fk = Categoria_iD_Fk;
    }
//    ************************************************************************************
//    ************************************************************************************
}
