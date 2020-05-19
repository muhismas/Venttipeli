
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class Kortti {
    private int arvo;
    private String maa;

    public Kortti(int arvo, String maa) {
        this.arvo = arvo;
        this.maa = maa;
    }

    

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    @Override
    public String toString() {
        return "("  + arvo + " , " + maa + ")";
    }
    
    
}
