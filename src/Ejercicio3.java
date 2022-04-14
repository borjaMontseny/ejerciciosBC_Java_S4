import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la base de datos de 10. <nombreProducto, precioProducto>
		Hashtable<String, Double> listaArticulos = new Hashtable<String, Double>();
		listaArticulos.put("galletasOreo", 1.50);
		listaArticulos.put("aceiteOliva", 3.50);
		listaArticulos.put("carnePicada", 4.00);
		listaArticulos.put("huevosGallina", 2.00);
		listaArticulos.put("fideosYatekomo", 1.00);
		listaArticulos.put("botellaCocaCola", 4.00);
		listaArticulos.put("cubitosHielo2", 3.80);
		listaArticulos.put("pilasAA", 2.50);
		listaArticulos.put("litronaCerveza", 0.85);
		listaArticulos.put("aguaBezoya", 3.00);
		
		Hashtable<String, Integer> listaArticulosAnadidos = new Hashtable<String, Integer>();

		// Pregunto cuantos artículos quiere añadir el usuario
		String numeroArticulosNuevosString = JOptionPane.showInputDialog("Cuántos artículos deseas añadir:");
		Integer numeroArticulosNuevos = Integer.parseInt(numeroArticulosNuevosString);
		
		//
		
		// Preguntara tantas veces, como artículos queremos añadir
		for (int i = 0; i < numeroArticulosNuevos; i++) {

			String articuloNuevo = JOptionPane.showInputDialog("Inserta el nombre del artículo número " + (i+1) + ":");
			String cantidadArticuloString = JOptionPane.showInputDialog("Introduce el precio de " + articuloNuevo + ":");

			
			// Paso precioArticulo a Double
			Integer cantidadArticuloStock = Integer.parseInt(cantidadArticuloString);
			
			// Con cada iteracion llenamos el segundo Hashtable
			listaArticulosAnadidos.put(articuloNuevo, cantidadArticuloStock);

		}
		
		// Una vez finalizado el añadir productos, podemos consultar precio o cantidad
		String productoConsultado = JOptionPane.showInputDialog("Introduce el nombre del artículo que deseas consultar:");
		
		
		
	}

}
