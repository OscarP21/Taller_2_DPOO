package uniandes.dpoo.taller2.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import uniandes.dpoo.taller2.procesamiento.lectorArchivos;


public class ConsolaBurguers
{
	public void ejecutarAplicacion()
	{
		System.out.println("¡Bienvenido a su restaurante de conzianza!");
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				try (Scanner scanner = new Scanner(System.in)) 
				{
					System.out.println("¿Qué acción desea realizar?  :");
					String entrada = scanner.nextLine();
					
					int opcion = Integer.parseInt(entrada);
					
					if (opcion == 1)
					{
						System.out.println("Mostrando menú...");
						ejecutarMostrarMenu();
					}
					else if (opcion == 2)
					{
						System.out.println("Iniciando un nuevo pedido...");
						//ejecutarNuevoPedido();
					}
					else if (opcion == 3)
					{
						System.out.println("Agregar un elemento al pedido...");
						//ejecutarAgregarElemento();
					}
					else if (opcion == 4)
					{
						System.out.println("Cerrando pedido y guardando su factura...");
						//ejecutarCerrarPedido();
					}
					else if (opcion == 5)
					{
						System.out.println("Consultando pedido según ID...");
						//ejecutarBusquedaID();
					}
					else if (opcion == 6)
					{
						System.out.println("Cerrando aplicación...");
					}
				}
			}
			
			catch (NumberFormatException e)
			{
				System.out.println("Seleccione una opción valida por favor.");
				
			}
		}
	}

	public void mostrarMenu()
	{
		System.out.println("\nEl menú\n");
		System.out.println("1. Mostrar menú del restaurante");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un nuevo elemento al pedido");
		System.out.println("4. Cerrar pedido y guardar su factura");
		System.out.println("5. Consultar la información del pedido según ID");
	}

	private void ejecutarMostrarMenu()
	{
		System.out.println("\n" + "Este es nuestro menú" + "\n");
		StringBuilder menu = lectorArchivos.cargarMenu();
		System.out.println(menu);
		
	}
		
	public static void main(String[] args)
	{
		ConsolaBurguers consola = new ConsolaBurguers();
		consola.ejecutarAplicacion();
	}
}

