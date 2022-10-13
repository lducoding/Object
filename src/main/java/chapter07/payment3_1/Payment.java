package chapter07.payment3_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {

    static List<Employee> employeeList = Arrays.asList(
        new Employee("A", 200, 0, false),
        new Employee("B", 300, 0, false),
        new Employee("partA", 10, 4, true),
        new Employee("partB", 5, 8, true)
    );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.직원 급여의 총합, 2.직원별 급여");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                sumOfPayment();
                break;
            case 2:
                calculatePay();
                break;
        }
    }

    public static void sumOfPayment() {
        int sum = 0;
        for (Employee em : employeeList) {
            sum += em.monthlyPayment();
        }
        System.out.println("직원들의 총 급여는: " + sum);
    }

    public static void calculatePay() {
        String name = getName();

        for (Employee em : employeeList) {
            if(em.getName().equals(name)) {
                double taxRate = getTaxRate();
                double pay = em.calculatePayFor(taxRate);
                describeResult(name, pay);
                break;
            }
        }
    }

    private static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        return sc.next();
    }

    private static double getTaxRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("세율을 입력하세요");
        double taxRate = sc.nextDouble();
        return taxRate;
    }

    private static void describeResult(String name, double pay) {
        System.out.println("이름: " + name + "급여: " + pay);
    }
}
