package org.cvergara.ejemplos.list;

import org.cvergara.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    //ArrayList se listan en el orden que se agregan
    //Se pueden agregar elementos repetidos no como en los set
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato" , 5));
        sa.add(new Alumno("Cata" , 6));
        sa.add(new Alumno("Luci" , 4));
        sa.add(new Alumno("Jano" , 7));
        sa.add(new Alumno("Andres" , 3));
        sa.add(new Alumno("Zeus" , 2));
        sa.add(new Alumno("Zeus" , 2));

         // Collections.sort(sa); //Se ordena usando el comparator que esta en la clase , por nota en orden ascendente
        //Collections.sort(sa , (a,b)-> b.getNota().compareTo(a.getNota()));
        //sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
        sa.sort(Comparator.comparing((Alumno a) -> a.getNota() )); //por defecto el comparing es ascendente
        sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());

        System.out.println("Itereando usando expresiones lambda foreach");
        sa.forEach(System.out::println);


    }
}
