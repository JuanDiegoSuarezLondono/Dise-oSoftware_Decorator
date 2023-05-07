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
public class FiatUno extends Auto{
    private int precio = 15000;
    public String getDescription() {
        return "Fiat Uno modelo 2006";
    }
    
    public int getPrecio() {
        return precio;
    }    
}
