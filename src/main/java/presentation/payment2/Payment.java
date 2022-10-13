package presentation.payment2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {

    static List<String> employees = Arrays.asList("A", "B", "C", "partA", "partB");
    static List<Integer> basePays = Arrays.asList(400, 300, 250, 10, 5);
    static List<Boolean> hourly = Arrays.asList(false, false, false, true, true);
    static List<Integer> workTime = Arrays.asList(0, 0, 0, 3, 4);


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

        for (int i = 0; i < hourly.size(); i++) {
            if(hourly.get(i)) {
                sum += basePays.get(i) * workTime.get(i);
            } else {
                sum += basePays.get(i);
            }
        }

        System.out.println("전체 직원의 총 급여는: " + sum);
    }

    public static void calculatePayment() {
        String name = getName();
        double taxRate = getTaxRate();
        double pay = calculatePayFor(name, taxRate);
        describeResult(name, pay);
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

    public static double calculatePayFor(String name, double taxRate) {
        int index = employees.indexOf(name);
        if (hourly.get(index)) {
            Integer basePay = basePays.get(index) * workTime.get(index);
            return basePay - (basePay * taxRate);
        } else {
            Integer basePay = basePays.get(index);
            return basePay - (basePay * taxRate);
        }
    }

    public static void describeResult(String name, double pay) {
        System.out.println("이름: " + name + "급여: " + pay);
    }
}
