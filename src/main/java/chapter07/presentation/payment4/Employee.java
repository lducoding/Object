package chapter07.presentation.payment4;

public abstract class Employee {

    protected String name;
    protected int basePays;

    public Employee(String name, int basePays) {
        this.name = name;
        this.basePays = basePays;
    }

    public abstract int monthlyPayment();

    public abstract double calculatePayment(double taxRate);

    public String getName() {
        return name;
    }
}
