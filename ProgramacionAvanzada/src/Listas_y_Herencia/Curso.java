package Listas_y_Herencia;

import java.util.ArrayList;
import java.util.List;

public class Curso
{
    int id;
    String nombre_curso;
    float costo_curso;
    Lectura leer = new Lectura();
    List<Curso> listacurso = new ArrayList<>();
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre_curso() { return nombre_curso; }
    public void setNombre_curso(String nombre_curso) { this.nombre_curso = nombre_curso; }
    public float getCosto_curso() { return costo_curso; }
    public void setCosto_curso(float costo_curso) { this.costo_curso = costo_curso; }

    public void Insertar()
    {
        Curso curso = new Curso();
        System.out.println("\n\t\tINTRODUCIENDO INFORMACION DEL CURSO " + listacurso.size());
        System.out.println("Ingrese el Id del Curso: " + listacurso.size());
        curso.setId(leer.Entero());
        System.out.println("Ingrese el Nombre del Curso: " + listacurso.size());
        curso.setNombre_curso(leer.Cadena());
        System.out.println("Ingrese el Costo del Curso: " + listacurso.size());
        curso.setCosto_curso(leer.Real());
        listacurso.add(curso);
    }
    public void Mostrar()
    {
        System.out.println("\n\t\t INFORMACION DEL CURSO");
        for (Curso n : listacurso) 
        {
            System.out.println("Id: "+ n.getId());
            System.out.println("Nombre del Curso: " + n.getNombre_curso());
            System.out.println("Costo del curso: " + n.getCosto_curso() + "\n");
        }
    }
   public void Eliminar()
   {
       System.out.println("Ingrese el Id del Curso que desea Eliminar: ");
       id=leer.Entero();

       for (Curso n : listacurso) 
        {
            if (n.getId() == id)
            {
                listacurso.remove(n);
                System.out.println("\n Registro Eliminado Correctamente");
                break;
            }
            else
            {
                System.out.println("Id del Curso no encontrado, favor verificar. Gracias \n");
                break;
            }
        }
   }
}
