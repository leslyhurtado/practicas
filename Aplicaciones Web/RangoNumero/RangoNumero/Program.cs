using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RangoNumero
{
    class Program
    {
        static void Main(string[] args)
        {
            Rango numero = new Rango();
            numero.Numero = 0;

            Console.WriteLine("Escriba el numero que desee: ");
            numero.Numero = Convert.ToInt32(Console.ReadLine());

            numero.Rango_Num();
            Console.ReadKey();
        }
    }
}
