
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Programa
{
    class Numero_Par
    {
        public int Numero { get; set; }
        public string MostrarNumeroPar()
        {
            return "El Numero: " + Numero + " es Par";
        }
        public string MostrarNumeroNoPar()
        {
            return "El Numero: " + Numero + " es Impar";
        }
    }
}
