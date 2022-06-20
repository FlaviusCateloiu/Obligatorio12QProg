/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Flavius Florian Cateloiu
 */

public class Alquiler implements Serializable {
    // Atributos
    private Articulo a;
    private int dias;
    private Cliente cli;
    private Date fechaAlq;
    
    public Alquiler(Articulo a, int dias, Cliente cli) {
        this.a = a;
        this.dias = dias;
        this.cli = cli;
    }

    public Articulo getArticulo() {
        return a;
    }

    public void setArticulo(Articulo a) {
        this.a = a;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cli;
    }

    public void setCliente(Cliente cli) {
        this.cli = cli;
    }
    
    public Date getFechaAlq() {
        return this.fechaAlq;
    }
    
    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

}
