package codewars;

import javax.sound.midi.Soundbank;
import java.awt.image.renderable.RenderableImage;

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
            temp += phraseStr[i].substring(0, 1).toUpperCase() + phraseStr[i].substring(1) + " ";
        }
        return temp.trim();
    }

    public static String hoopCount(int n) {
        if (n > 10) {
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }

    public static int[] countBy(int x, int n) {
        int[] temp = new int[n];
        int constantVal = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = constantVal += x;
        }
        return temp;
    }


    public static int findSmallestInt(int[] args) {
        int smallestInt = args[0];
        for (int i = 0; i < args.length; i++) {
            if (smallestInt > args[i]) {
                smallestInt = args[i];
            }
        }
        return smallestInt;
    }

    public static String fakeBin(String numberString) {
        return "";
    }

    public static String wordReversal(String str) {
        String[] strArr = str.split("\\s");
        String wordReverse = "";
        String specialCharacterHolder = " ";
        for (int index = strArr.length - 1; index >= 0; index--) {
            wordReverse += strArr[index] + " ";

            for (int i = 0; i < strArr.length; i++) {
                specialCharacterHolder = strArr[i] + " ";
            }
        }
        return wordReverse.trim() + " " + specialCharacterHolder;
    }

    //TODO bilee boi
    public static String specialCharacter(String str) {
        String[] strArr = str.split("!|\\s");
        String[] strArr2 = str.split("");
        String words = "";
        String specialChar = "";
//        boolean checker =  Character.isLetterOrDigit(str.charAt(0));
        for (int index = strArr.length - 1; index >= 0; index--) {
            words += strArr[index] + " ";
        }
        for (int index = 0; index < strArr2.length; index++) {
            specialChar = strArr2[index];
        }
        return words + specialChar;
    }

    public String maskify(String str) {
        String mask = "";
        String masker = "#";

        if (str.length() <= 4) {
            return str;
        } else
            for (int index = 0; index < str.length() - 4; index++) {
                mask += masker;
            }
        mask += str.substring(str.length() - 4);
        return mask;
    }
}
