package Bloc;

public class Registro extends Persona
{
    String perfil = "";
    Lectura leer = new Lectura();
    Persona persona = new Persona();
    ConexionBD conexionbd = new ConexionBD();
    
    public Registro()
    {
    }
    public Registro(Registro actual)
    {
       super.nombre = actual.nombre;
       super.apellido = actual.apellido;
       super.email = actual.email;
    }
    public void NuevoRegistro(String perfil)
    {
        persona.id_persona = conexionbd.Validacion_ID_Persona()+1; //incrementa una posicion mas en la BD de personas

        System.out.println("\nId Nuevo Asignado: " + persona.id_persona);
       
        System.out.println("Ingrese Nombre: ");
        persona.nombre = leer.Cadena();
        System.out.println("Ingrese Apellido: ");
        persona.apellido = leer.Cadena();
        System.out.println("Ingrese E-mail: ");
        persona.email = leer.Cadena();

        conexionbd.Insertar_Persona(persona.id_persona, persona.nombre, persona.apellido, persona.email, perfil);
        
    }
/*  public void ValidarEdad()
    {
        while (persona.getEdad() <=17)
        {
                System.out.println("\n\tALERTA:\n\tDebe ser mayor de edad (+18) para registrarse en esta pagina. Favor Validar su edad. \n\tIMPORTANTE: si es menor de edad, y desea salir del programa, coloque una edad de 999");
                System.out.println("\nIngrese edad Valida: " + listapersona.size());
                persona.setEdad(leer.Entero());

            if (persona.getEdad() == 999) 
            {
                System.exit(0);
            }
        } 
    }
    public void BuscarRegistro(int opcion)
    {
        int m=0;
        
        if (listapersona.isEmpty()) 
            {
                System.out.println("\n\tNo hay ningun registro dentro del arreglo, debe crear uno nuevo.");
                NuevoRegistro();
            }
        else
        {
            if (opcion ==1) 
            {
                System.out.println("\nIntroduzca su Id: ");
                m=leer.Entero();

                for (Persona n : listapersona) 
                    {
                        if (m == n.getId_Persona()) 
                        {
                            System.out.println("\n\t\t\t\tBIENVENIDO: " + n.getNombre());
                            break;
                        }
                        else
                        {
                            System.out.println("\nNo se encontro en Registro el ID antes indicado. Vuelva a intentarlo");
                            break;
                        }         
                    }
            }
            if (opcion ==2) 
            {
                System.out.println("\nSe creara un nuevo Registro ");
                NuevoRegistro();
            }
        }
    }
*/
}
