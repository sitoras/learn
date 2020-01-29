package tasks;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        int a;
        int b;
        String operator;

        System.out.println("Please enter numbers from 1 to 10. You can also use Roman numerals");

        Scanner scanner = new Scanner(System.in);
        String question;
        question = scanner.nextLine();
        question = question.replace(" ", "");
        calcLine(question);

//        a = scanner.nextInt();
//        operator = scanner.next();
////      b = scanner.nextInt();
//        calc(a, b, operator);
    }

    private static void calcLine(String question) {
        int a, b;
        boolean type = true, a1=true, b1=true;


        // Addition statement
        if (question.indexOf('+') != -1) { // Checking the statement:  Is there addition operator?
            try {
                a = Integer.parseInt(question.substring(0, question.indexOf('+')));
            } catch (NumberFormatException ex) {
                type = false;
                a1=false;
                a = romeToDigit(question.substring(0, question.indexOf('+')));
            }
            try {
                b = Integer.parseInt(question.substring(question.indexOf('+') + 1, question.length()));
            } catch (NumberFormatException ex) {
                type = false;
                b1=false;
                b = romeToDigit(question.substring(question.indexOf('+') + 1, question.length()));
            }

            if (1 <= a && a <= 10 && 1 <= b && b <= 10) {
                if (a1 == b1){
                    if (type) {
                        System.out.println("Total: " + (a + b));
                    } else {
                        System.out.println("Total: " + DecToRoman.printRoman((a+b)));
                    }
                } else{
                    System.out.println("Numerals should be only arabic or Roman");
                }


            } else {
                System.out.println("Numeral is more than required. Please enter numbers between 1 and 10");
            }
        }

        //Substraction statement
        if (question.indexOf('-') != -1) { // Checking the statement:  Is there substraction operator?
            try {
                a = Integer.parseInt(question.substring(0, question.indexOf('-')));
            } catch (NumberFormatException ex) {
                type = false;
                a1=false;
                a = romeToDigit(question.substring(0, question.indexOf('-')));
            }
            try {
                b = Integer.parseInt(question.substring(question.indexOf('-') + 1, question.length()));
            } catch (NumberFormatException ex) {
                type = false;
                b1 = false;
                b = romeToDigit(question.substring(question.indexOf('-') + 1, question.length()));
            }

            if (1 <= a && a <= 10 && 1 <= b && b <= 10) {
                if (a1 == b1) {
                    if (type) {
                        System.out.println("Total: " + (a - b));
                    } else {
                        System.out.println("Total: " + DecToRoman.printRoman((a-b)));
                    }
                } else{
                    System.out.println("Numerals should be only arabic or Roman");
                }

            } else {
                System.out.println("Numeral is more than required. Please enter numbers between 1 and 10");
            }

        }

        //Multiplication statement
        if (question.indexOf('*') != -1) { // Checking the statement:  Is there multiplication operator?
            try {
                a = Integer.parseInt(question.substring(0, question.indexOf('*')));
            } catch (NumberFormatException ex) {
                type = false;
                a1 = false;
                a = romeToDigit(question.substring(0, question.indexOf('*')));
            }
            try {
                b = Integer.parseInt(question.substring(question.indexOf('*') + 1, question.length()));
            } catch (NumberFormatException ex) {
                type = false;
                b1 = false;
                b = romeToDigit(question.substring(question.indexOf('*') + 1, question.length()));
            }

            if (1 <= a && a <= 10 && 1 <= b && b <= 10) {
                if (a1 == b1){
                    if (type) {
                        System.out.println("Total: " + (a * b));
                    } else {
                        System.out.println("Total: " + DecToRoman.printRoman((a*b)));
                    }
                } else {
                    System.out.println("Numerals should be only arabic or Roman");
                }

            } else {
                System.out.println("Numeral is more than required. Please enter numbers between 1 and 10");
            }

        }

        //Division statement
        if (question.indexOf('/') != -1) { // Checking the statement:  Is there division operator?
            try {
                a = Integer.parseInt(question.substring(0, question.indexOf('/')));
            } catch (NumberFormatException ex) {
                type = false;
                a1 = false;
                a = romeToDigit(question.substring(0, question.indexOf('/')));
            }
            try {
                b = Integer.parseInt(question.substring(question.indexOf('/') + 1, question.length()));
            } catch (NumberFormatException ex) {
                type = false;
                b1 = false;
                b = romeToDigit(question.substring(question.indexOf('/') + 1, question.length()));
            }

            if (1 <= a && a <= 10 && 1 <= b && b <= 10) {
                if (a1 == b1){
                    if (type) {
                        System.out.println("Total: " + (a / b));
                    } else {
                        System.out.println("Total: " + DecToRoman.printRoman((a/b)));
                    }
                } else {
                    System.out.println("Numerals should be only arabic or Roman");
                }

            } else {
                System.out.println("Numeral is more than required. Please enter numbers between 1 and 10");
            }

        }

    }

//    private static final String[] numerals = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
//    private static final int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    private static int romeToDigit(String s){
        String[] rome_num = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i < rome_num.length; i++) {
            if (rome_num[i].equals(s)){
                return i+1;
            }
        }
        return -1;
    }

    /* private static void calc(int a, int b, String operator) {
        if (operator.equals("+")) {
            System.out.println("Total: " + (a + b));
        }

        if (operator.equals("-")) {
            System.out.println("Total: " + (a - b));
        }

        if (operator.equals("/")) {
            System.out.println("Total: " + (a / b));
        }

        if (operator.equals("*")) {
            System.out.println("Total: " + (a * b));
        }
    }*/

}