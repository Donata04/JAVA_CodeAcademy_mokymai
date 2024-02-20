package uzduotis1;

public class Main {
    public static void main(String[] args) {
        Integer[] skaiciuList = new Integer[2];
        skaiciuList[0] = 5;
        skaiciuList[1] = 10;

        String[] stringList = new String[2];
        stringList[0] = "Hello";
        stringList[1] = "New";

        printList(skaiciuList);
        printList(stringList);

    }

    public static <E> void printList(E[] list){
        for (Object l : list) {
            System.out.println(l);
        }
    }

}
