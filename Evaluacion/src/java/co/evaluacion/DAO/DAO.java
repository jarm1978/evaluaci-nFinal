/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.evaluacion.DAO;

import java.util.List;

/**
 *
 * @author Jorge Ramirez
 * @param <K>
 * @param <O>
 */
public interface DAO<K,O> {
    public void insertar(O o);
    public O obtenerPorId(K k);
    public List<O>listar();
}
