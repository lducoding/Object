package chapter07.payment2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {
    static List<String> employees = Arrays.asList("A", "B", "C", "partA", "partB");
    static List<Integer> basePays = Arrays.asList(400, 300, 250, 1, 2);;
    static List<Boolean> partTimeFlag = Arrays.asList(false, false, false, true, true);
    static List<Integer> timePay = Arrays.asList(0,0,0,100,120);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1번 급여 총합 , 2번 급여계산");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: sumOfPayment(basePays, partTimeFlag);
            break;
            case 2: calculatePay();
            break;
        }
    }

    public static void calculatePay() {
        String name = getName();
        double taxRate = getTaxRate();
        double pay = calculatePayFor(name, taxRate);
        describeResult(name, pay);
    }

    private static void sumOfPayment(List<Integer> basePays, List<Boolean> partTimeFlag) {
        int sum = 0;
        for (int i = 0; i < partTimeFlag.size(); i++) {
            if(partTimeFlag.get(i)) {
                sum += timePay.get(i) * basePays.get(i);
            }
        }
        sum += basePays.stream().filter(o -> o > 100).mapToInt(Integer::intValue).sum();

        System.out.println("급여의 총 합은: " + sum);
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

        if(partTimeFlag.get(index)) {
            int basePay = basePays.get(index) * timePay.get(index);
            return basePay - (basePay * taxRate);
        } else {
            Integer basePay = basePays.get(index);
            return basePay - (basePay * taxRate);
        }
    }

    private static void describeResult(String name, double pay) {
        System.out.println("이름: " + name + "급여: " + pay);
    }
}
