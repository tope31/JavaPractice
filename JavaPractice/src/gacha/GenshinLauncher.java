package gacha;

import com.sun.source.tree.NewClassTree;

import java.util.Scanner;

public class GenshinLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Genshin genshin = new Genshin();
        String choice = "Y";
        while (true){
            System.out.println("Add Character (Y/N): ");
            choice = scanner.nextLine().toUpperCase();
            if(choice.equals("Y")){
                System.out.println("Enter character to be added on Character List");
                genshin.setCharacters(scanner.nextLine());
            }
            else {
                break;
            }

        }
        for (String name: genshin.characters) {
            System.out.println(name);

        }





    }
}
