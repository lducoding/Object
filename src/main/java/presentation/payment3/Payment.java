package presentation.payment3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {

    static List<Employee> employeeList = Arrays.asList(
        new Employee("A", 400, false, 0),
        new Employee("B", 300, false, 0),
        new Employee("C", 250, false, 0),
        new Employee("partA", 10, true, 3),
        new Employee("partB", 5, true, 4)
    );


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 전체 직원의 총 급여, 2. 직원별 실제 급여");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                sumOfPayment();
                break;
            case 2:
                calculatePayment();
                break;
        }
    }

    public static void sumOfPayment() {
        int sum = 0;

        for (Employee em : employeeList) {
            sum += em.monthlyPayment();
        }

        System.out.println("전체 직원의 총 급여는: " + sum);
    }

    public static void calculatePayment() {
        String name = getName();
        for (Employee em : employeeList) {
            if (em.getName().equals(name)) {
                double taxRate = getTaxRate();
                double pay = em.calculatePayment(taxRate);
                describeResult(name, pay);
                break;
            }
        }
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        return sc.next();
    }

    public static double getTaxRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("세율을 입력하세요");
        double taxRate = sc.nextDouble();
        return taxRate;
    }

    public static void describeResult(String name, double pay) {
        System.out.println("이름: " + name + "급여: " + pay);
    }
}
