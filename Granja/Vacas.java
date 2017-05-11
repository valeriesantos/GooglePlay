
/**
 * Write a description of class Vacas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vacas  extends Granja implements Animal 
{
    // instance variables - replace the example below with your own
    private int vida;
    private int peso;

    /**
     * Constructor for objects of class Cerdos
     */
    public Vacas()
    {
        getPuntosDeVida();
        peso = 25;  
    }

    public void alimentar(){
        alimentarMamiferos();
    }

    public void vacunar()
    {
       vida = vida +30;
    }

    public void hacerEmitirSonidoCaracterístico(){
        System.out.println("Muuu");
    }

    public int getPeso(){
        return peso;
    }

    public int getPuntosDeVida(){
        return vida;
    }
}
