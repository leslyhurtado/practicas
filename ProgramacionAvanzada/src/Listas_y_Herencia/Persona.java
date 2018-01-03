package Listas_y_Herencia;

import java.util.ArrayList;
import java.util.List;

public class Persona extends Curso
{
    String nombre_persona, apellido_persona;
    int edad_persona;
    List <Persona> listapersona = new ArrayList<>();
    
    public String getNombre_persona() { return nombre_persona; }
    public void setNombre_persona(String nombre_persona) { this.nombre_persona = nombre_persona; }
    public String getApellido_persona() { return apellido_persona; }
    public void setApellido_persona(String apellido_persona) { this.apellido_persona = apellido_persona; }
    public int getEdad_persona() { return edad_persona; }
    public void setEdad_persona(int edad) { this.edad_persona = edad; }
    
    @Override
    public void Insertar()
    {
        Persona persona = new Persona();
       
        System.out.println("\n\t\tINTRODUCIENDO INFORMACION DE LA PERSONA " + listapersona.size());
        System.out.println("Ingrese el Id de la persona: " + listapersona.size());
        persona.setId(leer.Entero());
        System.out.println("Ingrese el Nombre de la persona: " + listapersona.size());
        persona.setNombre_persona(leer.Cadena());
        System.out.println("Ingrese el Apellido de la persona: " + listapersona.size());
        persona.setApellido_persona(leer.Cadena());
        System.out.println("Ingrese la Edad de la persona: " + listapersona.size());
        persona.setEdad_persona(leer.Entero());
        
        listapersona.add(persona);
    }
    
    @Override
    public void Mostrar()
    {
        System.out.println("\n\t\t INFORMACION DE LA PRERSONA");
        for (Persona n : listapersona) 
        {
            System.out.println("Id: "+ n.getId());
            System.out.println("Nombre de la persona: " + n.getNombre_persona());
            System.out.println("Apellido de la persona: : " + n.getApellido_persona());
            System.out.println("Edad de la persona: " + n.getEdad_persona() + "\n");
        }
    }
    
    @Override
    public void Eliminar()
    {
        System.out.println("Ingrese el Id de la persona que desea eliminar: ");
        id = leer.Entero();
        
        for (Persona n : listapersona) 
        {
            if (n.getId() == id) 
            {
                listapersona.remove(n);
                System.out.println("\n Registro Eliminado Correctamente");
                break;
            }
            else
            {
                System.out.println("Id de la Persona no encontrado, favor verificar. Gracias \n");
                break;
            }
        }
    }
}
