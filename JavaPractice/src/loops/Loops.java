package loops;

public class Loops {
    static String[] nameArray = {"Pierce", "Jeymar", "Timothy"};

    public static void fruitLoops(int count) {
        for (int i = 0; i < count ; i++) {
            System.out.println("ayaya");
        }
        System.out.println("yes it's ayaya");
    }

    public static void enhancedForLoops() {
        for (String servants : nameArray) {
            System.out.println(servants);
        }
    }

    public static void parse(String num){
        System.out.println(num);
    }

    public static void multiFor() {
        for (int x = 0; x < 4; x++) {
                    x++;
            for (int y = 4; y > 2; y--) {
                if (x == 1) {
                    System.out.println(x + " " + y);
                }
            }
        }
    }
    public static void arrList() {
        String[] myList = {"whoohoo", "Frog"};

        for (int i = 0; i < myList.length ; i++) {
            System.out.println(myList);
        }
    }
}
