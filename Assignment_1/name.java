import java.util.Scanner;

public class name {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter your full name: ");
            String name = sc.nextLine();
            String name1 = name.trim();
            int len = name1.length();
            System.out.println("Number of characters: " + len);
            int preSpace = name1.indexOf(" ");
            int sufSpace = name1.lastIndexOf(" ");
            String firstName = name1.substring(0, preSpace);
            String lastName = name1.substring(sufSpace, len);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            String low = name1.toLowerCase();
            String up = name1.toUpperCase();
            System.out.println("Name in Lower case: " + low);
            System.out.println("Name in Upper case: " + up);
            System.out.print("Enter character to be searched for: ");
            char search = sc.nextLine().charAt(0);
            boolean found = false;
            for (int j = 0; j < len; j++) {
                if (name1.charAt(j) == search) {
                    System.out.println("Character found at index: " + j);
                    found = true;
                }
            }
            if (found == false) {
                System.out.println("Character not found!");
            }
            String[] words = name1.split(" ");
            System.out.print("Reversed Name: ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
            System.out.println("Do you wish to continue? (y/n)");
            choice = sc.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program Ended!");
        sc.close();
    }
}