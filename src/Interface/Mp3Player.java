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
public class Mp3Player extends AutoDecorator{
    private boolean inalambrico;
    public Mp3Player(Vendible vendible, boolean myInalambrico) {
        super(vendible);
        inalambrico = myInalambrico;
    }
    
    public String getDescription(){
        return getVendible().getDescription() + " + MP3 Player con inalambrico:"+inalambrico;
    }
    
    public int getPrecio() {
        return getVendible().getPrecio() + 250;
    }       
}
