/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreon.benites.erica.mp06.uf01.json.ordinadors;

/**
 *
 * @author Usuario
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OrdinadorLogic {
    private final Gson gson;

    public OrdinadorLogic() {
        this.gson = new GsonBuilder()
                .excludeFieldsWithModifiers(java.lang.reflect.Modifier.TRANSIENT) // Excluir 'transient'
                .setPrettyPrinting() // Formato JSON legible
                .create();
    }

    // Serializar un objeto Ordinador
    public String serializeOrdinador(Ordinador ordinador) {
        return gson.toJson(ordinador);
    }

    // Serializar una lista de Ordinadors
    public String serializeOrdinadors(List<Ordinador> ordinadors) {
        return gson.toJson(ordinadors);
    }

    // Deserializar un JSON a un objeto Ordinador
    public Ordinador deserializeOrdinador(String json) {
        return gson.fromJson(json, Ordinador.class);
    }

    // Deserializar un JSON a una lista de Ordinadors
    public List<Ordinador> deserializeOrdinadors(String json) {
        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<Ordinador>>() {}.getType();
        return gson.fromJson(json, listType);
    }

    // Escribir JSON a un archivo
    public void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    // Leer JSON desde un archivo
    public String readFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        }
    }
}
