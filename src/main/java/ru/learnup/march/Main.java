package ru.learnup.march;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);

        Scanner num = new Scanner(System.in);
        float first, second;
        System.out.print("Input the first num: ");
        first = num.nextFloat();
        System.out.print("Input the second num: ");
        second = num.nextFloat();
        System.out.print("Choose an operator: '+' or '-' or '*' or '/': ");

        String operator = num.next();

        switch (operator) {
            case "+" -> System.out.println(calculator.sum((double) first, (double) second));
            case "-" -> System.out.println(calculator.subtract((double) first, (double) second));
            case "/" -> System.out.println(calculator.divide((double) first, (double) second));
            case "*" -> System.out.println(calculator.multiply((double) first, (double) second));
            default -> System.out.print("Unknown operator!");
        }

    }
}
