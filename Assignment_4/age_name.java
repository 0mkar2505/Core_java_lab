import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    public String name;
    public int age;
    public String course;
    public int rollNo;

    public Student(String name, int age, String course, int rollNo)
            throws InvalidNameException, InvalidAgeException {
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new InvalidNameException("Name Invalid.");
        }
        if (age < 15 || age > 21) {
            throw new InvalidAgeException(
                    "Age Invalid");
        }
        this.name = name;
        this.age = age;
        this.course = course;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("====================");
        System.out.println("       Details      ");
        System.out.println("====================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Roll No: " + rollNo);
    }
}

class myMain4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            Student student = new Student(name, age, course, rollNo);
            student.displayDetails();
        } catch (InvalidNameException | InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception e.");
        }
    }
}
