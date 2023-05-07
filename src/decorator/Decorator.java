/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import Interface.AireAcondicionado;
import Interface.CdPlayer;
import Interface.FiatUno;
import Interface.FordFiesta;
import Interface.Gasoil;
import Interface.Mp3Player;
import Interface.Vendible;

/**
 *
 * @author suare
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendible auto = new FiatUno();
        auto = new CdPlayer(auto,"DvD");
        auto = new Gasoil(auto,100);
        
        System.out.println(auto.getDescription());
        System.out.println("Su precio es: " + auto.getPrecio());
        
        Vendible auto2 = new  FordFiesta();
        auto2 = new Mp3Player(auto2,false);
        auto2 = new Gasoil(auto2,70);
        auto2 = new AireAcondicionado(auto2,1000);
        
        System.out.println(auto2.getDescription());
        System.out.println("Su precio es: " + auto2.getPrecio());
    }
    
}
