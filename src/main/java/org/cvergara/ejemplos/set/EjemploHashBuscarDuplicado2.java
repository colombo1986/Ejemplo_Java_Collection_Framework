package org.cvergara.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashBuscarDuplicado2 {
    public static void main(String[] args) {
        String peces[] = {"Corvina", "Atún" , "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

   //crea dos set completamente distintos
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez : peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
            unicos.removeAll(duplicados);
        }

        System.out.println("elementos unicos: " + unicos);
        System.out.println("duplicados = " + duplicados);
    }
}
