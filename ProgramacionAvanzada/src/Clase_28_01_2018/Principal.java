
package Clase_28_01_2018;

public class Principal 
{
    public static void main(String[] args) 
    {
        EnviarMensaje mensaje = new EnviarMensaje();

        System.out.println("Nota: " + mensaje.Supervisor());
        System.out.println("Nota: " + mensaje.Administrador());

    }
}
