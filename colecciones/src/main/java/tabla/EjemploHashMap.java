package tabla;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        // Crear un nuevo HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Agregar pares clave-valor al HashMap
        hashMap.put("Manzana", 3);
        hashMap.put("Banana", 5);
        hashMap.put("Naranja", 2);
        hashMap.put("Uva", 4);

        // Obtener el valor asociado con una clave específica
        System.out.println("El valor de Manzana es: " + hashMap.get("Manzana"));

        // Verificar si una clave específica existe en el HashMap
        System.out.println("¿Contiene la clave 'Plátano'? " + hashMap.containsKey("Plátano"));

        // Verificar si un valor específico existe en el HashMap
        System.out.println("¿Contiene el valor 5? " + hashMap.containsValue(5));

        // Obtener el número de pares clave-valor en el HashMap
        System.out.println("El tamaño del HashMap es: " + hashMap.size());

        // Iterar a través de las claves en el HashMap
        System.out.println("Claves en el HashMap: ");
        for (String clave : hashMap.keySet()) {
            System.out.println(clave);
        }

        // Iterar a través de los valores en el HashMap
        System.out.println("Valores en el HashMap: ");
        for (Integer valor : hashMap.values()) {
            System.out.println(valor);
        }

        // Eliminar un par clave-valor del HashMap
        hashMap.remove("Naranja");

        // Verificar si un par clave-valor se ha eliminado
        System.out.println("¿Contiene la clave 'Naranja' después de eliminarla? " + hashMap.containsKey("Naranja"));
    }
}

