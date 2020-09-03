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

        int tries = 0;
        boolean foundChar = true;

        while (!secret.equals(letters) && tries < 13) {

            System.out.println("\nBuchstabe: ");
            char input = sc.nextLine().charAt(0);

            int foundRight = 0;

            for (int i = 0; i < letters.size(); i++) {

                char c = letters.get(i);

                if (input == c) {
                    secret.set(i, input);
                    foundRight++;
                }

            }

            if (foundRight == 0) {
                foundChar = false;
            }

            for (char c : secret) {
                System.out.print(c);
            }

            if (!foundChar) {

                tries++;

                switch (tries) {
                    case 1:
                        System.out.println("\n___|___");
                        break;
                    case 2:
                        System.out.println("\n   |");
                        System.out.println("___|___");
                        break;
                    case 3:
                        System.out.println("\n   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 4:
                        System.out.println("\n   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 5:
                        System.out.println("\n   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 6:
                        System.out.println("\n   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 7:
                        System.out.println("\n   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 8:
                        System.out.println("\n       _______");
                        System.out.println("   |/");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 9:
                        System.out.println("\n       _______");
                        System.out.println("   |/      |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 10:
                        System.out.println("\n       _______");
                        System.out.println("   |/      |");
                        System.out.println("   |      (_)");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 11:
                        System.out.println("\n       _______");
                        System.out.println("   |/      |");
                        System.out.println("   |      (_)");
                        System.out.println("   |      \\|/");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 12:
                        System.out.println("\n       _______");
                        System.out.println("   |/      |");
                        System.out.println("   |      (_)");
                        System.out.println("   |      \\|/");
                        System.out.println("   |       |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    case 13:
                        System.out.println("\n       _______");
                        System.out.println("   |/      |");
                        System.out.println("   |      (_)");
                        System.out.println("   |      \\|/");
                        System.out.println("   |       |");
                        System.out.println("   |      / \\");
                        System.out.println("   |");
                        System.out.println("___|___");
                        break;
                    default:
                        System.out.println("\nDu bist gescheitert!");

                }
            }

            foundChar = true;

        }

        System.out.println();

        sc.close();

        if (secret.equals(letters)) {
            System.out.println("\nGewonnen !");
        } else {
            System.out.println("\nVerloren !");
        }

        System.out.println("\nSpiel beendet");


    }

}
