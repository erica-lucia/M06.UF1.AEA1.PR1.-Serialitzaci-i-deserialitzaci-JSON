/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreon.benites.erica.mp06.uf01.json.ordinadors;

/**
 *
 * @author Usuario
 */


import java.io.Serializable;

public class Ordinador {
    private transient String numSerie; // Excluido de la serialización
    private String marca;
    private String model;
    private int memoria; // En GB
    private int discDur; // En GB
    private String processador;

    // Constructor por defecto
    public Ordinador() {}

    // Constructor con parámetros
    public Ordinador(String numSerie, String marca, String model, int memoria, int discDur, String processador) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.model = model;
        this.memoria = memoria;
        this.discDur = discDur;
        this.processador = processador;
    }

    // Getters y Setters
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDiscDur() {
        return discDur;
    }

    public void setDiscDur(int discDur) {
        this.discDur = discDur;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Ordinador{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", memoria=" + memoria +
                "GB, discDur=" + discDur +
                "GB, processador='" + processador + '\'' +
                '}';
    }
}
