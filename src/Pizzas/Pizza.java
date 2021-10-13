/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;

import java.util.ArrayList;

/**
 *
 * @author BDGSA
 */
public class Pizza {
    protected String Especialidad;
    protected String Nombre;
    protected double Precio;
    
    /**
     * Constructor para agregar especialidad y precio
     * El nombre de la pizza queda de forma estandar
     * 
     * @param Especialidad
     * @param Precio 
     */
    public Pizza(String Especialidad,double Precio){
        this.Especialidad = Especialidad;
        this.Precio = Precio;
        this.Nombre = "Pizza de " + this.Especialidad;
    }
    
    public Pizza(String Especialidad,String Nombre,double Precio){
        this.Especialidad = Especialidad;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public String toString(){
        return this.Nombre;
    }
    
}
