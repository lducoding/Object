package chapter07.payment4;

public class CeoEmployee extends Employee{

    private int yearPay;

    public CeoEmployee(String name, int basePay, int yearPay) {
        super(name, basePay);
        this.yearPay = yearPay;
    }

    @Override
    public double calculatePay(double taxRate) {
        return monthlyBasePay() - (monthlyBasePay() * taxRate);
    }

    @Override
    public int monthlyBasePay() {
        return yearPay/12;
    }
}
