import java.util.Scanner;

public class password {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter your password:");
            String str = sc.nextLine();
            int length = str.length();
            int score = 0;
            boolean special = false;
            boolean digit = false;
            boolean lower = false;
            boolean upper = false;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    digit = true;
                }
                if (ch >= 'A' && ch <= 'Z') {
                    upper = true;
                }
                if (ch >= 'a' && ch <= 'z') {
                    lower = true;
                }
                if (!(ch >= 'A' && ch <= 'Z' ||
                        ch >= 'a' && ch <= 'z' ||
                        ch >= '0' && ch <= '9')) {
                    special = true;
                }
            }
            if (special)
                score++;
            if (digit)
                score++;
            if (lower)
                score++;
            if (upper)
                score++;
            if (length >= 8)
                score++;
            if (score == 5) {
                System.out.println("Password is strong.");
            } else if (score >= 3) {
                System.out.println("Password is medium.");
            } else {
                System.out.println("Password is weak.");
            }
            System.out.print("\n Do you wish to continue?(y/n):");
            choice = sc.next().charAt(0);
            sc.nextLine();
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program ended");
        sc.close();
    }
}