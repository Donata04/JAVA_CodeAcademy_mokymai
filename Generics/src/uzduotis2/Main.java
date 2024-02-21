package uzduotis2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Kadagys kadagys = new Kadagys();
        Lapuotis lapuotis = new Lapuotis();
        Spygluotis spygluotis = new Spygluotis();
        Berzas berzas1 = new Berzas();

        ArrayList<Object> medziuSarasas = new ArrayList <>();
        medziuSarasas.add(azuolas);
        medziuSarasas.add(berzas);
        medziuSarasas.add(kadagys);
        medziuSarasas.add(lapuotis);
        medziuSarasas.add(spygluotis);
        medziuSarasas.add(berzas1);
//        System.out.println(medziuSarasas);
//
//        whatTreeAmI(azuolas);
//        whatTreeAmI(berzas);
//        whatTreeAmI(kadagys);

        Metodai.ivairusMiskas(medziuSarasas);
        System.out.println();
        Metodai.spygliuociuMiskas(medziuSarasas);
        System.out.println();
        Metodai.berzuMiskas(medziuSarasas);
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