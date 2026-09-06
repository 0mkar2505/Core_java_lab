abstract class Bank{
    double principal;
    double rate;
    double time;
    Bank(double principal, double rate, double time)
    {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract void calculateInterest();
}
class SimpleInterest extends Bank{
    SimpleInterest(double principal, double rate, double time)
    {
        super(principal, rate, time);
    }
    void calculateInterest()
    {
        double interest = (principal * rate * time) / 100;
        double amount = principal + interest;

        System.out.println("Simple Interest = Rs. " + interest);
        System.out.println("Total Amount = Rs. " + amount);
    }
}
class CompoundInterest extends Bank{
    CompoundInterest(double principal, double rate, double time)
    {
        super(principal, rate, time);
    }
    void calculateInterest()
    {
        double amount = principal;
        for(int i = 1; i <= time; i++)
        {
            amount = amount + (amount * rate / 100);
        }
        double interest = amount - principal;
        System.out.println("Compound Interest = Rs. " + interest);
        System.out.println("Total Amount = Rs. " + amount);
    }
}
class Demo2{
    public static void main(String args[])
    {
        SimpleInterest si = new SimpleInterest(25000, 9.25, 5);
        CompoundInterest ci = new CompoundInterest(25000, 8.5, 5);
        si.calculateInterest();
        System.out.println();
        ci.calculateInterest();
    }
}