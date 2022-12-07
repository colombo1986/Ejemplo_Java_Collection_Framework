package org.cvergara.ejemplos.list;

import org.cvergara.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    //ArrayList se listan en el orden que se agregan
    //Se pueden agregar elementos repetidos no como en los set
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + " , size = " + al.size());
        System.out.println("esta vacia = "+ al.isEmpty());

        al.add(new Alumno("Pato" , 5));
        al.add(new Alumno("Cata" , 6));
        al.add(new Alumno("Luci" , 4));
        al.add(2 , new Alumno("Jano" , 7));
        al.set(3 ,new Alumno("Andres" , 3));

        System.out.println(al + " , size = " + al.size());
        al.remove(new Alumno("Jano" , 7));

        System.out.println(al + " , size = " + al.size());

        boolean b = al.contains(new Alumno("Jano" , 7)) ;
        System.out.println("b = " + b);

        Object a[] = al.toArray() ;
        for(int i = 0 ; i<a.length ; i++){
            System.out.println("Desde el arreglo es el indice " + a[i]);
        }


    }
}
