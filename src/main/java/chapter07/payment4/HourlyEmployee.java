package chapter07.payment4;

public class HourlyEmployee extends Employee{

    private int workTime;

    public HourlyEmployee(String name, int basePay, int workTime) {
        super(name, basePay);
        this.workTime = workTime;
    }

    @Override
    public double calculatePay(double taxRate) {
        int totalHourPay = basePay * workTime;
        return totalHourPay - (totalHourPay * taxRate);
    }

    @Override
    public int monthlyBasePay() {
        return basePay * workTime;
    }
}
