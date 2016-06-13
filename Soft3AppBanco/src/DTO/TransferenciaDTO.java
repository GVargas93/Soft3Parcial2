/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Gerardo
 */
public class TransferenciaDTO {

    private int transferenciaID;
    private String Fecha;
    private String Monto;
    private String motivoTransferencia;
    private int cuentaIdDestino;
    private int cuentaIdOrigen;

    public TransferenciaDTO() {
    }

    public int getTransferenciaID() {
        return transferenciaID;
    }

    public void setTransferenciaID(int transferenciaID) {
        this.transferenciaID = transferenciaID;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public String getMotivoTransferencia() {
        return motivoTransferencia;
    }

    public void setMotivoTransferencia(String motivoTransferencia) {
        this.motivoTransferencia = motivoTransferencia;
    }

    public int getCuentaIdDestino() {
        return cuentaIdDestino;
    }

    public void setCuentaIdDestino(int cuentaIdDestino) {
        this.cuentaIdDestino = cuentaIdDestino;
    }

    public int getCuentaIdOrigen() {
        return cuentaIdOrigen;
    }

    public void setCuentaIdOrigen(int cuentaIdOrigen) {
        this.cuentaIdOrigen = cuentaIdOrigen;
    }

}
