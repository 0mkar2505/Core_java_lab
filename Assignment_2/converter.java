package Java_lab.Assignment_2;

import java.util.Scanner;

class converter {
    public static int fromDecimalToBinary(int number) {
        int binary = 0;
        int place = 1;
        while (number > 0) {
            int remainder = number % 2;
            binary = binary + remainder * place;
            number = number / 2;
            place = place * 10;
        }
        return binary;
    }

    public static int fromBinaryToDecimal(int number) {
        int decimal = 0;
        int place = 1;
        while (number > 0) {
            int remainder = number % 10;
            decimal = decimal + remainder * place;
            number = number / 10;
            place = place * 2;
        }
        return decimal;
    }
}

class mymain3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        int binary = converter.fromDecimalToBinary(decimal);
        System.out.println("Binary = " + binary);
        System.out.print("Enter binary number: ");
        int binaryNumber = sc.nextInt();
        int decimalNumber = converter.fromBinaryToDecimal(binaryNumber);
        System.out.println("Decimal = " + decimalNumber);
        sc.close();
    }
}