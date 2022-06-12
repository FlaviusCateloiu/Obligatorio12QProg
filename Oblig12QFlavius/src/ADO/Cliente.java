/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import MisListas.*;
import java.io.Serializable;

/**
 * 
 * @author Flavius Florian Cateloiu
 */

public class Cliente implements Serializable {

    /* Atributos de clase: un int que permita luego asignar un número 
       correlativo al código de socio, impidiendo que se repita.
     */
    private static int num = 1;

    // Atributos miembro
    private final String codSocio; // final porque no va a variar una vez que se asigna a un socio ya no varía
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telf1;
    private String telf2;
    private String telf3;
    private int puntos; // campo propuesto para poder hacer luego operaciones 
    // de fidelización de cliente, el cliente ganaría puntos según unas reglas 
    // por cada alquiler que realice o también podría ser una relación por 
    // cada euro pagado.

    public Cliente(String dni, String nombre, String apellidos,
            String direccion, String telf1, String telf2, String telf3, int puntos) {
        codSocio = "cod_" + num;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telf1 = telf1;
        this.telf2 = telf2;
        this.telf3 = telf3;
        this.puntos = puntos;
        num++;
    }

    public Cliente(String dni, String telf1) {
        codSocio = "cod_" + num;
        this.dni = dni;
        this.telf1 = telf1;
        num++;
    }

    public Cliente(String dni, String nombre, String apellidos,
            String direccion, String telf1, int puntos) {
        codSocio = "cod_" + num;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telf1 = telf1;
        this.puntos = puntos;
        num++;
    }

    public String getCodSocio() {
        return codSocio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelf1() {
        return telf1;
    }

    public void setTelf1(String telf1) {
        this.telf1 = telf1;
    }

    public String getTelf2() {
        return telf2;
    }

    public void setTelf2(String telf2) {
        this.telf2 = telf2;
    }

    public String getTelf3() {
        return telf3;
    }

    public void setTelf3(String telf3) {
        this.telf3 = telf3;
    }

    public int getPuntos() {
        return puntos;
    }

    public String info() {
        String resp = null;
        resp = "Codigo Socio:" + this.getCodSocio() + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Apellidos: " + getApellidos() + "\n"
                + "Direccion: " + getDireccion() + "\n"
                + "Telefono 1: " + getTelf1() + "\n"
                + "Telefono 2: " + getTelf2() + "\n"
                + "Telefono 3: " + getTelf3() + "\n"
                + "Puntos: " + getPuntos() + "\n";
        return resp;
    }

    public boolean deudor(ListaAlquileres listaAlquiler) {
        boolean corr = false;

        return corr;
    }

    public void addpuntos(int puntos) {
        this.puntos += puntos;
    }

    /* Constructores: (nunca piden el codSocio ya que se asigna automáticamente 
    y tampoco se piden los puntos ya que se da de alta al socio con 0 puntos 
    o con una cantidad de puntos asignados como regalo por el alta)
    
    Un constructor que como mínimo pida el DNI y un teléfono.
    
    Y otros constructores de combinación de datos, por ejemplo uno que pida 
    todos los datos, menos los telf 2 y 3.

    Otro con todos los campos.


Setters y Getters
    Todos tienes setters y getters excepto:
    cosSocio : solo tiene getter

Y dudo sobre si 'puntos' debería tener setter ya que para eso debería haber 
    un método que permita implementar una regla de asignación de puntos 
    ligada al alquiler.


Métodos:

public String info // que de la información del Socio
public boolean deudor // que nos devuelva true si el Socio tiene 
    pendiente devolver algún artículo

public int addpuntos // que añada puntos a un Socio a partir de unas 
    reglas según algún alquiler realizado

     */
}
