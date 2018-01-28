package Bloc;
import java.sql.*;

public class ConexionBD 
{
    //Declarando los campos que se van a utilizar, de acuerdo al tipo de la BD que utilizaremos: SQLSERVER, ORACLE, MYSQL, POSTGRE, ETC
    String url= "jdbc:sqlserver://";  //URL es la ruta donde se aloja la BD
    String servidor="DESKTOP-GIO03T4:1433"; //nombre del servidor y puerto por defecto del gestor de BD que se este utilizando (revisar en el gestor de BD)
    String nombre="DatabaseName=Bloc"; //nombre de la BD que se esta utilizando 
    String usuario="user=sa"; //nombre del usuario donde tiene la BD a utilizar 
    String clave="password=12345"; //clave del usuario donde tiene la BD a utilizar, sino tiene clave, dejarla vacia
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; //Driver del gestor de BD que se esta utilizando. 
    Connection con = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    String sentenciabd="";

    public void AbrirBD(String sentenciabd) throws ClassNotFoundException, SQLException  // abre conexiones de BD y toma las sintaxis en referencia para ejecutar
    {
        this.sentenciabd = sentenciabd;
        
        Class.forName(driver); 
        con=DriverManager.getConnection(url+servidor+";"+nombre+";"+usuario+";"+clave); 
        pstm = con.prepareStatement(sentenciabd);
        rs = pstm.executeQuery();
    }
    public void CerrarBD() // cierra la BD
    {
        try
        {
            if (rs==null) 
            {
                rs.close();
            }
            if (pstm==null) 
            {
                pstm.close();
            }
            if (con==null)
            {
                con.close();
            }
        }
        catch (Exception e)
        {
        }
    }    
    public void Insertar_DisenoPagina(int id_pagina, String titulo, String bloc, String comentarios) // agrega nuevos registros de paginas (bloc`s)
    {
        try
        {
            sentenciabd=("Insert Into Bloc.dbo.DisenoPagina Values ("+id_pagina+",'"+titulo+"','"+bloc+"','"+comentarios+"')"); //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
        } 
        catch (Exception ex) 
        {
            //System.out.println("Error en la conexion, " + ex.getMessage());
        }   
        CerrarBD();
    }
    public void Insertar_Persona(int id_persona, String nombre, String apellido, String email, String perfil) // inserta nuevo registros de usuarios
    {
        try
        {
            sentenciabd=("Insert Into Bloc.dbo.Persona Values ("+id_persona+",'"+nombre+"','"+apellido+"','"+email+"','"+perfil+"')"); //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
        } 
        catch (Exception ex) 
        {
            //System.out.println("Error en la conexion, " + ex.getMessage());
        }   
            CerrarBD();
    }
    public void Modificar_Comentario_DisenoPagina(int id_pagina, String comentarios) //agrega comentarios a los bloc creados en la paginas
    {
        try
        {
            sentenciabd=("update Bloc.dbo.DisenoPagina set Comentarios = '"+comentarios+"' where Id_Pagina = "+id_pagina+""); //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
        } 
        catch (Exception ex) 
        {
            //System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
    }
    public void Mostrar_DisenoPagina() // muestra todos los registros de la BD
    {
        try
        {
            sentenciabd="Select * from Bloc.dbo.DisenoPagina"; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);

            System.out.println("Id Pagina\t\t\tTitulo\t\t\tBloc\t\t\tComentarios\n");
            while(rs.next())
            {
                //se coloca los nombres de las columnas de la tabla de la BD que se esta utilizando, de acuerdo a la sentencia antes indicada, 
                System.out.println
                (
                     rs.getInt(1) + "\t\t\t"
                    +rs.getString(2) + "\t\t\t"
                    +rs.getString(3) + "\t\t\t"
                    +rs.getString(4) + ""
                );
               //nota: se tiene que agregar o quitar lineas de +rs.getString("") + " " sino se van a utilizar, de acuerdo al tamano del registro que se esta queriendo ver en la sentencia
            }
            System.out.println("\n\n");
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
    }
    public void Mostrar_Persona() // Muestra todos los registros de la BD
    {
        try
        {
            sentenciabd="Select * from Bloc.dbo.Persona"; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            
            System.out.println("Id Persona\t\t\tNombre\t\t\tApellido\t\t\tEmail\t\t\tPerfil\n");
            while(rs.next())
            {
            //se coloca los nombres de las columnas de la tabla de la BD que se esta utilizando, de acuerdo a la sentencia antes indicada, 
            System.out.println
            (
                 rs.getInt(1) + "\t\t\t"
                +rs.getString(2) + "\t\t\t"
                +rs.getString(3) + "\t\t\t"
                +rs.getString(4) + "\t\t\t"
                +rs.getString(5) + ""
            );
            //nota: se tiene que agregar o quitar lineas de +rs.getString("") + " " sino se van a utilizar, de acuerdo al tamano del registro que se esta queriendo ver en la sentencia
            }
            System.out.println("\n\n");
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
    }
    public int Validacion_ID_DisenoPagina() // Devuelve el ultimo valor del registro en BD
    {
        int validacion = 0;
        try
        {
            sentenciabd="select max(Id_Pagina) from Bloc.dbo.DisenoPagina"; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            
            while(rs.next())
            {
                validacion = rs.getInt(1);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
        return (validacion);
    }
    public int Validacion_ID_Persona() // Devuelve el ultimo valor del registro en BD
    {
        int validacion = 0;
        try
        {
            sentenciabd="select max(Id_Persona) from Bloc.dbo.Persona"; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            
            while(rs.next())
            {
                validacion = rs.getInt(1);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
        return (validacion);
    }
    public int Validacion_Tipo_Perfil_Persona(int id_persona)
    {
        int validacion = 0;
        try
        {
            sentenciabd="select Perfil from Bloc.dbo.Persona where Id_Persona = " + id_persona ; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            
            while(rs.next())
            {
                validacion = rs.getInt(1);
            }
        } 
        catch (Exception ex) 
        {
           System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
        return (validacion);
    }
    public int Validacion_Cantidad_Comentarios_Pagina()
    {
        int  cont = 0;
        try
        {
            sentenciabd="select COUNT(Comentarios) from Bloc.dbo.DisenoPagina where comentarios != ''" ; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            
            while(rs.next())
            {
                cont = rs.getInt(1);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
        return (cont);
    }
    public int Validacion_Cantidad_Tipo_Perfil_Persona()
    {
        int  cont_user = 0;
        try
        {
            sentenciabd="select COUNT(Id_Persona) from Bloc.dbo.Persona where Perfil = 'User'" ; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            
            while(rs.next())
            {
                cont_user = rs.getInt(1);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
        return (cont_user);
    }
    public void Buscar_ID_DisenoPagina(int id_pagina) // Busca el Id dentro de la BD
    {
        try
        {
            sentenciabd="select titulo,Bloc from Bloc.dbo.DisenoPagina where Id_Pagina = " + id_pagina; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            while(rs.next())
            {
            System.out.println
                (
                     rs.getString(1) + "\t" + ":" + " "
                    +rs.getString(2) + "\t"
                );
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD();
    }
    public void Buscar_ID_Persona(int id_persona)
    {
        try
        {
            sentenciabd="select Nombre, Apellido from Bloc.dbo.Persona where Id_Persona = " + id_persona; //aca se coloca la sentencia de la BD que se va a utilizar para que hale la informacion solicitada
            AbrirBD(sentenciabd);
            while(rs.next())
            {
            System.out.println
                (
                     rs.getString(1) + " "
                    +rs.getString(2)
                );
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error en la conexion " + ex.getMessage());
        }   
        CerrarBD(); 
    }
}