package lista;

import java.util.ArrayList;
import java.util.HashMap;

public class Persona {
    // Propiedades
    private String nombre;
    private int edad;
    private String genero;
    //private String direccion;
    private HashMap<Integer, String> telefono;
    private ArrayList<String> car;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        //this.direccion = direccion;
        this.car = new ArrayList<>();
        this.telefono = new HashMap<>();
    }

    // Métodos
    public void addCar(String cars){
        car.add(cars);
    }

    public void añadirTelefono(Integer clave, String telefonos){
        telefono.put(clave, telefonos);
    }

    @Override
    public String toString(){
        return  "-------------------Persona----------------"+'\n'+
                "nombre: "+nombre +'\n'+
                "edad: "+ edad +'\n'+
                "genero: "+genero+'\n'+
                "telefono: "+telefono+'\n'+
                "carro: "+car;
    }
    /*
        Se ha sobrescrito el método toString() 
        en la clase Persona para que devuelva 
        una representación de cadena de caracteres 
        del objeto Persona. La anotación @Override 
        se usa para indicar que se está sobrescribiendo 
        el método toString() de la clase Object en esta 
        clase hija Persona.
    */
}

