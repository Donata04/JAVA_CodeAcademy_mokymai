package uzduotis2;

import java.util.ArrayList;

public class Metodai {
    public static void ivairusMiskas(ArrayList<Object> sarasas){
        System.out.println("Ivairus miskas:");
        for (Object medis: sarasas){
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
    public static void spygliuociuMiskas(ArrayList<Object> sarasas){
        System.out.println("Spygliuociu miskas:");
        for (Object medis: sarasas){
            if (medis instanceof Spygluotis) {
                Spygluotis spygluotis = (Spygluotis) medis;
                System.out.print(spygluotis);
                spygluotis.turi();
            }
        }
    }
    public static void berzuMiskas(ArrayList<Object> sarasas){
        System.out.println("Berzu miskas:");
        for (Object medis: sarasas){
            if (medis instanceof Berzas) {
                Berzas berzas = (Berzas) medis;
                System.out.print(berzas);
                berzas.turi();
            }
        }

    }
}
