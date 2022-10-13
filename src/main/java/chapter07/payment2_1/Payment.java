package chapter07.payment2_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {

    static List<String> employees = Arrays.asList("A", "B", "C", "partA", "partB");
    static List<Integer> basePays = Arrays.asList(400, 300, 250, 10, 8);
    static List<Integer> workTime = Arrays.asList(0, 0, 0, 4, 6);
    static List<Boolean> hourly = Arrays.asList(false, false, false, true, true);

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
        for (int i = 0; i < hourly.size(); i++) {
            if(hourly.get(i)) {
                sum += basePays.get(i) * workTime.get(i);
            }
        }
        sum += basePays.stream().filter(o -> o > 100).mapToInt(Integer::intValue).sum();
        System.out.println("직원들의 총 급여는: " + sum);
    }

    public static void calculatePay() {
        String name = getName();
        double taxRate = getTaxRate();
        double pay = calculatePayFor(name, taxRate);
        describeResult(name, pay);
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

    private static double calculatePayFor(String name, double taxRate) {
        int index = employees.indexOf(name);

        if (hourly.get(index)) {
            Integer basePay = basePays.get(index) * workTime.get(index);
            return basePay - (basePay * taxRate);
        }
        Integer basePay = basePays.get(index);
        return basePay - (basePay * taxRate);
    }

    private static void describeResult(String name, double pay) {
        System.out.println("이름: " + name + "급여: " + pay);
    }
}
