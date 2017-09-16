using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumeroPositivo
{
    class Datos
    {
        public float Numero;

        public string Positivo()
        {
            return "El Numero: " + Numero + " es Positivo";
        }
        public string Negativo()
        {
            return "El Numero: " + Numero + " es Negativo";
        }
    }
}
