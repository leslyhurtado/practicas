using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Clases_Entidad_Metodo
{
    class Entidad
    {
        public string Nombre { get; set; } 
        public string Apellido {get; set;}
        public int Edad { get; set; }

        public void Agregar()
        {
            Console.WriteLine("Escriba el Nombre de la Persona: ");
            Nombre = Console.ReadLine();
            Console.WriteLine("Escriba el Apellido de la Persona: ");
            Apellido = Console.ReadLine();
            Console.WriteLine("Escriba la Edad de la Persona: ");
            Edad = Convert.ToInt32(Console.ReadLine());

        }
        public void Borrar()
        {
            Nombre = null;
            Apellido = null;
            Edad = 0;
        }
        public void Mostrar()
        {

        }
    }
}
