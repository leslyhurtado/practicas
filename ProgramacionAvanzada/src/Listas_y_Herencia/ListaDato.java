package Listas_y_Herencia;

public class ListaDato extends Persona
{
    int i;
    Curso curso = new Curso();
    Persona persona = new Persona();
    
    @Override
    public void Insertar()
    {
     curso.Insertar();
     persona.Insertar();
    }
    
    @Override
    public void Mostrar()
    {
      curso.Mostrar();
      persona.Mostrar();
    }
    
    @Override
    public void Eliminar()
    {
      curso.Eliminar();
      persona.Eliminar();
    }
    
    public void Registros()
    {
        System.out.println("\t\tEXISTEN: " + "\n\t" + curso.listacurso.size() + " Cursos en la Lista de Cursos" + "\n\t" + persona.listapersona.size() + " Cursos en la Lista de Personas" );
    }
}
