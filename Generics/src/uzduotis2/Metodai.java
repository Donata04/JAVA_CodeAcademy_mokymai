package uzduotis2;

import java.util.ArrayList;

public class Metodai {
    public static <E extends Medis> void ivairusMiskas(ArrayList<E> sarasas){
        System.out.println("Ivairus miskas:");
        for (E medis: sarasas){
            if (medis instanceof Spygluotis) {
                Spygluotis spygluotis = (Spygluotis) medis;
                System.out.print(spygluotis);
                spygluotis.turi();
            }
            if (medis instanceof Lapuotis) {
                Lapuotis lapuotis = (Lapuotis) medis;
                System.out.print(lapuotis);
                lapuotis.turi();
            }
        }
    }
    public static <E extends Spygluotis> void spygliuociuMiskas(ArrayList<E> sarasas){
        System.out.println("Spygliuociu miskas:");
        for (E medis: sarasas){
            System.out.print(medis);
            medis.turi();
        }
    }
    public static <E extends Berzas> void berzuMiskas(ArrayList<E> sarasas){
        System.out.println("Berzu miskas:");
        for (E medis: sarasas){
            System.out.print(medis);
            medis.turi();
        }
    }
}
