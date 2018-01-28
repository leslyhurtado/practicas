
package Clase_28_01_2018;

public class EnviarMensaje implements Correos
{
    
    @Override
    public String Supervisor()
    {
        return("Se envio correo al Supervisor\n");
        
    }
    @Override
    public String Administrador()
    {
        return("Se envio correo al Administrador\n");
    }
}
