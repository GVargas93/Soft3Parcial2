/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Gerardo
 */
public class TransaccionDTO {

    private int transaccionID;
    private String Fecha;
    private String Monto;
    private String motivoTransaccion;
    private int categoriaIDFK;
    private int cuentaIDFK;

    public TransaccionDTO() {
    }

    public int getTransaccionID() {
        return transaccionID;
    }

    public void setTransaccionID(int transaccionID) {
        this.transaccionID = transaccionID;
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

    public String getMotivoTransaccion() {
        return motivoTransaccion;
    }

    public void setMotivoTransaccion(String motivoTransaccion) {
        this.motivoTransaccion = motivoTransaccion;
    }

    public int getCategoriaIDFK() {
        return categoriaIDFK;
    }

    public void setCategoriaIDFK(int categoriaIDFK) {
        this.categoriaIDFK = categoriaIDFK;
    }

    public int getCuentaIDFK() {
        return cuentaIDFK;
    }

    public void setCuentaIDFK(int cuentaIDFK) {
        this.cuentaIDFK = cuentaIDFK;
    }

}
