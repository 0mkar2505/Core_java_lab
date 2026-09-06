import java.util.Scanner;

class sum {
    public static int ComputeOddSum(int input) {
        int sum = 0;
        for (int i = 1; i < input; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int ComputeEvenSum(int input) {
        int sum = 0;
        for (int i = 1; i < input; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

class mymain4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            if (input >= 0) {
                int oddSum = sum.ComputeOddSum(input);
                int evenSum = sum.ComputeEvenSum(input);
                System.out.println("Sum of odd numbers = " + oddSum);
                System.out.println("Sum of even numbers = " + evenSum);
            }
        } while (input >= 0);
        sc.close();
    }
}

// E