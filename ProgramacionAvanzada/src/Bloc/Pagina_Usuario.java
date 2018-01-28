package Bloc;

public class Pagina_Usuario extends Pagina_Administrador
{ 
    Pagina_Administrador paginaadministrador = new Pagina_Administrador();
    
    public Pagina_Usuario()
    {
    }
    public Pagina_Usuario(Pagina_Administrador actual)
    {
    }
    @Override
    public void NuevoRegistro()
    {
        String perfil = "User";

        System.out.println("\nLLENANDO DATOS DEL USUARIO");
        registro.NuevoRegistro(perfil);
    }
    @Override
    public void Comentario()
    {
        paginaadministrador.Comentario();
    }
    public void MostrarRegistroBloc()
    {
       paginaadministrador.MostrarRegistroBloc();  
    }
}
