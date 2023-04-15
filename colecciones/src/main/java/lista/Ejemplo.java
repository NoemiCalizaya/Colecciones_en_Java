package lista;

import java.util.ArrayList; // Importamos la clase ArrayList

public class Ejemplo {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> listaNombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");
        listaNombres.add("Luisa");

        // Acceder a un elemento en el ArrayList
        String primerNombre = listaNombres.get(0);
        System.out.println("Primer nombre: " + primerNombre); // Imprime "Primer nombre: Juan"

        // Modificar un elemento en el ArrayList
        listaNombres.set(1, "Ana");
        System.out.println("Lista después de modificar: " + listaNombres); // Imprime "Lista después de modificar: [Juan, Ana, Pedro, Luisa]"

        // Eliminar un elemento del ArrayList
        listaNombres.remove(2);
        System.out.println("Lista después de eliminar: " + listaNombres); // Imprime "Lista después de eliminar: [Juan, Ana, Luisa]"

        // Verificar si un elemento está presente en el ArrayList
        boolean contieneJuan = listaNombres.contains("Juan");
        System.out.println("¿Contiene Juan? " + contieneJuan); // Imprime "¿Contiene Juan? true"

        // Obtener el tamaño del ArrayList
        int tamañoLista = listaNombres.size();
        System.out.println("Tamaño de la lista: " + tamañoLista); // Imprime "Tamaño de la lista: 3"
    }
}

