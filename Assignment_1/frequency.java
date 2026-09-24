import java.util.Scanner;

public class frequency {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter your sentence to be analyzed: ");
            String str = sc.nextLine();
            String[] words = str.trim().split(" ");
            int count = words.length;
            int maxcount = 0;
            String mostFrequent = "";
            System.out.println("Word Count: " + count);
            for (int i = 0; i < words.length; i++) {
                boolean checked = false;
                for (int j = 0; j < i; j++) {
                    if (words[i].equals(words[j])) {
                        checked = true;
                    }
                }
                if (!checked) {
                    int counter = 0;
                    for (int k = 0; k < words.length; k++) {
                        if (words[i].equals(words[k])) {
                            counter++;
                        }
                    }
                    if (counter > maxcount) {
                        maxcount = counter;
                        mostFrequent = words[i];
                    }
                    System.out.println(words[i] + " occurs " + counter + " times");
                }
            }
            System.out.println("Most frequent word: " + mostFrequent + " occurs " + maxcount + " times");
            System.out.print("\n Do you wish to continue?(y/n):");
            choice = sc.next().charAt(0);
            sc.nextLine();
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program ended");
        sc.close();
    }
}