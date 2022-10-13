package chapter07.payment4_1;

public class CeoEmployee extends Employee{

    private int yearPay;

    public CeoEmployee(String name, int yearPay) {
        super(name, 0);
        this.yearPay = yearPay;
    }

    @Override
    public int monthlyPayment() {
        return yearPay/12;
    }

    @Override
    public double calculatePayFor(double taxRate) {
        return yearPay - (yearPay * taxRate);
    }
}
