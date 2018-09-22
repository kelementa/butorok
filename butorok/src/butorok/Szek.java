/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package butorok;

/**
 *
 * @author kelement
 */
public class Szek {
    private int magassag;
    private boolean isGurulos;

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public boolean isIsGurulos() {
        return isGurulos;
    }

    public void setIsGurulos(boolean isGurulos) {
        this.isGurulos = isGurulos;
    }

    public Szek(int magassag, boolean isGurulos) {
        this.magassag = magassag;
        this.isGurulos = isGurulos;
    }
    
}
