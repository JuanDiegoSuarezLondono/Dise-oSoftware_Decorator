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
public abstract class AutoDecorator implements Vendible{
    private Vendible vendible;
    
    public AutoDecorator(Vendible vendible){
        setVendible(vendible);
    }
    
    public Vendible getVendible() {
        return vendible;
    }    
    
    public void setVendible(Vendible vendible) {
        this.vendible = vendible;
    }
}
