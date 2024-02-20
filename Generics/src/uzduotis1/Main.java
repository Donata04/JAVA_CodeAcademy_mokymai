package uzduotis1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciuList = new ArrayList<>();
        skaiciuList.add(5);
        skaiciuList.add(10);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("New");

        printList(skaiciuList);
        printList(stringList);

    }

    public static void printList(List<?> list){
        for (Object l : list) {
            System.out.println(l);
        }
    }

}
