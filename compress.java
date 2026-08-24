import java.util.Scanner;

public class compress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter string to be compressed: ");
            String str = sc.nextLine();
            String compress = "";
            int count = 1;
            int length = str.length();
            for (int i = 1; i < length; i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    compress = compress + str.charAt(i - 1) + count;
                    count = 1;
                }
            }
            compress = compress + str.charAt(length - 1) + count;
            System.out.println("Compressed String: " + compress);
            System.out.println("Do you wish to continue? (y/n)");
            choice = sc.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program Ended!");
        sc.close();
    }
}