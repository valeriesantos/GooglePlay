
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private double tamannioApp;
    private Categoria categorias;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String titulo,double tamannioApp, Categoria categorias )
    {
        super(titulo);
        this.tamannioApp = tamannioApp;
        this.categorias = categorias;
    }

    public String getNombre(){        
        return getTit(); //devuelve el titulo de la app
    }

    public double getTamanoEnMB(){

        return tamannioApp ;
    }

    public String getCategoria(){ 
        String categoria = " ";
        switch(categorias) {
            case MULTIMEDIA:
            categoria = "Multimedia";
            break;
            case COMUNICACIONES:
           categoria = "Comunicaciones";
            break;
            case JUEGOS:
            categoria ="Juegos";
            break;
            case PRODUCTIVIDAD:
            categoria = "Productividad";
            break;
        }
        return categoria;
    }
    
    @Override
    public double getPrecio(){
        double precioApp = 0.99;
        
        return precioApp;
    }
}
