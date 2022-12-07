package org.cvergara.ejemplos.map;

import java.util.*;
import java.util.function.Function;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String , Object> persona = new HashMap<>() ;
        persona.put(null , "1234") ;
        persona.put("nombre" , "Jonathan");
        persona.put("apellido", "Doe") ;
        persona.put("email" , "jonathan@correo.com");
        persona.put("edad" , 30) ;

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais" , "USA");
        direccion.put("estado" , "California");
        direccion.put("ciudad" , "Santa Barbara");
        direccion.put("numero" , "120");

        persona.put("direccion" , direccion);

        System.out.println("persona = " + persona);

        Map<String , String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio" , "la playa");
        System.out.println("el pais es " + pais);



        System.out.println("persona = " + persona);
        String nombre = (String) persona.get("nombre");
        String apellido = (String) persona.get("apellido");

        System.out.println(nombre + " " + apellido);

        String valor = (String) persona.remove("apellido");
        System.out.println("valor = " + valor);
        
        boolean b2 = persona.containsKey("nombre") ;
        System.out.println("b2 = " + b2);

        Collection<Object> valores = persona.values() ;
        for(Object v: valores){
            System.out.println("obtener valores :" +v);
        }

        Set<String> llaves = persona.keySet(); 
        for(String k: llaves){
            System.out.println("obtener llaves = " + k);
        }

        for (Map.Entry<String, Object> par: persona.entrySet()) {
            System.out.println(par.getKey() +" ---" +par.getValue());
        }

        System.out.println(" ================================");

        for(String llave: persona.keySet()){

            Object llave_valor = (Object) persona.get(llave);
            if(llave_valor instanceof Map){
                Map<String , String> direccionMap = (Map<String , String>) llave_valor;
                System.out.println("El pais de la persona "+ persona.get("nombre"));
                System.out.println("direccion es " + direccionMap.get("pais"));
                System.out.println("La ciudad es" + direccionMap.get("ciudad"));

            }else{
                System.out.println(llave_valor + "->" + valor);
            }

        }

        System.out.println("===========usando java8================");
        persona.forEach((llave, valor1) ->{
            System.out.println(llave + "->" + valor1);
        });

        System.out.println("total " + persona.size());
        System.out.println("contiene elementos " + !persona.isEmpty());
        persona.replace("nombre" , "Juan");
        System.out.println(persona);
    }
}
