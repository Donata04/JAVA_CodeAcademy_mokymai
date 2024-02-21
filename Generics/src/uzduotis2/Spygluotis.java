package uzduotis2;

public class Spygluotis extends  Medis{
    String pavadinimas = "Spygliuotis";
    public void turi(){
        System.out.println(" turi spyglius");
    }
    @Override
    public String toString() {
        return this.pavadinimas;
    }

}
