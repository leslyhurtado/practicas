package Bloc;

public class Pagina_Administrador extends Registro
{
    Registro registro = new Registro();
    DisenoPagina disenopagina = new DisenoPagina();
    
    public Pagina_Administrador()
    {
    }
    public void NuevoRegistro()
    {
        String perfil = "Admon"; 
        
        System.out.println("\nLLENANDO DATOS DEL ADMINISTRADOR");
        registro.NuevoRegistro(perfil);
        //AQUI DEBERIA IR UNA CONDICION QUE LOS DIFERENCIA ENTRE ADMON Y USUARIO: - Admon
    }
    public void NuevoBloc()
    {
        System.out.println("\n\tCREANDO NUEVO BLOC DEL ADMINISTRADOR");
        disenopagina.id_pagina = conexionbd.Validacion_ID_DisenoPagina()+1; // incrementa +1 al ultimo registro en la BD DisenoPagina
    
        System.out.println("Id Nuevo Asignado: " + disenopagina.id_pagina);
        System.out.println("Titulo: " );
        disenopagina.titulo=leer.Cadena();
        System.out.println("Bloc: " );
        disenopagina.bloc=leer.Cadena();
        disenopagina.comentarios=""; //los comentarios van en blanco para que se puedan modificar por el usuario.
        conexionbd.Insertar_DisenoPagina(disenopagina.id_pagina, disenopagina.titulo, disenopagina.bloc, disenopagina.comentarios);
    }
     public void Comentario()
    {
        System.out.println("\nIntroduzca el ID del Bloc que desea Comentar: ");
        disenopagina.id_pagina = leer.Entero();
        System.out.println("\nIntroduzca el Nuevo Comentario: ");
        disenopagina.comentarios = leer.Cadena();
        conexionbd.Modificar_Comentario_DisenoPagina(disenopagina.id_pagina, disenopagina.comentarios);
    }
    public void MostrarRegistroBloc()
    {
       conexionbd.Mostrar_DisenoPagina();  
    }
    public void MostrarRegistroPersona()
    {
       conexionbd.Mostrar_Persona();  
    }
}
