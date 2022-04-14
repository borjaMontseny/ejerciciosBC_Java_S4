import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Guarda las cantidades del carrito de compra dentro de una lista con Hashtable
		 * 
		 * Muestra por pantalla:
		 * -IVA añadido del 21% o 4%
		 * -Precio total bruto y precio con IVA
		 * -Número de artículos comprados
		 * -Cantidad pagada
		 * -Cambio a devolver al cliente */ 
		
		// PSEUDOCÓDIGO:
		/* Creo un ArrayList carritoCompra
		 * Pregunto cantidad de ProductoX y lo guardo
		 * 
		 * Pregunto cantidad de ProductoY y lo guardo
		 * 
		 * Pregunto cantidad de ProductoZ y lo guardo
		 * 
		 * Calcular bruto de X, Y Z.
		 * 
		 * Calcular precio con IVA (21 o 4)
		 * 
		 * Número de artículos comprados y TotalAPagar
		 * 
		 * Muestra precio, pide introducir dinero
		 * 
		 * Devuelve el cambio
		 * 
		 */
		
		//Cantidades
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> carritoCompra = new ArrayList<>();
		System.out.print("¿Cuántos sardinas te pongo niño? ");
		double cantidadSardinas = sc.nextDouble();
		carritoCompra.add(cantidadSardinas);

		System.out.print("¿Cuántos tomates te pongo niño? ");
		double cantidadTomates = sc.nextDouble();
		carritoCompra.add(cantidadTomates);

		System.out.print("¿Cuántos huevos te pongo niño? ");
		double cantidadHuevos = sc.nextDouble();
		carritoCompra.add(cantidadHuevos);
		
		System.out.println(carritoCompra);
		
		//Cálculo del bruto
		double precioSardinas = 0.90 * cantidadSardinas;
		carritoCompra.add(precioSardinas);
		
		double precioTomates = 0.25 * cantidadTomates;
		carritoCompra.add(precioTomates);
		
		double precioHuevos = 0.50 * cantidadHuevos;
		carritoCompra.add(precioHuevos);
		
		//Precio con IVA. 4%
		double precioSardinasMasIVA = 1.04 * precioSardinas;
		carritoCompra.add(precioSardinasMasIVA);
		
		double precioTomatesMasIVA = 1.04 * precioTomates;
		carritoCompra.add(precioTomatesMasIVA);
		
		double precioHuevosMasIVA = 1.04 * precioHuevos;
		carritoCompra.add(precioHuevosMasIVA);
		
		//Cálculo de los totales
		double cantidadProductos = cantidadSardinas + cantidadTomates + cantidadHuevos;
		carritoCompra.add(cantidadProductos);
		
		double totalAPagar = precioSardinasMasIVA + precioTomatesMasIVA + precioHuevosMasIVA;
		carritoCompra.add(totalAPagar);
		
		//A pagar, y a devolver cambio
		System.out.println("Serán " + totalAPagar + "€ en total");
		System.out.println("Introduce el dinero: ");
		double dineroIntroducido = sc.nextDouble();
		double cambioADevolver = dineroIntroducido - totalAPagar;
		
		System.out.print("El cambio será de " + cambioADevolver + "€");
		
		
	}
}