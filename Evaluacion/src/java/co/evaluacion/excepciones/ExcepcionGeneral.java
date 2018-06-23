/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.evaluacion.excepciones;

/**
 *
 * @author Jorge Ramirez
 */
public class ExcepcionGeneral extends RuntimeException {
    public ExcepcionGeneral(){
        this ("ocurrio una excepcion");
    }
    public ExcepcionGeneral(String mensaje){
        super(mensaje);
    }
}
