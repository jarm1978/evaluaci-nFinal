/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.evalucacion.modelo;

/**
 *
 * @author Jorge Ramirez
 */
public class Empleado {
    public int id;
    public String noDocumento;
    public String tipoDocumento;
    public String nombre;
    public Double Sueldo;
    public Double descuento;

    public Empleado() {
    }

    public Empleado(String id, String noDocumento, String tipoDocumento, String nombre, String Sueldo) {
        this.id = Integer.parseInt(id);
        this.noDocumento = noDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.Sueldo = Double.parseDouble(Sueldo);
        this.descuento = calcuDescuento(this.Sueldo);
    }

    public Empleado(String noDocumento, String tipoDocumento, String nombre, String sueldo) {
        this.noDocumento = noDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.Sueldo = Double.parseDouble(sueldo);
        this.descuento = calcuDescuento(this.Sueldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    
    public double calcuDescuento(double valor){
        
        if(valor <= 500000){
            return 0.0;
        }
        if(valor > 500000 && valor < 1000000){
            return valor * 0.1;
        }
        if(valor >= 1000000){
            return valor * 0.2;
        }
        return 0.0;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", noDocumento=" + noDocumento + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + ", Sueldo=" + Sueldo + ", Descuento="+descuento+'}';
    }

   
}
