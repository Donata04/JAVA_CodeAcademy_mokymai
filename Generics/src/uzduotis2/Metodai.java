package uzduotis2;

import java.util.ArrayList;

public class Metodai {
    public static <E> void ivairusMiskas(ArrayList<E> sarasas){
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
    public static <E> void spygliuociuMiskas(ArrayList<E> sarasas){
        System.out.println("Spygliuociu miskas:");
        for (E medis: sarasas){
            if (medis instanceof Spygluotis) {
                Spygluotis spygluotis = (Spygluotis) medis;
                System.out.print(spygluotis);
                spygluotis.turi();
            }
        }
    }
    public static <E> void berzuMiskas(ArrayList<E> sarasas){
        System.out.println("Berzu miskas:");
        for (E medis: sarasas){
            if (medis instanceof Berzas) {
                Berzas berzas = (Berzas) medis;
                System.out.print(berzas);
                berzas.turi();
            }
        }

    }
}
