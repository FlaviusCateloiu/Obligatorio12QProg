
package ADO;

import java.util.Date;

/**
 * 
 * @author Flavius Florian Cateloiu
 */

public abstract class Libro extends Articulo {
    // atrinutos miembro
    private int numPaginas;

    public Libro(int numPaginas, String cod, String nombre, Date fecha, 
            int anyo, String resumen, Autor autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.numPaginas = numPaginas;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    
    
}
