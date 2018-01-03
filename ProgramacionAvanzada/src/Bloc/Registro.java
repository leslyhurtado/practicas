package Bloc;

import java.util.ArrayList;
import java.util.List;

public class Registro extends Persona
{
    int i=0;
    Lectura leer = new Lectura();
    List <Persona> listapersona = new ArrayList<>();
    Persona persona = new Persona();

    public Registro()
    {
    }
    
    public Registro(Registro actual)
    {
       super.nombre = actual.nombre;
       super.apellido = actual.apellido;
       super.edad = actual.edad;
       super.email = actual.email;
       super.telefono = actual.telefono;
    }
    
    public void NuevoRegistro()
    {
        System.out.println("\nId Creado:" + listapersona.size());
        persona.setId(i);
        System.out.println("Ingrese Nombre: " + listapersona.size());
        persona.setNombre(leer.Cadena());
        System.out.println("Ingrese Apellido: " + listapersona.size());
        persona.setApellido(leer.Cadena());
        System.out.println("Ingrese Edad: " + listapersona.size());
        persona.setEdad(leer.Entero());
        ValidarEdad();
        System.out.println("Ingrese E-mail: " + listapersona.size());
        persona.setEmail(leer.Cadena());
        System.out.println("Ingrese Telefono: " + listapersona.size());
        persona.setTelefono(leer.Entero());
        listapersona.add(persona);
        i++;
    }
    
    public void ValidarEdad()
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
                        if (m == n.getId()) 
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
}
