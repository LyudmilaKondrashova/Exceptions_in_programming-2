import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static Scanner scannerFloat = new Scanner(System.in);
    public static Scanner scannerString = new Scanner(System.in);

    public static void main(String[] args) {
        // 1. Реализуйте метод, который запрашивает у пользователя
        // ввод дробного числа (типа float), и возвращает введенное значение.
        // Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.
        System.out.println("Вы ввели число " + prompt());
        System.out.println();

        // Если необходимо, исправьте данный код
        // Задание 2
//        try {
//            int d = 1; //!!!!!!!!!ИСПРАВЛЕНО
//            double catchedRes1 = (double) intArray[8] / d; //!!!!!!ИСПРАВЛЕНО - добавлено (double)
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e.getMessage()); //!!!!! e.getMessage()

        // Дан следующий код, исправьте его там, где требуется
        // Задание 3
        System.out.println("Задание 3:");
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        System.out.println();

        // 4. Разработайте программу, которая выбросит Exception,
        // когда пользователь вводит пустую строку. Пользователю должно показаться
        // сообщение, что пустые строки вводить нельзя.
        System.out.println("Задание 4:");
        try {
            prompt4();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        scannerFloat.close();
        scannerString.close();
    }

    // Задание 1
    public static float prompt() {
        float result = 0;
        boolean flag = false;
        while (!flag) {
            System.out.print("Введите дробное число (разделитель целой и дробной части - запятая): ");
            try {
                result = scannerFloat.nextFloat();
                flag = true;
            } catch (Exception e) {
                scannerFloat.nextLine();
                System.out.println("Введено некорректное значение! Попробуйте еще раз!");
            }
        }
        return result;
    }

    // Задание 3
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    // Задание 4
    public static void prompt4() throws Exception {
        System.out.print("Введите строку: ");
        String str = scannerString.nextLine();
        if (str.equals("")) {
            throw new RuntimeException("Нельзя вводить пустые строки!");
        }
    }
}