package Controllers;

import java.lang.reflect.Array;

import Models.Persona;

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas){
        
        for(int i = 0; i < personas.length; i++){
            int index = i;
            for (int j = 0; index < personas.length; j++){
                //if (personas[j].getCodigoDireccion() > personas[index].getCodigoDireccion()){
                if (personas[j].equalsByCodigoDireccion(personas[index]))
                    index = j;
            }

            if (index!= i){
                Persona temp = personas[index];
                personas[index] = personas[i];
                personas[i] = temp;
            }
        }
    }

    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto){
            int center = (alto + bajo)/2;
            int valorCentral = personas[center].getCodigoDireccion();

            //if (personas[center].equalsByCodigoDireccion(codigo))
            if (valorCentral == codigo){
                return personas[center];
            }
        }
        return null;
    }
}
