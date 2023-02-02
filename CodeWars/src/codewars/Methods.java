package codewars;

public class Methods {

    public static String noSpace(final String x) {
        return x.replaceAll("\\s", "");
    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") {
            return null;
        }
        String[] phraseStr = phrase.split(" ");
        String temp = "";
        for (int i = 0; i < phraseStr.length; i++) {
            temp += phraseStr[i].substring(0,1).toUpperCase() + phraseStr[i].substring(1) + " ";
        }
        return temp.trim();
    }

    public static String hoopCount(int n){
        if (n > 10){
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }

    public static int[] countBy(int x, int n){
        int[] temp = new int[n];
        int constantVal = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] =  constantVal += x;
        }
        return temp;
    }


    public static int findSmallestInt(int[] args) {
        int smallestInt = args[0];
        for (int i = 0; i < args.length ; i++) {
            if (smallestInt > args[i]) {
                smallestInt = args[i];
            }
        }
        return smallestInt;
    }




}
