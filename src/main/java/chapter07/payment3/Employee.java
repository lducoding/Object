package chapter07.payment3;

public class Employee {

    private String name;
    private int basePay;
    private boolean hourly;
    private int workTime;

    public double calculatePay(double taxRate) {
        if (hourly) {
            int totalHourPay = basePay * workTime;
            return totalHourPay - (totalHourPay * taxRate);
        } else {
            return basePay - (basePay * taxRate);
        }
    }

    public int monthlyBasePay() {
        if (hourly) {
            return basePay * workTime;
        } else {
            return basePay;
        }
    }

    public String getName() {
        return name;
    }

    public Employee(String name, int basePay, boolean hourly, int workTime) {
        this.name = name;
        this.basePay = basePay;
        this.hourly = hourly;
        this.workTime = workTime;
    }
}
