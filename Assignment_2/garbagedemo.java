class garbagedemo {

    public static void main(String args[]) {

        garbagedemo obj1 = new garbagedemo();
        garbagedemo obj2 = new garbagedemo();
        System.out.println("Object before gc: " + obj1);
        System.out.println("Object before gc: " + obj2);

        obj1 = null;
        obj2 = null;

        System.out.println("Garbage collection requested.");
        System.gc();
        System.out.println("Garbage Collection completed");
    }
}