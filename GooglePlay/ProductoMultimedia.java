
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own

    private int annioCreacion;
    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int annioCreacion)
    {
        super(titulo);
        this.annioCreacion = annioCreacion;
    }

    public String getTitulo(){
        return getTit();
    }
    
    public int getAno(){
        
        return annioCreacion;
    }
}
