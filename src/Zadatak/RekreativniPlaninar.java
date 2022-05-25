package Zadatak;
/*
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
 */

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maksimalniUspon;
    private static int clanarina = 1000;

    public RekreativniPlaninar(int id, String imePrezime, int tezinaOpreme, String okrug, int maksimalniUspon) {
        super(id, imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maksimalniUspon = maksimalniUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }
    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }
    public String getOkrug() {
        return okrug;
    }
    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }
    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }
    public void setMaksimalniUspon(int maksimalniUspon) {
        this.maksimalniUspon = maksimalniUspon;
    }

    public static int getClanarina() {
        return clanarina;
    }

    public static void setClanarina(int clanarina) {
        RekreativniPlaninar.clanarina = clanarina;
    }

    public boolean uspesanUspon(Planina planina){
        if(planina.getVisina() <= maksimalniUspon - tezinaOpreme * 50){
            return true;
        }
        else{
            return false;
        }
    }

    public int clanarina(){
        return clanarina;
    }

    public void stampaj(){
        System.out.println("Rekreativac, id:" + getId() + "\n" + "ime: " + getImePrezime() + " Okrug: " + okrug);
    }

}
