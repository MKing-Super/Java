package pers.mk.java.practice.exception;

import java.util.Scanner;

/**
 * @ProjectName: java_practice
 * @Package: pers.mk.java.practice.exception
 * @ClassName: Average
 * @Author: kun.ma
 * @Description: trycatch练习
 * @Date: 2022/1/6 17:29
 * @Version: 1.0
 */
public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int number;
        while (true){
            number = scanner.nextInt();
            if (number == 0){
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("平均%.2f%n", sum/count);
    }

}
