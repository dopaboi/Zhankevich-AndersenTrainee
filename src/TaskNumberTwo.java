import java.util.Scanner;

public class TaskNumberTwo {
    public String Scanner() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public void nameCheck() {
        String trueName = "Вячеслав";
        System.out.println("Введите имя");
        if (Scanner().equals(trueName)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
