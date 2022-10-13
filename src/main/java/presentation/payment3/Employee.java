package presentation.payment3;

import java.util.Arrays;
import java.util.List;
import javax.swing.Spring;

public class Employee {

    private String name;
    private int basePays;
    private boolean hourly;
    private int workTime;

    public Employee(String name, int basePays, boolean hourly, int workTime) {
        this.name = name;
        this.basePays = basePays;
        this.hourly = hourly;
        this.workTime = workTime;
    }

    public int monthlyPayment() {
        if(hourly)  {
            return basePays * workTime;
        } else {
            return basePays;
        }
    }

    public double calculatePayment(double taxRate) {
        if (hourly) {
            Integer basePay = basePays * workTime;
            return basePay - (basePay * taxRate);
        } else {
            return basePays - (basePays * taxRate);
        }
    }

    public String getName() {
        return name;
    }
}
