//Напишите программу, которая запрашивает год и определяет,
//является ли он високосным, используя boolean для условия.
// 25 минут
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {
            if ((year % 100 !=  0) || (year % 400 == 0)) {
                leap = true;
            } 
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}
