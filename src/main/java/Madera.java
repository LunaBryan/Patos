/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bryan Luna
 */

public class Madera extends Pato{
    public Madera(){
        comportamientoGraznar = new NoGraznar();
        comportamientoVolar = new NoVolar();
        comportamientoFlotar = new Flotar();
    }
    @Override
    public String dibujar(){
        return "Soy un pato de madera...";
    }
    
    
}
