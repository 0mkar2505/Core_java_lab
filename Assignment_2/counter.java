class Counter {

    static int count;
    static String str2 = "test2";
    String val = "Normal Variable in Normal Method";

    Counter() {
        count++;
    }

    Counter(int count) {
        count++;
    }

    static int displayCount() {
        // System.out.println(val); Non static variable in static method not possible
        String str = "test";
        System.out.println("Number of objects: " + count);
        System.out.println("Test String: " + str); // Same as below
        System.out.println("Test String 2: " + str2); // Static Variable being called in Static Method
        return count;
    }

    void display() {
        System.out.println(val);
    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.display();
        c2.display();
        c2.displayCount();
    }
}
