package beerSong;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 5;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take it down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;
        }
        System.out.println("No more bottles of beer on the wall");

    }
}
