using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumeroPositivo
{
    class Program
    {
        static void Main(string[] args)
        {
            Datos numero = new Datos();
            numero.Numero = 0;

            Console.WriteLine("Digitel el Numero a Validar");
            numero.Numero = Convert.ToInt32(Console.ReadLine());
            

            if(numero.Numero < 0)
            {
                Console.WriteLine(numero.Negativo());
            }
            if (numero.Numero >= 0)
            {
                Console.WriteLine(numero.Positivo());
            }

            Console.ReadKey();
        }
    }
}
