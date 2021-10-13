/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;

/**
 *
 * @author Ever Chicas
 */
public class PizzaChurrasco extends Pizza{
    
    public PizzaChurrasco() {
        super("Churrasco", 50.0);
    }
    
    public PizzaChurrasco(double Precio) {
        super("Churrasco", Precio);
    }
    
    public PizzaChurrasco(String nombre, double Precio) {
        super("Churrasco", nombre, Precio);
    }
    
}
