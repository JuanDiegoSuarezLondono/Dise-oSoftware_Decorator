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
public class CdPlayer extends AutoDecorator{
    private String formato;
    public CdPlayer(Vendible vendible,String myFormato) {
        super(vendible);
        formato = myFormato;
    }
    
    public String getDescription(){
        return getVendible().getDescription() + " + CD Player de formato "+formato;
        
    }
    
    public int getPrecio() {
        return getVendible().getPrecio() + 100;
    }    
}
