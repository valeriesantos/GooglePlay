
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own

    private int numPaginas;
    private boolean libroFiccion;
    

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int annioCreacion,int numPaginas, boolean libroFiccion)
    {
        super(titulo,annioCreacion);
        this.libroFiccion = libroFiccion;
        this.numPaginas = numPaginas;
    }

    public int getNumeroPaginas() {
        return numPaginas;
    }

    public boolean getFiccion(){

        if(libroFiccion == false ){
            libroFiccion = false;
        }
        else{
        }
        return libroFiccion;
    }

    public double getPrecio(){
        
        double precioLibro = 0;
        
        precioLibro = (numPaginas / 100) * (getAno() - 2010);
         return precioLibro;
    }
}

