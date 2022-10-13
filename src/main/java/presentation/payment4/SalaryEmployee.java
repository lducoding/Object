package presentation.payment4;

public class SalaryEmployee extends Employee{

    public SalaryEmployee(String name, int basePays) {
        super(name, basePays);
    }

    @Override
    public int monthlyPayment() {
        return basePays;
    }

    @Override
    public double calculatePayment(double taxRate) {
        return basePays - ( basePays * taxRate);
    }
}
