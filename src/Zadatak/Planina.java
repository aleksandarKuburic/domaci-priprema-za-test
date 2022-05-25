package Zadatak;
/*
Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
Klasa mora imati konstruktore i getere i setere.

 */

public class Planina {
    private String ime;
    private String drzava;
    private int visina;

    public Planina(String ime, String drzava, int visina) {
        this.ime = ime;
        this.drzava = drzava;
        this.visina = visina;
    }

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getDrzava() {
        return drzava;
    }
    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }
    public int getVisina() {
        return visina;
    }
    public void setVisina(int visina) {
        if(visina > 0) {
            this.visina = visina;
        }
        else {
            System.err.println("Nevalidan unos");
        }
    }
}
