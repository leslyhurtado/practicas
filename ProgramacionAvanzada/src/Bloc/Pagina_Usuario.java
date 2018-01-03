package Bloc;

public class Pagina_Usuario extends Pagina_Administrador
{ 
    Pagina_Administrador paginaadministrador = new Pagina_Administrador();
    String comentarios;
    
    public Pagina_Usuario()
    {
    }
    public Pagina_Usuario(Pagina_Administrador actual)
    {
    }
    
    @Override
    public void NuevoRegistro()
    {
        System.out.println("\nLLENANDO INFORMACION DEL USUARIO");
        registro.NuevoRegistro();
    }

    @Override
    public void Comentario()
    {
        paginaadministrador.Comentario();
// DisenoPagina disenopagina = new DisenoPagina();

       /* if (listapagina.isEmpty()) 
        {
            System.out.println("\nLo Sentimos, Aun No hay ningun bloc realiazado por el administrador para comentar.\n");
        }
else */
       // {
       // }
    }
}
