package Views;

import Models.Persona;

public class ViewConsole {

    public void printPersonas(Persona[] per) {
        for (Persona persona : per) {
            System.out.println(persona);
        }
    }
}

