
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s1901557
 */
public class Korttipakka {

    private ArrayList<Kortti> pakka = new ArrayList<>();

    public Korttipakka(int maara) {
        for (int n = 1; n <= maara; n++) {
            for (int i = 1; i < 14; i++) {
                pakka.add(new Kortti(i, "Mustat pata"));
            }
            for (int i = 1; i < 14; i++) {
                pakka.add(new Kortti(i, "Punaiset hertta"));
            }
            for (int i = 1; i < 14; i++) {
                pakka.add(new Kortti(i, "Risti"));
            }
            for (int i = 1; i < 14; i++) {
                pakka.add(new Kortti(i, "Ruutu"));
            }
        }
    }

    @Override
    public String toString() {
        return "Korttipakka{" + "pakka=" + pakka + '}';
    }

    public void sekoita() {
        Collections.shuffle(pakka);
    }

    public Kortti jaaKortti() {
        Kortti kortti = pakka.get(0);
        pakka.remove(0);
        return kortti;
    }

}
