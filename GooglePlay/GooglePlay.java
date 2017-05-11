import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<Usuario>(); 
        productos = new ArrayList<Producto>(); 
    }

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public int getNumeroUsuarios(){
        int size = usuarios.size();

        return size;
    }

    public int getNumeroProductos(){
        int size = productos.size();;

        return size;
    }

    public double comprar(String email, String titulo){
        double precio = 0;
        return precio;
        

    }
}
