package tabla;

import java.util.Collection;
import java.util.HashMap; // Importamos la clase HashMap

public class Tabla {
    public static void main(String[] args) {
        // Crear un HashMap de tipo String, String
        HashMap<Integer, String> mapaNombres = new HashMap<>();

        // Agregar elementos al HashMap
        mapaNombres.put(1, "Pérez");
        mapaNombres.put(2, "González");
        mapaNombres.put(3, "Sánchez");
        mapaNombres.put(4, "Hernandez");
        mapaNombres.put(5, "Hernandez");

        // Convertir el HashMap a String usando el método toString()
        String mapaNombresString = mapaNombres.toString();

        // Imprimir la representación en String del HashMap
        System.out.println("HashMap como String: " + mapaNombresString);
        // Imprime "HashMap como String: {Juan=Pérez, María=González, Pedro=Sánchez, Luisa=Hernández}"
        Collection<String> datos = mapaNombres.values();
        for(String s:datos){
        System.out.println(s);
        }
    }
}

