
/**
 * Write a description of class Patos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patos extends Granja implements Animal
{
    // instance variables - replace the example below with your own
    private int peso;
    private int vida;

    /**
     * Constructor for objects of class Patos
     */
    public Patos()
    {
getPuntosDeVida();
        peso = 1;
    }

    public void alimentar(){
       alimentarAves();
    }

    public void vacunar()
    {
    }

    
    public void hacerEmitirSonidoCaracterístico(){
        System.out.println("Cuac cuac");
    }
    
    public int getPeso(){
            return peso;
    }
    
    
    public int getPuntosDeVida(){
            return vida;
    }
}
