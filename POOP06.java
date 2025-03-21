/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.UNAM.FI.POO;

import pokemon.Pokemon;

/**
 *
 * @author Orozco Mora Gerardo
 */
public class POOP06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Pokemon rayquaza = new Pokemon("rayquaza",150,90,150,90,105,90,6);
        
        rayquaza.atacar();
        rayquaza.setAtaque(155);
        rayquaza.atacar();
        
    }
    
}
