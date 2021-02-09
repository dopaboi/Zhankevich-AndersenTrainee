public class Main {
    public static void main(String[] args) {
        System.out.println("1. Первый алгоритм: если введенное число больше 7, то вывести 'Привет' ");
        TaskNumberOne function = new TaskNumberOne();
        function.TaskNumberOne();
        System.out.println(" \n 2.Второй алгоритм: если введенное имя совпадает с Вячеслав, то вывести 'Привет,Вячеслав', \n если нет, то вывести 'Нет такого имени' ");
        TaskNumberTwo function1 = new TaskNumberTwo();
        function1.nameCheck();
        System.out.println(" \n3. Третий алгоритм:  на входе есть числовой массив, необходимо вывести " +
                "элементы массива кратные 3");
        TaskNumberThree function2 = new TaskNumberThree();
        function2.TaskNumberThree();
    }
}
