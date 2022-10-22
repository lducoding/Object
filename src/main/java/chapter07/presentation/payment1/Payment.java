package chapter07.presentation.payment1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Payment {
    static List<String> employees = Arrays.asList("A", "B", "C");
    static List<Integer> basePays = Arrays.asList(400, 300, 250);;

    public static void main(String[] args) {
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
        Integer basePay = basePays.get(index);
        return basePay - (basePay * taxRate);
    }

    public static void describeResult(String name, double pay) {
        System.out.println("이름: " + name + "급여: " + pay);
    }
}
