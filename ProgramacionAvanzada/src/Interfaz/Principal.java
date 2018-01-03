package Interfaz;

public class Principal 
{
    public static void main(String[] args) 
    {
        Bienvenido bienvenido = new Bienvenido();
        UsuarioMortal mortal = new UsuarioMortal();
        Administrador administrador = new Administrador();
        
        bienvenido.mensaje();
        mortal.mensaje();
        administrador.mensaje();
    }
    
}
