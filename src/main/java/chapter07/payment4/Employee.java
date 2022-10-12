package chapter07.payment4;

public abstract class Employee {

    protected String name;
    protected int basePay;

    public Employee(String name, int basePay) {
        this.name = name;
        this.basePay = basePay;
    }
    public abstract double calculatePay(double taxRate);
    public abstract int monthlyBasePay();

    public String getName() {
        return name;
    }

}
