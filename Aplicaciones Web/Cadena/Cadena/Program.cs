using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cadena
{
    class Program
    {
        static void Main(string[] args)
        {
            ContadorLetras Arreglo = new ContadorLetras();
            int Condicion=0;
            
            Console.WriteLine("Escriba la cadena de Caracter: ");
            Arreglo.ArregloCaracteres = Console.ReadLine().ToCharArray();

            do
            {
                Console.WriteLine(" M E N U ");
                Console.WriteLine("1. Saber las Veces que se repiten las letras en todo el Arreglo.");
                Console.WriteLine("2. Saber cuantas veces se repite una letra que compone el Arreglo.");
                Console.WriteLine("3. Salir");
                Condicion = int.Parse(Console.In.ReadLine());

                switch (Condicion)
                {

                    case 1:
                        Arreglo.TodasLetras();
                        break;
                    case 2:
                        Arreglo.UnaLetra();
                        break;
                    case 3:
                        break;
                    default:
                        Console.WriteLine("La opcion no esta Disponible. ");
                        break;
                }
            }
            while (Condicion != 3);
        }
    }
}
