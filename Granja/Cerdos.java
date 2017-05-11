
/**
 * Write a description of class Cerdos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdos extends Granja implements Animal
{
    // instance variables - replace the example below with your own
    private int vida;
    private int peso;

    /**
     * Constructor for objects of class Cerdos
     */
    public Cerdos()
    {
        getPuntosDeVida();
        peso = 15;  
    }

    public void alimentar(){
        alimentarMamiferos();
    }

    public void vacunar()
    {
        vida = vida + 20;
    }

    public void hacerEmitirSonidoCaracterístico(){
        System.out.println("Oing oing");
    }

    public int getPeso(){
        return peso;
    }

    public int getPuntosDeVida(){
        return vida;
    }
}
