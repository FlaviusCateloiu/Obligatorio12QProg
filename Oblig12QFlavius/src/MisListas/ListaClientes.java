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
public class ListaClientes {

    private ArrayList<Cliente> listaCli;

    public ListaClientes() {
        listaCli = new ArrayList<Cliente>();
    }

    public ListaClientes(ArrayList<Cliente> listaCli) {
        this.listaCli = listaCli;
    }

    public boolean anadirCliente(Cliente cli) {
        boolean insertado = false;
        if (cli != null) {
            insertado = listaCli.add(cli);
        }
        return insertado;
    }
    
    public int numClientes() {
        int num = 0;
        num = listaCli.size();
        return num;
    }
    
    public Cliente getCliente(int pos) {
        Cliente cli = null;
        if (pos >= 0 && pos <= numClientes()- 1) {
            cli = listaCli.get(pos);
        }
        return cli;
    }
    
    public Cliente buscarCliente(String codCli) {
        Cliente cli = null, enc = null; //se declaran dos instancias de Articulo, una es art que será nulo si no lo hay o enc si lo ha encontrado .
        boolean encontrado = false;
        Iterator<Cliente> iterator = listaCli.iterator(); //Creamos el iterador especifico para la clase Articulo, dado que Iterator es de Object, sino lo tendriamos que castear
//recorremos la lista con Iterator, siempre que no lo hayamos encontrado, es decir que eonctrado==false
        while (iterator.hasNext() && encontrado == false) {
            cli = iterator.next(); //linea de codigo para ver el siguiente
            if (cli.getCodSocio().equalsIgnoreCase(codCli)) { //pedimos el codigo del Articulo, y si es igual que el que le hemos pasado por parametro, entonces encontrado=true
                encontrado = true;
                enc = cli; // Este enc es el objeto encontrado, que lo definimos a null en el inicio del método y ahora al encontrarlo lo asignamos a art
            }
        }
        return enc;
    }
}
