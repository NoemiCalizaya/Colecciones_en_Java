package lista;
import java.util.ArrayList;

public class List {
    private ArrayList<Persona> personas;

    public List(){
        personas = new ArrayList<>();
    }

    public void addPersona(Persona persona){
        personas.add(persona);
    }

    public void showPersonas(){
        for(Persona persona:personas){
            System.out.println(persona);
        }
    }
}
