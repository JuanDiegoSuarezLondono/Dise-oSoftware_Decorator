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
public class AireAcondicionado extends AutoDecorator{
    private int litrosPH;
    public AireAcondicionado(Vendible vendible, int myLitrosPH) {
        super(vendible);
        litrosPH = myLitrosPH;
    }
    
    public String getDescription() {
        return getVendible().getDescription() + " + Aire Acondicionado con "+litrosPH+" L/h";
    }
    
    public int getPrecio() {
        return getVendible().getPrecio() + 1500;
    }  
}
