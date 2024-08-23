/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;


/**
 *
 * @author luisd
 */

public class Automovil extends Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Automovil(String FFabricacion, String VinChasis, String VinMotor, String marca, String modelo, double precio) {
        super(FFabricacion, VinChasis, VinMotor);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

public String imprimirDatos() {
    return ("Fecha de Fabricacion: " + getFFabricacion() + "\n" + "VIN Chasis: " + getVinChasis() + "\n" + "VIN Motor: " + getVinMotor() + "\n" + "Marca: " + getMarca() + "\n" + "Modelo: " + getModelo() + "\n" + "Precio: $" + getPrecio()) ;
}
}