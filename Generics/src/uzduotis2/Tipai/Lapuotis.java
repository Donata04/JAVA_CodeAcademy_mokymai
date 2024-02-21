package uzduotis2.Tipai;

import uzduotis2.Medziai.Medis;

public class Lapuotis extends Medis {
    String pavadinimas = "Lapuotis";
    public void turi(){
        System.out.println(" turi lapus");
    }
    @Override
    public String toString() {
        return this.pavadinimas;
    }

}
