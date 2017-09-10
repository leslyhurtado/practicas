using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programa
{
    class Program
    {
        static void Main(string[] args)
        {
            Numero_Par numero = new Numero_Par();
            numero.Numero = 1;
            if ((numero.Numero % 2 ) == 0 ) 
            {
                Console.WriteLine (numero.MostrarNumeroPar());
            }
            else
            {
                Console.WriteLine(numero.MostrarNumeroNoPar());
            }
            Console.ReadKey();
        }
     }
}
