package lista;

public class Main {
    public static void main(String[] args) {
        List personas = new List();
        Persona p = new Persona("Laura", 24, "femenino");
        p.addCar("automóvil");
        p.añadirTelefono(1, "11111111");

        Persona p1 = new Persona("Roberto", 34, "masculino");
        p1.addCar("motocicleta");
        p1.añadirTelefono(1, "11111112");

        personas.addPersona(p);
        personas.addPersona(p1);
        personas.showPersonas();
    }
}
