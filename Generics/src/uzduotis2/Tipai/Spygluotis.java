package uzduotis2.Tipai;

import uzduotis2.Medziai.Medis;

public class Spygluotis extends Medis {
    String pavadinimas = "Spygliuotis";
    public void turi(){
        System.out.println(" turi spyglius");
    }
    @Override
    public String toString() {
        return this.pavadinimas;
    }

}
