package chapter07.payment4_1;

public class HourlyEmployee extends Employee{

    private int workTime;

    public HourlyEmployee(String name, int basePays, int workTime) {
        super(name, basePays);
        this.workTime = workTime;
    }

    @Override
    public int monthlyPayment() {
        return basePays * workTime;
    }

    @Override
    public double calculatePayFor(double taxRate) {
        double basePay = basePays * workTime;
        return basePay - (basePay * taxRate);
    }
}
