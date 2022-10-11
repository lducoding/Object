package chapter07.payment4;

public class SalaryEmployee extends Employee{


    public SalaryEmployee(String name, int basePay) {
        super(name, basePay);
    }

    @Override
    public double calculatePay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    @Override
    public int monthlyBasePay() {
        return basePay;
    }
}
