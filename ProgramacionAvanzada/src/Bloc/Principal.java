package Bloc;

public class Principal extends Pagina_Usuario
{
    public static void main(String[] args) 
    {
        Pagina_Usuario paginausuario = new Pagina_Usuario();
        Pagina_Administrador paginaadministrador = new Pagina_Administrador();
        Registro registro = new Registro();
        int menu, opcion;
       
        do 
        {
            System.out.println("\n\n\t\t\t\t\t\t\t\t  M E N U    P R I N C I P A L");
            System.out.println("\t\t\t\t\t\t\t\t       B I E N V E N I D O");
            System.out.println("\n\t\t\t\t\t\t\t\tSeleccione su Perfil de Usuario\n");
            System.out.println("\t\t\t\t\t\t\t\t1.  Administrador");
            System.out.println("\t\t\t\t\t\t\t\t2.  Usuario - Visitante");
            System.out.println("\t\t\t\t\t\t\t\t3.  Salir");
            menu = paginausuario.leer.Entero();
            
                switch(menu)
                {
                    case 1: 
                            System.out.println("\n\t\t\t\tMENU  - ADMINISTRADOR ");
                            System.out.println("\t\t\t\tTiene Perfil creado? ");
                            System.out.println("\t\t\t\t1. Si");
                            System.out.println("\t\t\t\t2. No");
                            opcion = paginausuario.leer.Entero();

                            registro.BuscarRegistro(opcion);

                            do
                            {
                                System.out.println("\n\t\t\t\tQue accion desea realizar? ");
                                System.out.println("\t\t\t\t1. Crear un nuevo Bloc");
                                System.out.println("\t\t\t\t2. Visualizar los comentarios del los bloc creados");
                                System.out.println("\t\t\t\t3. Salir Menu Administrador");
                                opcion = paginausuario.leer.Entero();

                                switch (opcion)
                                {
                                    case 1:
                                            paginaadministrador.Pagina();
                                            break;
                                    case 2:
                                            paginaadministrador.MostrarRegistro();
                                            break;
                                }   
                            }
                            while (opcion !=3);
                            break;
                    case 2:
                            do
                            {
                                System.out.println("\t\t\t\tQue accion desea realizar? ");
                                System.out.println("\t\t\t\t1. Visualizar los blocs creados");
                                System.out.println("\t\t\t\t2. Agregar Comentario a un bloc");
                                System.out.println("\t\t\t\t3. Salir Menu Usuario");
                                opcion = paginausuario.leer.Entero();

                                switch (opcion)
                                {
                                    case 1:
                                            paginaadministrador.MostrarRegistro();
                                            break;
                                    case 2:
                                            paginausuario.Comentario();
                                            break;
                                }
                            }
                            while (opcion !=3);
                            break;
                            
                    case 3:
                        
                        break;
                    
                    default: 
                        
                        break;
                } 
        } 
        while (menu!=3);    
    }
    
}
