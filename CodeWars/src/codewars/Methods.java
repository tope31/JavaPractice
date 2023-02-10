package codewars;

import org.w3c.dom.ranges.Range;

import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.rangeClosed;

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

    public String maskify2(String str) {
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

    public String maskify(String str) {
        String mask = "";
        String masker = "#";
        if (str.length() <= 4) {
            return str;
        } else
            for (int index = 0; index < str.length(); index++) {
                if (index >= str.length() - 4) {
                    mask += str.charAt(index);
                } else {
                    mask += masker;
                }
            }
        return mask;
    }

    public String charAtPrac(String str) {
        String temp = "";
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
                temp += Character.toUpperCase(str.charAt(index));
            } else {
                temp += str.charAt(index);
            }
        }
        return temp;
    }

    public String romanNumerals(String str) {
        String temp = "";
        String[] ones = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int index = 0; index < str.length(); index++) {
            temp = ones[index];
        }

        return temp;
    }

    public String removeFirstLastLetter(String str) {
        String temp = "";

        for (int index = 1; index < str.length() - 1; index++) {
            temp += str.charAt(index);
        }

        return temp;
    }

    public static int[] between(int a, int b) {
//        List<Integer> between = new ArrayList<>();
//
//        for (int index = a; index <= b; index++) {
//            between.add(index);
//        }
//
//        return between.stream().mapToInt(i->i).toArray();
        return rangeClosed(a, b).toArray();
    }

    public static void drawRightTriangle(int row) {
        for (int index = 1; index <= row; index++) {
            for (int j = 1; j < index; j++) {
                System.out.print(index);
            }
            System.out.println(index);
        }
    }

    public static void drawAscendingTriangle(int height) {
        int count = 0;
        for (int index = 1; index <= height; index++) {
            for (int j = 0; j < index; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void drawRepeatingTriangle(int height) {
        int count = 0;
        for (int index = 1; index <= height; index++) {
            for (int j = 0; j < index; j++) {
                count++;
                System.out.print(count);
            }
            count = 0;
            System.out.println();
        }
    }

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
        int totalGoals = 0;

        totalGoals = laLigaGoals + copaDelReyGoals + championsLeagueGoals;

        return totalGoals;
    }

    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        List<Integer> integerList = new ArrayList<>();
        int[] temp = {};
        int count = 0;
        for (int index = 0; index < numbers.length; index++) {
            integerList.add(numbers[index]);
//            System.out.print(numbers[index] + " ");
        }
        Object[] objects = integerList.toArray();
        return temp;
    }

    public static void listExample() {
        List<String> integerList = new ArrayList<>();
        integerList.add("hey");
        integerList.add("jorge");

        System.out.println(integerList);
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        int temp = 0;

        for (int index = 0; index < firstCuboid.length; index++) {
            temp *= index;
        }

        return temp;
    }

//    public void nestedFor(int num) {
//        for (int index = 0; index < num; index++) {
//            System.out.println("test");
//            for (int j = 0; j < num; j++) {
//                System.out.println(j);
//            }
//        }
//    }

//    public void nestedFor(int num) {
//        for (int index = 1; index <= num; index++) {
//            System.out.print(index);
//            for (int j = 1; j < index; j++) {
//                System.out.print(index);
//            }
//            System.out.println("");
//        }

    public void nestedFor(int num) {
        int count = 0;
        for (int index = 1; index <= num; index++) {
            System.out.print(count);
            for (int j = 0; j < index; j++) {
                count++;
                System.out.print(count);
            }
//            count = 0;
            System.out.println("");
        }
    }

    public static String countingSheep(int num) {
        //Add your code here
        String count = "";
        if (num == 0) {
            return "";
        }
        for (int index = 1; index <= num; index++) {
            count += index + "sheep...";
        }
        return count;
    }

    public static String greet(String name) {
        String text = "Hello, " + name + " how are you doing today?";
        // Your code here
        return text;
    }

    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static String correct(String string) {
        String temp = string.replaceAll("5", "S");
        String temp1 = temp.replaceAll("0", "O");
        String temp2 = temp1.replaceAll("1", "I");

        return temp2;
    }

    public static String switchItUp(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
        }
        return "";
    }

    public static String reverseLetter(final String str) {
        String[] reverse = str.split("");
        String temp = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            temp += reverse[index];
        }
        return temp.replaceAll("[^A-Za-z0-9]", ""); //coding and coding..
    }

    public static int howOld(final String herOld) {
        char c = herOld.charAt(0);
        String string = Character.toString(c);
        int age = Integer.parseInt(string);


        //your code here, return correct age as int ; )
        return age;
    }

    public static int findShort(String s) {
        String[] temp = s.split("\\s");
        int tempNum = 0;
        for (int index = 0; index < temp.length; index++) {
            if (tempNum == 0 || tempNum > temp[index].length()) {
                tempNum = temp[index].length();
            }
        }
        return tempNum;
    }

    public static String updateLight(String current) {
        if (current.equals("green")) {
            return "yellow";
        } else if (current.equals("yellow")) {
            return "red";
        } else if (current.equals("red")) {
            return "green";
        } else {
            return "not a valid traffic light color";
        }
    }

    public static String abbrevName(String name) {
        String[] arrName = name.split(" ");
        String temp = "";
        for (int index = 0; index < arrName.length; index++) {
            temp += arrName[index].charAt(0) + ".";
        }
        return temp.toUpperCase().substring(0, 3);
    }
}