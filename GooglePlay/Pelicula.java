
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
}
