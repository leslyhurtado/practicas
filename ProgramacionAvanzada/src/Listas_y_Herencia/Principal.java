package Listas_y_Herencia;

public class Principal 
{
    public static void main(String[] args) 
    {
        ListaDato datos = new ListaDato();
        int n;
        
        do 
        {
            System.out.println("\n\n\t\t\t\t\t\t\t\tB  I  E  N  V  E  N  I  D  O\n");
            System.out.println("\t\t\t\t\t\t\t\t1.  Ingrese Datos");
            System.out.println("\t\t\t\t\t\t\t\t2.  Mostrar Todo");
            System.out.println("\t\t\t\t\t\t\t\t3.  Eliminar un Registro");
            System.out.println("\t\t\t\t\t\t\t\t4.  Resumen de registros en listas");
            System.out.println("\t\t\t\t\t\t\t\t5.  Salir");
            n = datos.leer.Entero();
            
                switch(n)
                {
                    case 1: 
                        datos.Insertar();
                        break;
                    case 2:
                        datos.Mostrar();
                        break;
                    case 3:
                        datos.Eliminar();
                        break;
                    case 4:
                       datos.Registros();
                        break;
                    default:                        
                        break;
                } 
        } 
        while (n!=5);    
    }
}
