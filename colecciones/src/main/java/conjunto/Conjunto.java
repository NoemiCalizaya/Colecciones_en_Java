package conjunto;

import java.util.HashSet; // Importamos la clase HashSet

public class Conjunto {
    public static void main(String[] args) {
        // Crear un HashSet de tipo Integer
        HashSet<Integer> numeros = new HashSet<>();

        // Agregar elementos al HashSet
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(5);

        // Imprimir el HashSet
        System.out.println("HashSet de números: " + numeros);
        // Imprime "HashSet de números: [1, 2, 3, 4, 5]"

        // Comprobar si un elemento está presente en el HashSet
        boolean contieneTres = numeros.contains(3);
        System.out.println("¿El HashSet contiene el número 3? " + contieneTres);
        // Imprime "¿El HashSet contiene el número 3? true"

        // Eliminar un elemento del HashSet
        numeros.remove(4);
        System.out.println("HashSet después de eliminar el número 4: " + numeros);
        // Imprime "HashSet después de eliminar el número 4: [1, 2, 3, 5]"

        // Obtener el tamaño del HashSet
        int tamano = numeros.size();
        System.out.println("Tamaño del HashSet: " + tamano);
        // Imprime "Tamaño del HashSet: 4"

        // Comprobar si el HashSet está vacío
        boolean estaVacio = numeros.isEmpty();
        System.out.println("¿El HashSet está vacío? " + estaVacio);
        // Imprime "¿El HashSet está vacío? false"
    }
}

