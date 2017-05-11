
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{
    
    // instance variables - replace the example below with your own
    private int peso;
    private int vida = 100;
    
    public Granja(Animal animal)
    {
        
    }
 
    public void alimentarAves(Animal animal){
        vida = vida - 10;
        peso = peso +1;
    }
    
    public void alimentarMamiferos(Animal animal){
        vida = vida - 10;
        peso = peso + 2;
        
    }
    
    public int getPeso(Animal animal){
        
        return peso;
    }
    
    public int getPuntosDeVida(Animal animal){
        return vida;
    }
}
