class table1 extends Thread {
    public void run(int first) {
        System.out.println("Multiplication Table for - " + first);

        for (int i = 1; i <= 10; i++) {
            int result = first * i;
            System.out.println(first + "*" + i + "=" + result);
        }
    }
}

class table2 extends Thread {
    public void run(int second) {
        System.out.println("Multiplication Table for - " + second);

        for (int i = 1; i <= 10; i++) {
            int result = second * i;
            System.out.println(second + "*" + i + "=" + result);
        }
    }
}

class table3 extends Thread {
    public void run(int third) {
        System.out.println("Multiplication Table for - " + third);

        for (int i = 1; i <= 10; i++) {
            int result = third * i;
            System.out.println(third + "*" + i + "=" + result);
        }
    }
}

public class multiplication {
    public static void main(String args[]) {
        table1 t1 = new table1();
        table2 t2 = new table2();
        table3 t3 = new table3();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.run(4);
        t2.run(5);
        t3.run(7);

    }
}
