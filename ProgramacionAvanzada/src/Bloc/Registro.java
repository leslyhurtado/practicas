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
}
