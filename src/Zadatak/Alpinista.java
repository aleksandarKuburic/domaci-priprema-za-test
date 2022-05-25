package Zadatak;
/*
Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna
vrednost) i poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve
uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od
50, a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni
 */

public class Alpinista extends Planinar {
    private int poeni;

    public Alpinista(int id, String imePrezime, int poeni) {
        super(id, imePrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }
    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }
    public void dodelaPoena(int noviPoeni){
        this.poeni += noviPoeni;
    }

    public int clanarina(){
        return 1500 - poeni * 50;
    }

    public boolean uspesanUspon(Planina planina){
        if(planina.getVisina() <= 4000){
            return true;
        }
        else{
            return false;
        }
    }

    public void stampaj(){
        System.out.println("Alpinista, id:" + getId() + "\n" + "ime: " + getImePrezime() + "\n" + "Broj poena: "
         + poeni);
    }
}
