using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PalabraMasLarga
{
    class Program
    {
        static void Main(string[] args)
        {
            string oracion, palabralarga = "";

            Console.WriteLine("Ingrese una oracion: ");
            oracion = Console.ReadLine();

            for (int i = 0; i < oracion.Length; i++)
            {
                while (oracion.Substring(0,oracion.Length) != " " && (i + 1) < oracion.Length)
                {
                    if (oracion.Length > palabralarga.Length)
                       palabralarga = oracion;
                    break;
                }
            }
            Console.WriteLine("La Palabra mas Larga de la oracion es: " + palabralarga);
            Console.ReadKey();
        }
    }
}
