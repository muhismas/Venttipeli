
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s1901557
 */
public class Blackjack {

    public static void main(String[] args) throws InterruptedException {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Heippa, syöttäisitkö nimesi?");
        String nimi = lukija.nextLine();
        System.out.println("Kuinka monta korttipakkaa haluaisitko," + nimi + " ?");
        int maara = Integer.parseInt(lukija.nextLine());
        Korttipakka pakka = new Korttipakka(maara);
        pakka.sekoita();
        PelaajanKasi pelaaja = new PelaajanKasi();
        PelaajanKasi vastustaja = new PelaajanKasi();

        System.out.println("Peli alkaa juuri: ");
        System.out.println("");
        Kortti kortti = pakka.jaaKortti();
        pelaaja.otaKortti(kortti);
        Thread.sleep(500);
        System.out.println(kortti);
        kortti = pakka.jaaKortti();
        pelaaja.otaKortti(kortti);
        Thread.sleep(500);
        System.out.println(kortti);
        Thread.sleep(500);
        System.out.println("Sinun korttien summa: " + pelaaja.selvitasumma());
        System.out.println("");

        while (true) {
            if (pelaaja.selvitasumma() <= 21) {
                Thread.sleep(500);
                System.out.println("Haluatko lisäkortin? (y/n)");
                String vastaus = lukija.nextLine();
                System.out.println("");

                if (vastaus.equals("y")) {
                    kortti = pakka.jaaKortti();
                    pelaaja.otaKortti(kortti);
                    System.out.println(kortti);
                    Thread.sleep(500);
                    System.out.println("Sinun korttien summa: " + pelaaja.selvitasumma());
                } else if (vastaus.equals("n")) {
                    break;
                }
            }

            if (pelaaja.selvitasumma() > 21) {
                break;
            }
        }

        if (pelaaja.selvitasumma() <= 21) {
            Thread.sleep(500);
            System.out.println("Vatstustajan vuoro alkaa nyt.");
            System.out.println("");

            while (vastustaja.selvitasumma() <= 15) {
                kortti = pakka.jaaKortti();
                vastustaja.otaKortti(kortti);
                Thread.sleep(500);
                System.out.println(kortti);

            }
            
            
            Thread.sleep(500);
            System.out.println("Vastustajan vuoro loppuu tähän.");
        }

        
        if (vastustaja.selvitasumma() <= 21 && pelaaja.selvitasumma() <= 21) {
            if (vastustaja.selvitasumma() < pelaaja.selvitasumma()) {
                Thread.sleep(500);
                System.out.println("Vastustajan korttien summa: " + vastustaja.selvitasumma()
                        + " ja sinun korttien summa: " + pelaaja.selvitasumma());
                System.out.println("");
                Thread.sleep(500);
                System.out.println(nimi + " voittaa!");
            } else if (vastustaja.selvitasumma() > pelaaja.selvitasumma()) {
                System.out.println("");
                Thread.sleep(500);
                System.out.println("Vastustajan korttien summa: " + vastustaja.selvitasumma()
                        + " ja sinun korttien summa: " + pelaaja.selvitasumma());
                System.out.println("");
                Thread.sleep(500);
                System.out.println("Vastustaja voittaa!");
            } else if (vastustaja.selvitasumma() == pelaaja.selvitasumma()) {
                System.out.println("Vastustajan kädessä olevien korttien summa on yhtä kuin sinun");
                System.out.println("Tasapeli, Vastustaja voittaa!");
            }
        } else if (pelaaja.selvitasumma() > 21) {
            Thread.sleep(500);
            System.out.println("Sinun korttien summa: " + pelaaja.selvitasumma() + " on suurempi kuin 21.");
            Thread.sleep(500);
            System.out.println("Vastustaja Voittaa!");
        } else if (vastustaja.selvitasumma() > 21 && pelaaja.selvitasumma() <= 21) {
            Thread.sleep(500);
            System.out.println("Vastustajan korttien summa: " + vastustaja.selvitasumma()
                    + " ja sinun korttien summa: " + pelaaja.selvitasumma());
            Thread.sleep(500);
            System.out.println(nimi + " voittaa!");
        } else if (vastustaja.Blackjack()) {
            System.out.println("Vastustajalla on Blackjack!");
        } else if (pelaaja.Blackjack()) {
            System.out.println("Sinulla on Blackjack!");
        }

    }
}
