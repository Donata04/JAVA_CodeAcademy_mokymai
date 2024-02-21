package uzduotis2;

import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Kadagys kadagys = new Kadagys();

        whatTreeAmI(azuolas);
        whatTreeAmI(berzas);
        whatTreeAmI(kadagys);
    }

    public static void whatTreeAmI(Medis medis){
        if (medis instanceof Lapuotis) {
            Lapuotis lapuotis = (Lapuotis)medis;
            System.out.print(lapuotis);
            lapuotis.turi();
        } else if (medis instanceof Spygluotis) {
            Spygluotis spygluotis = (Spygluotis)medis;
            System.out.print(spygluotis);
            spygluotis.turi();
        } else if (medis instanceof Medis) {
            System.out.println("Medis");
        } else {
            System.out.println("No such category");
        }

    }
}