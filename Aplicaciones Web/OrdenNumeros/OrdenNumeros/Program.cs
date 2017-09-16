using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OrdenNumeros
{
    class Program
    {
        static void Main(string[] args)
        {
            int size = 0;

            Console.WriteLine("Cuantos Digitos Desea que tenga el Arreglo?  Repuesta: ");
            size = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Describa un arreglo de " + size + " digitos: ");
            int[] Arreglo = new int[size];

            for (int i = 0; i < Arreglo.Length; i++)
            {
                Arreglo[i] = int.Parse(Console.ReadLine());
            }

            Menor_Mayor(Arreglo);
            Mayor_Menor(Arreglo);
            Console.ReadKey();
        }

        static void Menor_Mayor(int[] arreglo)
        {
            Array.Sort(arreglo);
            Console.WriteLine("El arreglo ordenado de Menor a Mayor es: ");

            for (int i = 0; i < arreglo.Length; i++)
            {
                Console.WriteLine(arreglo[i]);
            }
        }
        static void Mayor_Menor(int[] arreglo)
        {
            Array.Reverse(arreglo);
            Console.WriteLine("El arreglo ordenado de Mayor a Menor es: ");

            for (int i = 0; i < arreglo.Length; i++)
            {
                Console.WriteLine(arreglo[i]);
            }
        }
    }
}
