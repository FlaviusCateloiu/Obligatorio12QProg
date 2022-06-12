/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisListas;

import java.util.ArrayList;
import ADO.*;
import java.util.Iterator;

/**
 * 
 * @author Flavius Florian Cateloiu
 */
public class ListaAutores {
    
    ArrayList<Autor> listaAutor;
    
    public ListaAutores() {
        listaAutor = new ArrayList();
    }
    
    public ListaAutores(ArrayList<Autor> listaAutor) {
        this.listaAutor = listaAutor;
    }
    
    public boolean anadirAutor(Autor aut) {
        boolean insertado = false;
        if (aut != null) {
            insertado = listaAutor.add(aut);
        }
        return insertado;
    }
    
    public Autor buscaAutor(String nomApell) {
        Autor autor = null, enc = null;
        boolean encontrado = false;
        String cadena;
        Iterator<Autor> iterator = listaAutor.iterator();
        while (iterator.hasNext() && encontrado == false) {
            autor = iterator.next();
            cadena = autor.getNom()+autor.getApell();
            if (cadena.equalsIgnoreCase(nomApell)) {
                enc = autor;
                encontrado = true;
            }
        }
        return enc;
    }
    
    public int numAutores() {
        int num = 0;
        num = listaAutor.size();
        return num;
    }
    
    public Autor getAutor(int pos) {
        Autor aut = null;
        if (pos >= 0 && pos <= numAutores() - 1) {
            aut = listaAutor.get(pos);
        }
        return aut;
    }
}
