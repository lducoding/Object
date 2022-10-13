package chapter07.payment3_1;


public class Employee {

    private String name;
    private int basePays;
    private int workTime;
    private Boolean hourly;

    public Employee(String name, int basePays, int workTime, Boolean hourly) {
        this.name = name;
        this.basePays = basePays;
        this.workTime = workTime;
        this.hourly = hourly;
    }

    public int monthlyPayment() {
        if(hourly) {
            return basePays * workTime;
        }
        return basePays;
    }

    public double calculatePayFor(double taxRate) {
        if (hourly) {
            Integer basePay = basePays * workTime;
            return basePay - (basePay * taxRate);
        }
        return basePays - (basePays * taxRate);
    }

    public String getName() {
        return name;
    }
}
