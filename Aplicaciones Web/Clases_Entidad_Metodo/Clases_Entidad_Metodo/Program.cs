using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Clases_Entidad_Metodo
{
    class Program
    {
        static void Main(string[] args)
        {
            Metodos Opcion = new Metodos();
            int Condicion = 0;

            do
            {
                Console.WriteLine(" M E N U ");
                Console.WriteLine("1. Agregar Datos.");
                Console.WriteLine("2. Borrar Datos.");
                Console.WriteLine("3. Mostrar Datos.");
                Console.WriteLine("4. Salir");

                Condicion = int.Parse(Console.In.ReadLine());

                switch (Condicion)
                {

                    case 1:
                        Opcion.Agregar();
                        break;
                    case 2:
                        Opcion.Borrar();
                        break;
                    case 3:
                        Opcion.Mostrar();
                         break;
                    default:
                        Console.WriteLine("La opcion no esta Disponible. ");
                        break;
                }
            }
            while (Condicion != 4);
        }
    }
}
