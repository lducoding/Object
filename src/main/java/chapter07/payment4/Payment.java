package chapter07.payment4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {
    static List<Employee> employees = Arrays.asList(
        new SalaryEmployee("A", 400),
        new SalaryEmployee("B", 300),
        new SalaryEmployee("C", 200),
        new HourlyEmployee("PartA", 10, 6),
        new HourlyEmployee("PartB", 8, 4),
        new CeoEmployee("CEOA", 0, 100)
    );


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1번 급여 총합 , 2번 급여계산");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: sumOfPayment(employees);
            break;
            case 2: calculatePay(employees);
            break;
        }
    }

    public static void calculatePay(List<Employee> employees) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        for (Employee em : employees) {
            if(name.equals(em.getName())) {
                System.out.println("세율을 입력하세요");
                double taxRate = sc.nextDouble();
                System.out.println(name+"의 급여는: "+em.calculatePay(taxRate));
            }
        }
    }

    public static void sumOfPayment(List<Employee> employees) {
        int sum = 0;
        for (Employee em : employees) {
            sum += em.monthlyBasePay();
        }

        System.out.println("급여의 총 합은: " + sum);
    }

}
