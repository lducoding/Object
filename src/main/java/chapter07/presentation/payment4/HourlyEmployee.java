package chapter07.presentation.payment4;

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
    public double calculatePayment(double taxRate) {
        int pay = basePays * workTime;
        return pay - ( pay * taxRate);
    }
}
