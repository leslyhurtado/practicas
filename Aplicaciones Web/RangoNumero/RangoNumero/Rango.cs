using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RangoNumero
{
    class Rango
    {
        public float Numero { get; set; }
        public void Rango_Num()
        {
            if (Numero >= 20 && Numero <= 400)
            {
                Console.WriteLine( "TRUE, " + "El numero " + Numero + " esta dentro del Rango de 20 a 400" );
            }
            else
            {
                Console.WriteLine( "FALSE, " + "El numero " + Numero + " esta Fuera del Rango de 20 a 400" );
            }
        }
    }
}
