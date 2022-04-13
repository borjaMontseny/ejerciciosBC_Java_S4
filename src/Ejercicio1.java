import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 1- Crea una apliación que calcule la nota media de cada alumno (cuántos
		// exámenes para hacer la media)
		// 2- Guardalas en un diccionario de datos
		// 3- Muestra el hashtable con cada alumno y su media

		/*
		 * Creo un hashtable Pregunto el total de alumnos: int totalAlumnos = sc.nextInt
		 * Pregunto cuantas notas tiene cada alumno: int cantidadNotas = sc.nextInt Creo
		 * un bucle for (int=0, i<totalAlumnos, i++) Pido el nombre del alumno: String
		 * nombreAlumno = sc.nextString Creo un bucle for (int=0, i<cantidadNotas, i++)
		 * para pedir nota tras nota Double notaAlumno += notaAlumno Cerramos el for
		 * 
		 * Hacemos la media: notaAlumno / cantidadNotas ..... Double mediaNotas=
		 * notaAlumno / cantidadNotas
		 * 
		 * Muestro el Hashtable
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in); // Inicializo el objeto Scanner

		Hashtable<String, String> notasClase = new Hashtable<String, String>();

		System.out.print("¿Cuántos alumnos? ");
		int totalAlumnos = sc.nextInt();

		System.out.print("¿Cuántos exámenes tienen los alumnos? ");
		int cantidadNotas = sc.nextInt();

		for (int i = 0; i < totalAlumnos; i++) {
			System.out.print("Introduce el nombre del alumno: " + (i + 1) + ": \n");
			String nombreAlumno = sc.next();
			Double notaAlumno = 0.0;
			Double incrementoMedia = 0.0;
			for (int j = 0; j < cantidadNotas; j++) {
				System.out.print("Introduce la nota " + (j + 1) + ": \n");
				// Double notaAlumno = 0.0;
				notaAlumno = sc.nextDouble();
				incrementoMedia = incrementoMedia + notaAlumno;
			}
			Double mediaAlumno = incrementoMedia / cantidadNotas;
			// El hashtable es String, String necesita un segundo parámetro que sea String
			String mediaString = Double.toString(mediaAlumno);
			System.out.println(mediaAlumno);

			notasClase.put(nombreAlumno, mediaString);
		}
		System.out.println(notasClase);
	}
}