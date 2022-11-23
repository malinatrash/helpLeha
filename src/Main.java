import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        boolean loop = true;
        while (loop){
            Scanner scan = new Scanner(System.in);
            System.out.println("Задача 1");
            System.out.println("Задача 2");
            System.out.println("Задача 3");
            System.out.println("Задача 4");
            int task = scan.nextInt();
            mass m = new mass();
            switch (task) {
                case 1:
                    m.first();
                    break;
                case 2:
                    m.second();
                    break;
                case 3:
                    m.third();
                    break;
                case 4:
                    m.fourth();
                    break;
                default:
                    loop = false;
            }
        }
    }
}
