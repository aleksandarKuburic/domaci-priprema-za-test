package Zadatak;

/*
Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
Klasa mora imati konstruktore i getere i setere.

Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime. Svi
podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute
klase.
Pored toga, klasa ima:
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno
popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.

Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći
uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki
kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug

Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna
vrednost) i poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve
uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od
50, a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni

Kreirati glavnu klasu I u njoj:
instancirati jednu planinu
napraviti niz ili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na
instanciranu planinu
ispisati kolika je zbir svih clanarina planinara iz niza/liste

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Planina planina1 = new Planina("Himalaji", "Nepal", 4367);

        Planinar planinar1 = new RekreativniPlaninar(12345, "Ivica Dacic", 15, "Kalemegdan",
                4500);
        Planinar planinar2 = new RekreativniPlaninar(12346, "Perica Dacic", 10, "Kalemegdan",
                5000);
        Planinar planinar3 = new RekreativniPlaninar(12347, "Marica Dacic", 5, "Kalemegdan",
                4000);

        Planinar planinar4 = new Alpinista(123, "Verica Dacic", 12);
        Planinar planinar5 = new Alpinista(123, "Danica Dacic", 16);
        Planinar planinar6 = new Alpinista(123, "Vladica Dacic", 7);

        ArrayList <Planinar>  sviPlaninari = new ArrayList<>();
        sviPlaninari.add(planinar1);
        sviPlaninari.add(planinar2);
        sviPlaninari.add(planinar3);
        sviPlaninari.add(planinar4);
        sviPlaninari.add(planinar5);
        sviPlaninari.add(planinar6);

        int zbirClanarina = 0;
        for(Planinar p : sviPlaninari){
            p.stampaj();
            System.out.println("Uspesan uspon: " + p.uspesanUspon(planina1) + "\n");

            zbirClanarina += p.clanarina();
        }
        System.out.println("Zbir clanarina: " + zbirClanarina);
    }
}
