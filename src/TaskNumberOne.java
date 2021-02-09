import java.util.Scanner;

public class TaskNumberOne {
    public float Scanner() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            return num;
        }
        return Scanner();
    }

    public void TaskNumberOne() {
        System.out.println("Введите число:");
        if (Scanner() > 7) {
            System.out.println("Привет");

        } else System.out.println("Ваше число меньше либо равно 7");
    }
}
