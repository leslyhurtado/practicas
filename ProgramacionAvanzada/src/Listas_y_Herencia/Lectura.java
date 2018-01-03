/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_y_Herencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Lectura 
{
   private  BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    
   public int Entero()
   {
        try 
        {
            return Integer.parseInt(dato.readLine());
        } 
        catch (IOException ex) 
            {
            return  0;
            }    
   }
   public float Real()
   {
       try 
       {
         return Float.parseFloat(dato.readLine());
       } 
       catch (IOException ex) 
            {
            return  0;
            }
   }  
   public double Doble()
   {
       try 
        {
            return Double.parseDouble(dato.readLine());
        }
       catch (IOException ex) 
       {
            return  0;
        }
   }  
   
   public double  DobleMensaje(String Mensaje)
   {
      
       return Double.parseDouble(JOptionPane.showInputDialog(null, Mensaje));
       
   }
   
   public char Char()
   {
       char n;
       try 
       {
           n=(char) System.in.read();
           System.in.read();
       } 
       catch (IOException ex) 
       {
          n=' ';
       }
        return  n;
       
   }
   public String Cadena()
   {
       try
       {
        return dato.readLine();
       }
       catch (IOException ex) 
            {
            return  "";
            } 
   }
}
