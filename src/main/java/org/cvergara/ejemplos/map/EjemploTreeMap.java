package org.cvergara.ejemplos.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {

    public static void main(String[] args) {

      //  Map<String , Object> persona = new TreeMap<>((a , b) -> b.compareTo(a)) ;
        Map<String , Object> persona = new TreeMap<>(Comparator.reverseOrder()) ;
        persona.put("nombre" , "Jonathan");
        persona.put("apellido", "Doe") ;
        persona.put("email" , "jonathan@correo.com");
        persona.put("edad" , 30) ;

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais" , "USA");
        direccion.put("estado" , "California");
        direccion.put("ciudad" , "Santa Barbara");
        direccion.put("calle" , "One Street");
        direccion.put("numero" , "120");

        persona.put("direccion" , direccion);

        System.out.println("persona = " + persona);

    }
}
