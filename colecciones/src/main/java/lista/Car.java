package lista;

import java.util.ArrayList;

public class Car {
    // Variables de instancia
    private String marca;
    private String modelo;
    private int anio;
    private int velocidad;

    // Constructor
    public Car(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0; // Inicializa la velocidad en 0
    }

    // Métodos de la clase Car
    // Acelerar el carro
    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    // Desacelerar el carro
    public void desacelerar(int decremento) {
        velocidad -= decremento;
    }

    // Detener el carro
    public void detener() {
        velocidad = 0;
    }

    // Imprimir información del carro
    public void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }

    // Ejemplo de uso de ArrayList para almacenar una lista de carros
    public static void main(String[] args) {
        // Crear una lista de carros usando ArrayList
        ArrayList<Car> listaCarros = new ArrayList<>();

        // Crear objetos Carro
        Car carro1 = new Car("Toyota", "Corolla", 2020);
        Car carro2 = new Car("Honda", "Civic", 2019);
        Car carro3 = new Car("Ford", "Mustang", 2021);

        // Agregar los carros a la lista
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);

        // Imprimir información de los carros en la lista
        System.out.println("Lista de carros:");
        for (Car carro : listaCarros) {
            carro.imprimirInfo();
            System.out.println("-------------------");
        }
    }
}
