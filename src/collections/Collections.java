package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		
		/*Array
		//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		//Esta impresion solo muestra el espacio en memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la listaDeCompras, lo vamos a tomar y lo vamos a imprimir.
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}//Cierre forEach */
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//Implementacion de un arrayList
		//Clase General (interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general.
		
		List<String> listaDeContactos = new ArrayList<>(); //
		
		
		//Agrego elementos del tipo String a mi ArrayList llamado ListaDeContactos
		listaDeContactos.add("Fatima");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Evelyn");
		listaDeContactos.add("Alejandra");
		listaDeContactos.add("Antonio");

		//Obtener un elemento de la lista - asignarlo a una variable
		String datoFatima = listaDeContactos.get(0);
		
		System.out.println(datoFatima);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(3);
		
		System.out.println(listaDeContactos);
		
		
		//Implemetacion de un conjunto (SET)
		//Sintaxis
		//Interface de donde implemento + tipo de dato que usaré + nombre que le doy al conjunto + instancia de la clase especifica
		
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de Corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de Treboles");
		
		//No puedo saber pocisiones, solo saber si lo contienen
		if(cartasDeJuego.contains("2 de picas")) {
			System.out.println("La reina de treboles si está en el conjunto");
		} else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		
		
		//Implementacion de un mapa (hashMap)
		Map<String, String> libretaDirecciones = new HashMap<>();
		
		//Agregar elemento a mi libretaDirecciones
		libretaDirecciones.put("Fatima", "Tonala");
		libretaDirecciones.put("Cesar", "Guadalajara");
		libretaDirecciones.put("Tonala", "Nicole");
		
		//metodo para sacar informacion de una libreta, creando una nueva variable
		String direccionDeFatima = libretaDirecciones.get("Fatima");
		String direccionDeNicole = libretaDirecciones.get("Nicole");//
		
		
		//Impresion
		System.out.println(direccionDeFatima);
		System.out.println(direccionDeNicole);
		
		
		
		
		
		


	}//metodo main

}//Collections

/* 
 * Colecciones
 * 
 * - Arrays (arreglos)
 * 	Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a través de un indice. Las principales caraxteristicas de un array son:
 * 
 * 	- Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 * 	- La longitud de un array se establece al momento de crearlo, y no cambia.
 * 	- Podemos acceder a elementos por medio de un indice.
 * 	- Los arrays pueden contener datos primitivos y objetos.
 * 	- No proporciona metodos adicionales para agregar o eliminar elementos.
 * 
 * 
 * 
 * Un ejemplo de array es una lista de compras del supermercado
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	- ArrayList
 * Es una implementacion de una lista(List), es decir, que está en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * - Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 * - Acceso rapido, podemos acceder a un elemento del arrayList por su poricion o indice.
 * - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer los demas elementos, mismo caso si los elimino.
 * 
 * 
 * 
 * 
 * 
 * 
 * Set (conjunto)
 * Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
 *
 *- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 *- No hay un orden especifico, los elementos se almacenan sin orden especifico.
 *- La busqueda es mas sencilla, ya que al no tener elementos duplicados, se usa una funcion hash para encontrar el elemento deseado.
 * 
 * 
 * 
 * 
 * 
 * 
 * Map (mapas)
 * Un mapa es una estructura de datos que almacena pares de clave-valor.
 * 
 * 	- Almacenamiento con pares k-v
 *  - Sin orden especifico (similar a un set)
 *  - Busqueda rapida, la busqueda sed hace por medio de un valor (key), y usa una funcion interna hash para buscar elementos.
 *  
 *  
 *  Agenda telefonica(agregar, modificar, eliminar)
 * 
 *
 * 
 *
 * 
 * 
 * */
