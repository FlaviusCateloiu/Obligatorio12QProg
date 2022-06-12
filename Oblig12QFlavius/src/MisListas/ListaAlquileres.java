/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisListas;

import ADO.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Flavius Florian Cateloiu
 */
public class ListaAlquileres {

    private ArrayList<Alquiler> listaAlqui;
    
    public ListaAlquileres() {
        this.listaAlqui = new ArrayList();
    }

    public ListaAlquileres(ArrayList<Alquiler> listaAlqui) {
        this.listaAlqui = listaAlqui;
    }
    
    public boolean anadirAlquiler(Alquiler alqui) {
        boolean insertado = false;
        if (alqui != null) {
            insertado = listaAlqui.add(alqui);
        }
        return insertado;
    }
    
    public boolean borrarAlquiler(Alquiler alqui) {
        boolean borrado = false;
        if (alqui != null) {
            borrado = listaAlqui.remove(alqui);
        }
        return borrado;
    }
    
    public Alquiler buscaAlquiler(String codArt) {
        Alquiler alqui = null, enc = null; //se declaran dos instancias de Articulo, una es art que será nulo si no lo hay o enc si lo ha encontrado .
        boolean encontrado = false;
        Iterator<Alquiler> iterator = listaAlqui.iterator(); //Creamos el iterador especifico para la clase Articulo, dado que Iterator es de Object, sino lo tendriamos que castear
//recorremos la lista con Iterator, siempre que no lo hayamos encontrado, es decir que eonctrado==false
        while (iterator.hasNext() && encontrado == false) {
            alqui = iterator.next(); //linea de codigo para ver el siguiente
            if (alqui.getArticulo().getCodArt().equalsIgnoreCase(codArt)) { //pedimos el codigo del Articulo, y si es igual que el que le hemos pasado por parametro, entonces encontrado=true
                encontrado = true;
                enc = alqui; // Este enc es el objeto encontrado, que lo definimos a null en el inicio del método y ahora al encontrarlo lo asignamos a art
            }
        }
        return enc;
    }
    
    public boolean existeArticuloAlquilado(String codArt) {
        Articulo art = null;
        Alquiler alqui = null;
        boolean encontrado = false;
        Iterator<Alquiler> iterator = listaAlqui.iterator();

        while (encontrado == false && iterator.hasNext()) {
            alqui = iterator.next();
            art = alqui.getArticulo();
            if (art.getCodArt().equalsIgnoreCase(codArt)) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public int numAlquiler() {
        int num = 0;
        num = listaAlqui.size();
        return num;
    }
    
    public Alquiler getAlquiler(int pos) {
        Alquiler alqui = null;
        if (pos >= 0 && pos <= numAlquiler() - 1) {
            alqui = listaAlqui.get(pos);
        }
        return alqui;
    }
}
