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
public class Asztal {
    private int szelesseg;
    private int magassag;
    private int melyseg;

    public int getSzelesseg() {
        return szelesseg;
    }

    public void setSzelesseg(int szelesseg) {
        this.szelesseg = szelesseg;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public int getMelyseg() {
        return melyseg;
    }

    public void setMelyseg(int melyseg) {
        this.melyseg = melyseg;
    }

    public Asztal(int szelesseg, int magassag, int melyseg) {
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        this.melyseg = melyseg;
    }
    
    
    
}
