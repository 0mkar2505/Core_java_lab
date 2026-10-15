class A extends Thread {
    public void run() {
        System.out.println("Thread A Started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("\t from thread A: i = " + i);
            System.out.println("Exit from A");
        }
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B Started");
        for (int j = 1; j <= 4; j++) {
            System.out.println("\t from thread B: i = " + j);
            System.out.println("Exit from B");
        }
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Thread C Started");
        for (int k = 1; k <= 4; k++) {
            System.out.println("\t from thread C: i = " + k);
            System.out.println("Exit from C");
        }
    }
}

public class priority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
