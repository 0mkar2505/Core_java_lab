class garbagedemo {

    protected void finalize() {
        System.out.println("Garbage collected.");
    }

    public static void main(String args[]) {

        garbagedemo obj1 = new garbagedemo();
        garbagedemo obj2 = new garbagedemo();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage collection requested.");
    }
}