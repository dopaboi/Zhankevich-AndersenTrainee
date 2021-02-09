import java.util.Scanner;

public class TaskNumberThree {
    public float Scanner() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            return num;
        } else
            System.out.println("Введите пожалуйста число");
        return Scanner();
    }

    public void TaskNumberThree() {
        System.out.println("Укажите длинну массива от 1 до 20 включительно");
        float[] myArray = new float[(int) Scanner()];
        System.out.println("Заполните массив числами");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Scanner();
        }
        System.out.println("Ваш массив:");
        for (float arr : myArray) {
            System.out.print(" " + arr + " ");
        }
        System.out.println("\n Элементы вашего масива кратные 3: ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0) {
                System.out.print(" " + myArray[i] + " ");
            }
        }
    }
}
