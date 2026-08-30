class gcTest{
    static{
        System.out.println("Initialize");
    }

protected void finalize() throws Throwable{
    System.out.println("Clean Up");
}

public static void main(String args[]){
    System.out.println("In main...");
    gcTest x = new gcTest();
    x = null;
    System.gc();
}
}