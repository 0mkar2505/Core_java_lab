class multithread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

class multithreadingdemo {
    public static void main(String args[]) {
        multithread t1 = new multithread();
        t1.start();
    }
}