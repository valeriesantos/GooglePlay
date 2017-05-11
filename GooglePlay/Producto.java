
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    // instance variables - replace the example below with your own
        private String titulo;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String titulo)
    {
        this.titulo = titulo;
    }
    
    protected String getTit(){
        return titulo;
    }

   
}
