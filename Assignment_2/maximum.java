import java.util.Scanner;
class maxi {
    public static int findMax(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}

class mymain2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many sets: ");
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            System.out.print("Enter the number of values in set " + j + ": ");
            int size = sc.nextInt();
            int a[] = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Values in set " + j + ": {");
            for (int i = 0; i < size; i++) {
                System.out.print(a[i]);
                if (i < size - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("}");
            int max = maxi.findMax(a);
            System.out.println("maxi Value in set " + j + ": " + max);
        }
        sc.close();
    }
}