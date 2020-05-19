
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
public class PelaajanKasi {
    private ArrayList <Kortti> kortit = new ArrayList<> ();
    
    
    public void otaKortti(Kortti kortti){
       kortit.add(kortti);
    }
    
    public int selvitasumma() {
        int summa = 0;
        for (Kortti kortti: kortit) {
            if(kortti.getArvo()>=10){
                summa += 10;
            }
            
            if(kortti.getArvo() == 1){
                summa += 11;
            }
            
            if(kortti.getArvo() != 1 && kortti.getArvo() < 10){
                summa += kortti.getArvo();
            }
        }
        if (kortit.size() == 2 && summa > 21) { 
            summa -= 10;
        }
        return summa;
    }
    
    public boolean Blackjack() {
        
        if(kortit.size() == 2) {
            
            if(selvitasumma() == 21){
                return true;
            }  
        }
    return false;
    }

    @Override
    public String toString() {
        return "Kortit kädessä: " + kortit ;
    }
    
    
}
