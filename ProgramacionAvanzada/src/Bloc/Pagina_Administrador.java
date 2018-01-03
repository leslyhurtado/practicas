package Bloc;

import java.util.ArrayList;
import java.util.List;

public class Pagina_Administrador extends Registro
{
    Registro registro = new Registro();
    
    List <DisenoPagina> listapagina = new ArrayList<>(); 
    
    public Pagina_Administrador()
    {
    }
    
    @Override
    public void NuevoRegistro()
    {
        System.out.println("\nLLENANDO INFORMACION DEL ADMINISTRADOR");
        registro.NuevoRegistro();
    }

    public void Pagina ()
    {
        DisenoPagina disenopagina = new DisenoPagina();
        
        System.out.println("\n\tLLENANDO ESTRUCTURA DE LA PAGINA DEL ADMINISTRADOR");
        System.out.println("\nId del Bloc Creado: " + listapagina.size());
        disenopagina.setId_pagina(i);
        System.out.println("Titulo: " + listapagina.size());
        disenopagina.setTitulo(leer.Cadena());
        System.out.println("Cabeza: " + listapagina.size());
        disenopagina.setCabeza(leer.Cadena());
        System.out.println("Cuerpo: " + listapagina.size());
        disenopagina.setCuerpo(leer.Cadena());
        System.out.println("Bloc: " + listapagina.size());
        disenopagina.setBloc(leer.Cadena());
        listapagina.add(disenopagina);
        i++;
    }
    
     public void Comentario()
    {
        DisenoPagina disenopagina = new DisenoPagina();
        
        System.out.println("\nLista de BLOC disponibles para comentar:\n");
        for (DisenoPagina n : listapagina) 
            {
                System.out.println("ID BLOC: " + n.getId_pagina() + " TITULO: " + n.getTitulo());
            }
        
        System.out.println("\nIntroduzca el ID que desea Editar: ");
        int x = leer.Entero();
       
        if (x <= listapagina.size())
        {
            System.out.println("\nMENCIONE SU COMENTARIO: ");
            disenopagina.setComentarios(leer.Cadena());
            listapagina.add(x, disenopagina);
        }
        else
        {
            System.out.println("\n El ID introducido no se encontro, favor verifique.");
        }
    }
    
    public void MostrarRegistro()
    {
        DisenoPagina disenopagina = new DisenoPagina();

        for (DisenoPagina n : listapagina) 
        {
            System.out.println("\n\tID DEL BLOC: " + n.getId_pagina());
            System.out.println("\tTitulo: " + n.getTitulo());
            System.out.println("\tBloc: " + n.getBloc());
            System.out.println("\tComentarios: " + n.getComentarios());
        }
    }
}
