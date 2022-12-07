package org.cvergara.ejemplos.set;

import org.cvergara.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    //HashSet compara por Equals y hashcode no esta ordenado
    //TreeSet si esta ordenado
    //Los set no se pueden iterar con un for clasico
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato" , 5));
        sa.add(new Alumno("Cata" , 6));
        sa.add(new Alumno("Luci" , 4));
        sa.add(new Alumno("Jano" , 7));
        sa.add(new Alumno("Andres" , 3));
        sa.add(new Alumno("Zeus" , 2));
        sa.add(new Alumno("Zeus" , 2));
       // System.out.println("sa = " + sa);

        System.out.println("Iterando usando un foreach");
        for(Alumno a: sa){
            System.out.println(a);
        }

        System.out.println("Itereando usando while e iterator");

        Iterator<Alumno> it = sa.iterator() ;
        while (it.hasNext()){
            Alumno a = it.next() ;
            System.out.println(a.getNombre());
        }

        System.out.println("Itereando usando expresiones lambda foreach");
        sa.forEach(Alumno::getNombre);


    }
}
