import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Я калькулятор считающий целые числа от 1 до 10, введите пожалуйста задачу, которую я должен решить");
        String a = scan.next();
        if (a.equals("I")) {
            number1 = 1;
        } else if (a.equals("II")) {
            number1 = 2;
        } else if (a.equals("III")) {
            number1 = 3;
        } else if (a.equals("IV")) {
            number1 = 4;
        } else if (a.equals("V")) {
            number1 = 5;
        } else if (a.equals("VI")) {
            number1 = 6;
        } else if (a.equals("VII")) {
            number1 = 7;
        } else if (a.equals("VIII")) {
            number1 = 8;
        } else if (a.equals("IX")) {
            number1 = 9;
        } else if (a.equals("X")) {
            number1 = 10;
        } else {
            number1 = Integer.parseInt(a.trim());
        }
        a = scan.next();
        String c = a;
        a = scan.next();
        if (a.equals("I")) {
            number2 = 1;
        } else if (a.equals("II")) {
            number2 = 2;
        } else if (a.equals("III")) {
            number2 = 3;
        } else if (a.equals("IV")) {
            number2 = 4;
        } else if (a.equals("V")) {
            number2 = 5;
        } else if (a.equals("VI")) {
            number2 = 6;
        } else if (a.equals("VII")) {
            number2 = 7;
        } else if (a.equals("VIII")) {
            number2 = 8;
        } else if (a.equals("IX")) {
            number2 = 9;
        } else if (a.equals("X")) {
            number2 = 10;
        } else {
            number2 = Integer.parseInt(a.trim());
        }
        if (number1 > 10) {
            System.out.println("Вы вели слишком больше число!");
        } else if (number1 < 1) {
            System.out.println("Вы вели слишком маленькое число!");
        } else if (number2 > 10) {
            System.out.println("Вы вели слишком больше число!");
        } else if (number2 < 1) {
            System.out.println("Вы вели слишком маленькое число!");
        } else if (c.equals("+")) {
            System.out.println(number1 + number2);
        } else if (c.equals("-")) {
            System.out.println(number1 - number2);
        } else if (c.equals("*")) {
            System.out.println(number1 * number2);
        } else if (c.equals("/")) {
            int f = number1 % number2;
            if (f == 0) {
                System.out.println(number1 / number2);
            } else {
                System.out.println("При делении получилось не целое число!");
            }
        } else {
            System.out.println("Вы вели не верные данные!");
        }
    }
}
