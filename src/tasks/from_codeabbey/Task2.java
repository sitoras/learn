package tasks.from_codeabbey;
import java.util.Scanner;

public class Task2 {

    public static void calculate_2() {
        Scanner scanner = new Scanner (System.in);
        int count;
        int sum = 0;
        System.out.println("Введите длину массива");
        count=scanner.nextInt();

            for (int i=0; i< count;i++){
             System.out.println("Введите числа "+(i+1));
            int number=scanner.nextInt();
            sum = sum + number;
          }

        System.out.println("Total:" +sum);
    }

}
