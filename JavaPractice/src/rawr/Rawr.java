package rawr;

import java.util.ArrayList;

public class Rawr {

    public static void arraysList() {
        ArrayList<String> cars = new ArrayList<>();
        System.out.println(cars.isEmpty());
        cars.add("Nimac");
        System.out.println("after adding something");
        System.out.println(cars.isEmpty());
        System.out.println("the arrayList data is: " + cars.get(0));
    }
}
