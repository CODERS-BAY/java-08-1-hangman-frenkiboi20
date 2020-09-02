import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> secret = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte gib ein Wort ein: ");
        String secretWord = sc.nextLine();

        for (int i = 0; i < secretWord.length(); i++) {
            secret.add('*');
        }

        for (int i = 0; i < secret.size(); i++) {
            System.out.print(secret.get(i));

        }

        System.out.println();

        for (int i = 0; i < secretWord.length(); i++) {
            letters.add(secretWord.charAt(i));
        }

        while (!secret.equals(letters)) {

            System.out.print("Buchstabe: ");
            char input = sc.nextLine().charAt(0);
            for (int i = 0; i < letters.size(); i++) {

                char c = letters.get(i);
                if (input == c) {
                    secret.set(i, input);
                }
            }

            for (char c : secret) {
                System.out.print(c);
            }

            System.out.println();

        }

        sc.close();

        if (secret.equals(letters)) {
            System.out.println("\nGewonnen !");
        } else {
            System.out.println("\nVerloren !");
        }

        System.out.println("\nSpiel beendet");
    }

}
