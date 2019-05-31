package tasks.from_codeabbey;

import java.util.Scanner;

public class Task1 {
    public static void calculate() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a");
        int a = myObj.nextInt();

        System.out.println("Enter b");

        int b = myObj.nextInt();

        System.out.println(a + b);
    }
}