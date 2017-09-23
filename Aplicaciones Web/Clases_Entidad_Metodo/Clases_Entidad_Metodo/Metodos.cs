using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Clases_Entidad_Metodo
{
    public class Metodos
    {
        List<Entidad> DatosPersona = new List<Entidad>();
       

        public void Agregar()
        {
            Entidad persona = new Entidad();

            persona.Nombre = "";
            persona.Apellido = "";
            persona.Edad = 0;
            persona.Direccion = "";
            
                Console.WriteLine("Escriba el nombre: ");
                persona.Nombre = Console.ReadLine();
                Console.WriteLine("Escriba el apellido: ");
                persona.Apellido = Console.ReadLine();
                Console.WriteLine("Escriba la direccion: ");
                persona.Direccion = Console.ReadLine();
                Console.WriteLine("Escriba la edad: ");
                persona.Edad = Convert.ToInt32(Console.ReadLine());

            DatosPersona.Add(persona);
        }
        public void Borrar()
        {


            Console.WriteLine("Escriba el nombre a eliminar: ");
            String Tosearch = Console.ReadLine();

            foreach (Entidad x in DatosPersona)
            {
                if (x.Nombre == Tosearch)
                {
                    DatosPersona.RemoveAt(DatosPersona.IndexOf(x));
                    break;
                }
            }    
        }
        public void Mostrar()
        {
            foreach (Entidad persona in DatosPersona)
            { 
                Console.WriteLine("Nombre: " + persona.Nombre);
                Console.WriteLine("Apellido: " + persona.Apellido);
                Console.WriteLine("Direccion: "+ persona.Direccion);
                Console.WriteLine("Edad: " + persona.Edad);
            }
        }
    }
}
