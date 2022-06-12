/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import java.io.Serializable;

/**
 * 
 * @author Flavius Florian Cateloiu
 */

public class Autor implements Serializable {
  // atributos de Autor
    private String nom;
    private String apell;
    private int edad;
    private int publicaciones;
    
    public Autor(String nom, String apell, int edad, int publicaciones) {
        this.nom = nom;
        this.apell = apell;
        this.edad = edad;
        this.publicaciones = publicaciones;
    }
    
    public Autor(String nom, String apell) {
        this.nom = nom;
        this.apell = apell;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    public String info() {
        return nom +" "+ apell + ", edad: " + edad + ", numero de publicaciones=" + publicaciones + ".";
    }
}
