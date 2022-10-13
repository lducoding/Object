package chapter07.payment4_1;

public abstract class Employee {

    protected String name;
    protected int basePays;

    public Employee(String name, int basePays) {
        this.name = name;
        this.basePays = basePays;
    }

    public String getName() {
        return name;
    }

    public abstract int monthlyPayment();

    public abstract double calculatePayFor(double taxRate);
}
