package uniandes.dpoo.taller2.procesamiento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lectorArchivos
{

    public static StringBuilder cargarIngredientes() 
    {
    	String nombreIngredientes = "./data/ingredientes.txt";
    	StringBuilder lista = new StringBuilder();
	        try 
	        {
	            BufferedReader lector = new BufferedReader(new FileReader(nombreIngredientes));
	            String linea;
	            while ((linea = lector.readLine()) != null) 
	            {
	            	String cambio_igual = linea.replace(";", " = ");
	                lista.append(cambio_igual).append("\n");
	      
	            }
	            lector.close();
	            System.out.println("");
                System.out.println("");

	        } catch (IOException e) 
	        {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	   return lista;
    }

    public static StringBuilder cargarMenu() 
    {
    	String nombreMenu = "./data/menu.txt";
    	StringBuilder lista = new StringBuilder();
	        try 
	        {
	            BufferedReader lector = new BufferedReader(new FileReader(nombreMenu));
	            String linea;
	            while ((linea = lector.readLine()) != null) 
	            {
	            	String cambio_igual = linea.replace(";", " = ");
	                lista.append(cambio_igual).append("\n");
	      
	            }
	            lector.close();
	            System.out.println("");
                System.out.println("");
	        } catch (IOException e) 
	        {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	   return lista;
    }

    public static StringBuilder cargarCombos() 
    {
    	String nombreCombos = "./data/combo.txt";
    	StringBuilder lista = new StringBuilder();
	        try 
	        {
	            BufferedReader lector = new BufferedReader(new FileReader(nombreCombos));
	            String linea;
	            while ((linea = lector.readLine()) != null) 
	            {
	            	String cambio_igual = linea.replace(";", " = ");
	                lista.append(cambio_igual).append("\n");
	      
	            }
	            lector.close();
	            System.out.println("");
                System.out.println("");
	        } catch (IOException e) 
	        {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	   return lista;
    }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

