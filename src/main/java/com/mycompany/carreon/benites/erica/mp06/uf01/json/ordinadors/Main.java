/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carreon.benites.erica.mp06.uf01.json.ordinadors;

/**
 *
 * @author Usuario
 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FITXER_INDIVIDUAL = "ordinador.json";
    private static final String FITXER_LLISTA = "ordinadors.json";

    public static void main(String[] args) {
        try {
            Ordinador ordinador1 = new Ordinador("123-ABC", "Dell", "XPS 13", 16, 512, "Intel i7");
            Ordinador ordinador2 = new Ordinador("456-DEF", "HP", "Pavilion", 8, 256, "AMD Ryzen 5");

            List<Ordinador> ordinadors = new ArrayList<>();
            ordinadors.add(ordinador1);
            ordinadors.add(ordinador2);

            OrdinadorLogic logic = new OrdinadorLogic();

            // Serializar y guardar un ordinador
            String jsonOrdinador = logic.serializeOrdinador(ordinador1);
            logic.writeToFile(FITXER_INDIVIDUAL, jsonOrdinador);
            System.out.println("Ordinador guardado en " + FITXER_INDIVIDUAL);

            // Leer y deserializar un ordinador
            String jsonOrdinadorFromFile = logic.readFromFile(FITXER_INDIVIDUAL);
            Ordinador deserializedOrdinador = logic.deserializeOrdinador(jsonOrdinadorFromFile);
            System.out.println("Ordinador deserializado: " + deserializedOrdinador);

            // Serializar y guardar una lista de ordinadors
            String jsonOrdinadors = logic.serializeOrdinadors(ordinadors);
            logic.writeToFile(FITXER_LLISTA, jsonOrdinadors);
            System.out.println("Lista de ordinadors guardada en " + FITXER_LLISTA);

            // Leer y deserializar una lista de ordinadors
            String jsonOrdinadorsFromFile = logic.readFromFile(FITXER_LLISTA);
            List<Ordinador> deserializedOrdinadors = logic.deserializeOrdinadors(jsonOrdinadorsFromFile);
            System.out.println("Lista de ordinadors deserializada: " + deserializedOrdinadors);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



