import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String email;

    /**
     * Constructor for objects of class Usuario
     * @param email la direccion del correo electronico de cada usuario.
     */
    public Usuario(String email)
    {
        this.email = email;

    }

  

    public String getNombreCuenta(){

        return email;
    }

}
