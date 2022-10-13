package chapter07.payment4_1;

public class SalaryEmployee extends Employee {

    public SalaryEmployee(String name, int basePays) {
        super(name, basePays);
    }

    @Override
    public int monthlyPayment() {
        return basePays;
    }

    @Override
    public double calculatePayFor(double taxRate) {
        return basePays - (basePays * taxRate);
    }
}
