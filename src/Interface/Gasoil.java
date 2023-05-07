/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author suare
 */
public class Gasoil extends AutoDecorator{
    private int capacidad;
    public  Gasoil(Vendible vendible,int myCapacidad) {
        super(vendible);
        capacidad = myCapacidad;
    }
    
    public String getDescription() {
        return getVendible().getDescription() + " + Gasoil con capacidad de "+capacidad;
    }
    
    public int getPrecio() {
        return getVendible().getPrecio() + 1200;
    }
    
}
