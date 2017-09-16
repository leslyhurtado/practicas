using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cadena
{
    class ContadorLetras
    {
        public char[] ArregloCaracteres;
        public char CaracterBuscado;
        int contador = 0;
        
        public void TodasLetras()
        {
            for (int i=0; i<ArregloCaracteres.Length; i++ )
            {
                CaracterBuscado = ArregloCaracteres[i];

                for (int x=0; x < ArregloCaracteres.Length; x++)
                {
                    if (ArregloCaracteres [x] == CaracterBuscado)
                    {
                        contador++;
                    }
                }
                Console.WriteLine(ArregloCaracteres[i] + " == " + contador);
                contador = 0;
            }
        }

        public void UnaLetra()
        {
            Console.WriteLine("Escriba la letra a Contar: ");
            CaracterBuscado = char.Parse(Console.In.ReadLine());

            for (int i = 0; i < ArregloCaracteres.Length; i++)
            {
                if (ArregloCaracteres[i] == CaracterBuscado)
                {
                    contador++;
                }
               
            }
            Console.WriteLine("La Letra: " + CaracterBuscado + " se repite " + contador + " Veces");
            contador = 0;
        }

    }
}
