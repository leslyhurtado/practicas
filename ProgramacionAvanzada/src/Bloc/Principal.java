package Bloc;

public class Principal extends Pagina_Usuario
{
    public static void main(String[] args) 
    {
        ConexionBD conexion = new ConexionBD();
        
        Pagina_Usuario paginausuario = new Pagina_Usuario();
        Pagina_Administrador paginaadministrador = new Pagina_Administrador();
        int menu, opcion;
       
        do 
        {
            System.out.println("\n\n\t\t\t\t\t\t\t\t  M E N U    P R I N C I P A L");
            System.out.println("\t\t\t\t\t\t\t\t       B I E N V E N I D O");
            System.out.println("\n\t\t\t\t\t\t\t\tSeleccione su Perfil de Usuario\n");
            System.out.println("\t\t\t\t\t\t\t\t1.  Administrador");
            System.out.println("\t\t\t\t\t\t\t\t2.  Usuario");
            System.out.println("\t\t\t\t\t\t\t\t3.  Salir");
            menu = paginausuario.leer.Entero();
            
                switch(menu)
                {
                    case 1: 
                            do
                            {
          
                            System.out.println("\n\t\t\t\tMENU  - ADMINISTRADOR ");
                            System.out.println("\t\t\t\t1. Crear Nuevo Registro de Administrador");
                            System.out.println("\t\t\t\t2. Crear Nuevo Bloc dentro de la Pagina");
                            System.out.println("\t\t\t\t3. Ver Todos los Registros de Personas");
                            System.out.println("\t\t\t\t4. Ver Todos los Blocs y Comentarios");
                            System.out.println("\t\t\t\t5. Editar el Comentario de un Bloc");
                            System.out.println("\t\t\t\t6. Estadistico General");
                            System.out.println("\t\t\t\t7. Salir");

                            opcion = paginausuario.leer.Entero();

                            switch (opcion)
                                {
                                    case 1:
                                            paginaadministrador.NuevoRegistro();
                                            break;
                                    case 2:
                                            paginaadministrador.NuevoBloc();
                                            break;
                                    case 3:
                                            paginaadministrador.MostrarRegistroPersona();
                                            break;
                                    case 4:
                                            paginaadministrador.MostrarRegistroBloc();
                                            break;
                                    case 5:
                                            paginaadministrador.Comentario();
                                            break;
                                    case 6:
                                            System.out.println 
                                            ( "\n\t\tExisten: \n" 
                                                    + conexion.Validacion_ID_DisenoPagina() + " Bloc\n"
                                                    + conexion.Validacion_Cantidad_Tipo_Perfil_Persona() + " Usuarios\n"
                                                    + Math.abs(conexion.Validacion_Cantidad_Tipo_Perfil_Persona()- conexion.Validacion_ID_Persona()) + " Admon\n"
                                                    + conexion.Validacion_Cantidad_Comentarios_Pagina() + " Comentarios existentes\n"
                                            );
                                            break;
                                    default: 
                                            break;
                                }   
                            }
                            while (opcion !=7);
                            break;
                    case 2:
                            do
                            {
                                System.out.println("\n\t\t\t\tMENU  - USUARIO ");
                                System.out.println("\t\t\t\t1. Crear Nuevo Registro de usuario");
                                System.out.println("\t\t\t\t2. Ver lista de Bloc dentro de la Pagina");
                                System.out.println("\t\t\t\t3. Comentar un Bloc dentro de la Pagina");
                                System.out.println("\t\t\t\t4. Salir");
                                opcion = paginausuario.leer.Entero();

                                switch (opcion)
                                {
                                    case 1:
                                            paginausuario.NuevoRegistro();
                                            break;
                                    case 2:
                                            paginausuario.MostrarRegistroBloc();
                                            break;
                                    case 3:
                                            paginausuario.Comentario();
                                            break;           
                                    default: 
                                            break;
                                }
                            }
                            while (opcion !=4);
                            break;
                    default: 
                        break;
                }
        } 
        while (menu!=3);
    }
    
}
