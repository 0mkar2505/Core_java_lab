package Java_lab.Assignment_2;

class gcTest {
    static {
        System.out.println("Initialize");
    }

    public static void main(String args[]) {
        System.out.println("In main...");
        gcTest x = new gcTest();
        System.out.println("Object before gc: " + x);
        x = null;
        System.gc();
        System.out.println("Garbage Collected!");
    }
}