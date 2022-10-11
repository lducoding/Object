package chapter07.payment4;

public abstract class Employee {

    public Employee(String name, int basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    protected String name;
    protected int basePay;

    public abstract double calculatePay(double taxRate);
    public abstract int monthlyBasePay();

    public String getName() {
        return name;
    }

    public int getBasePay() {
        return basePay;
    }
}
