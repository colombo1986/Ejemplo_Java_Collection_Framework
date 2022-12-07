package org.cvergara.ejemplos.list;

import org.cvergara.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    //ArrayList se listan en el orden que se agregan
    //Se pueden agregar elementos repetidos no como en los set
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + " , size = " + enlazada.size());
        System.out.println("esta vacia = "+ enlazada.isEmpty());

        enlazada.add(new Alumno("Pato" , 5));
        enlazada.add(new Alumno("Cata" , 6));
        enlazada.add(new Alumno("Luci" , 4));
        enlazada.add(new Alumno("Jano" , 7));
        enlazada.add(new Alumno("Andres" , 3));

        System.out.println(enlazada + " , size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus" , 5));
        enlazada.addLast(new Alumno("Atenea" , 6));
        System.out.println(enlazada.removeFirst());
        System.out.println(enlazada.removeLast());

        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println( "Primero" +enlazada.getFirst());
        System.out.println( "Ultimo" +enlazada.getLast());


        ListIterator<Alumno> li = enlazada.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }


    }
}
