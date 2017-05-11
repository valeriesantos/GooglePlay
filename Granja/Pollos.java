
/**
 * Write a description of class Pollos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pollos extends Granja implements Animal
{
    private int vida;

    private int peso;
    /**
     * Constructor for objects of class Pollos
     */
    public Pollos()
    {
getPuntosDeVida();
        peso = 2;
    }

    public void alimentar(){
        alimentarAves();
    }

    public void vacunar()
    {
        vida = vida + 10;
    }

    public void hacerEmitirSonidoCaracterístico(){
        System.out.println("Pío ío");
    }

    public int getPeso(){
        return peso;
    }

    public int getPuntosDeVida(){
        return vida;
    }
}
