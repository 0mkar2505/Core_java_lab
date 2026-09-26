import java.util.Scanner;

class Payroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;       
        double da = basic * 0.10;        
        double ta = basic * 0.05;        

        double grossSalary = basic + hra + da + ta;

        double pf = basic * 0.12;     
        double professionalTax = 200; 

        double totalDeduction = pf + professionalTax;

        double netSalary = grossSalary - totalDeduction;

        // Payslip
        System.out.println("\n");
        System.out.println("======================================================");
        System.out.println("                  EMPLOYEE PAYSLIP");
        System.out.println("======================================================");

        System.out.printf("%-25s : %s%n", "Employee ID", empId);
        System.out.printf("%-25s : %s%n", "Employee Name", name);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %15s%n", "EARNINGS", "AMOUNT (₹)");
        System.out.println("------------------------------------------------------");

        System.out.printf("%-25s %15.2f%n", "Basic Salary", basic);
        System.out.printf("%-25s %15.2f%n", "HRA (20%)", hra);
        System.out.printf("%-25s %15.2f%n", "DA (10%)", da);
        System.out.printf("%-25s %15.2f%n", "TA (5%)", ta);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %15.2f%n", "Gross Salary", grossSalary);

        System.out.println("\n------------------------------------------------------");
        System.out.printf("%-25s %15s%n", "DEDUCTIONS", "AMOUNT (₹)");
        System.out.println("------------------------------------------------------");

        System.out.printf("%-25s %15.2f%n", "Provident Fund (12%)", pf);
        System.out.printf("%-25s %15.2f%n", "Professional Tax", professionalTax);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %15.2f%n", "Total Deduction", totalDeduction);

        System.out.println("======================================================");
        System.out.printf("%-25s %15.2f%n", "NET SALARY", netSalary);
        System.out.println("======================================================");

        sc.close();
    }
}