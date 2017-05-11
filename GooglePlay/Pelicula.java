
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private long duracionPelicula;
    private int calidad;
    public static final int PRECIO_FULLHD = 10;
    public static final int PRECIO_HD = 5;
    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int annioCreacion, long duracionPelicula, int calidad)
    {
        super(titulo,annioCreacion);
        this.duracionPelicula = duracionPelicula;
        this.calidad= calidad;
    }

    public long getDuracion(){
        return duracionPelicula;
    }

    public String getCalidad(){

        String calidadFinal = " " ;

        if ( calidad == 1080){
            calidadFinal = "FullHD";
        }
        else {
            calidadFinal = "HD";
        }
        return calidadFinal;
    }

    public double getPrecioCompra(){
        double precio = 0;

        if(calidad ==1080 ){
            precio = PRECIO_FULLHD ;
            if(getAno() < 2000){
                precio = precio - (precio * 0.5);
            }
        }
        else if (calidad == 480){
            precio = PRECIO_HD;
            if(getAno() < 2000){
                precio = precio - (precio * 0.5);
            }
        }
        return precio;
    }

}

