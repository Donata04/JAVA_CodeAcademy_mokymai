package uzduotis2;

import uzduotis2.Gentis.Azuolas;
import uzduotis2.Gentis.Berzas;
import uzduotis2.Gentis.Kadagys;
import uzduotis2.Medziai.Medis;
import uzduotis2.Tipai.Lapuotis;
import uzduotis2.Tipai.Spygluotis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Kadagys kadagys = new Kadagys();
        Lapuotis lapuotis = new Lapuotis();
        Spygluotis spygluotis = new Spygluotis();
        Berzas berzas1 = new Berzas();

        ArrayList<Medis> medziuSarasas = new ArrayList <>();
        medziuSarasas.add(azuolas);
        medziuSarasas.add(berzas);
        medziuSarasas.add(kadagys);
        medziuSarasas.add(lapuotis);
        medziuSarasas.add(spygluotis);
        medziuSarasas.add(berzas1);

        ArrayList<Spygluotis> spygliuociuSarasas = new ArrayList <>();
        spygliuociuSarasas.add(kadagys);
        spygliuociuSarasas.add(spygluotis);

        ArrayList<Berzas> berzuSarasas = new ArrayList <>();
        berzuSarasas.add(berzas);
        berzuSarasas.add(berzas1);

//        System.out.println(medziuSarasas);
//
//        whatTreeAmI(azuolas);
//        whatTreeAmI(berzas);
//        whatTreeAmI(kadagys);

        Metodai.ivairusMiskas(medziuSarasas);
        System.out.println();
        Metodai.spygliuociuMiskas(spygliuociuSarasas);
        System.out.println();
        Metodai.berzuMiskas(berzuSarasas);
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