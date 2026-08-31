package Java_lab.Assignment_1;

import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the 1st word to be checked: ");
            String word = sc.nextLine();

            System.out.print("Enter the 2nd word to be checked: ");
            String word2 = sc.nextLine();

            int length1 = word.length();
            int length2 = word2.length();

            boolean anagram = true;

            if (length1 != length2) {
                anagram = false;
            } else {
                for (int i = 0; i < length1; i++) {
                    int count1 = 0;
                    int count2 = 0;

                    for (int j = 0; j < length1; j++) {

                        if (word.charAt(i) == word.charAt(j)) {
                            count1++;
                        }

                        if (word.charAt(i) == word2.charAt(j)) {
                            count2++;
                        }
                    }

                    if (count1 != count2) {
                        anagram = false;
                        break;
                    }
                }
            }

            if (anagram) {
                System.out.println("It is an Anagram.");
            } else {
                System.out.println("Not an Anagram.");
            }

            System.out.print("Do you wish to continue? (y/n): ");
            choice = sc.nextLine().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program Ended!");
        sc.close();
    }
}