/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import java.sql.Connection;//PASO 10 - Necesario para conexion con MySQL
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LAB15
 */
public class ConexionBD 
{
   //PASO 11 - DECLARANDO OBJETOS PARA LA CONEXION
  private static Connection conex;//Objeto tipo Connection
  private static final String DRIVER = "com.mysql.jdbc.driver";
  private static final String USER = "root";
  private static final String PASS = "";
  private static final String URL = "jdbc:mysql://localhost:330/conexion";
     
    //PASO 12 - CONTRUCTOR DE LA CLASE
  public ConexionBD()
  {
  
   conex = null;//Inicializar la variable
   
   //Metodo para manejar excepciones
   try
   {
   Class.forName(DRIVER);
   conex = DriverManager.getConnection(URL, USER, PASS);
   if(conex != null)
   {
  System.out.println("Conexion Establecidas");
   }
  }
   catch(ClassNotFroundException | SQLException e)
  
   {
 System.out.println("Error em la Conexion");
   }

  }
//PASO 13 - DEFINICION METODOS PARA CONECTAR Y DESCONECTAR
  public Connection conectar ()
   { 
   return conex;//Retorna el objeto conex
   
   } 
   
 public void desconectar()
  {
   conex = null;
   if (conex==null)
     {
   System.out.println("Conexion Finalizada");
      } 
    }
  
}