/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author luisd
 */

public class Vehiculo {
    private String FFabricacion;
    private String VinChasis;
    private String VinMotor;

    public Vehiculo(String FFabricacion, String VinChasis, String VinMotor) {
        this.FFabricacion = FFabricacion;
        this.VinChasis = VinChasis;
        this.VinMotor = VinMotor;
    }

    /**
     * @return the FFabricacion
     */
    public String getFFabricacion() {
        return FFabricacion;
    }

    /**
     * @param FFabricacion the FFabricacion to set
     */
    public void setFFabricacion(String FFabricacion) {
        this.FFabricacion = FFabricacion;
    }

    /**
     * @return the VinChasis
     */
    public String getVinChasis() {
        return VinChasis;
    }

    /**
     * @param VinChasis the VinChasis to set
     */
    public void setVinChasis(String VinChasis) {
        this.VinChasis = VinChasis;
    }

    /**
     * @return the VinMotor
     */
    public String getVinMotor() {
        return VinMotor;
    }

    /**
     * @param VinMotor the VinMotor to set
     */
    public void setVinMotor(String VinMotor) {
        this.VinMotor = VinMotor;

    }


}