package DTO;

import java.sql.Date;

public class TBLTransaccionDTO {

    private int Transaccion_iD;
    private Date FechaTransaccion;
    private String Monto;
//    private String MotivoTransaccion;
    private int Categoria_iD_FK;
    private int Cuenta_iD_FK;

    public int getCuenta_iD_FK() {
        return Cuenta_iD_FK;
    }

    public void setCuenta_iD_FK(int Cuenta_iD_FK) {
        this.Cuenta_iD_FK = Cuenta_iD_FK;
    }

    public TBLTransaccionDTO() {

    }

    public int getTransaccion_iD() {
        return Transaccion_iD;
    }

    public void setTransaccion_iD(int Transaccion_iD) {
        this.Transaccion_iD = Transaccion_iD;
    }

    public Date getFechaTransaccion() {
        return FechaTransaccion;
    }

    public void setFechaTransaccion(Date FechaTransaccion) {
        this.FechaTransaccion = FechaTransaccion;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public int getCategoria_iD_FK() {
        return Categoria_iD_FK;
    }

    public void setCategoria_iD_FK(int Categoria_iD_FK) {
        this.Categoria_iD_FK = Categoria_iD_FK;
    }

}
