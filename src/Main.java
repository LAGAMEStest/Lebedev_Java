import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        program1();
        program2();
        program3();
    }

    static void program1() throws IOException {
        System.out.println("-----Программа 1-----");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1;
        int a;
        while(true) {
            try {
                System.out.print("Введите целое число a: ");
                s1 = reader.readLine();
                a = Integer.parseInt(s1);
                break;
            } catch (NumberFormatException e) {
                System.out.println ("Недопустимый формат данных. Попробуйте еще раз");
            }
        }
        String s2;
        int b;
        while(true) {
            try {
                System.out.print("Введите целое число b: ");
                s2 = reader.readLine();
                b = Integer.parseInt(s2);
                break;
            } catch (NumberFormatException e) {
                System.out.println ("Недопустимый формат данных. Попробуйте еще раз");
            }
        }
        comparison(a, b);
        addition(a, b);
        subtraction(a, b);
        division(a,b);
        multiplication(a, b);
        System.out.println("---------------------" + '\n');
    }

    static void comparison(int a, int b) {
        if (a > b)
            System.out.println("a > b");
        else if (a < b)
            System.out.println("a < b");
        else
            System.out.println("a = b");
    }

    static void addition(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    static void subtraction(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }

    static void division(int a, int b) {
        float f = a / (float) b;
        System.out.println("a / b = " + f);
    }

    static void multiplication(int a, int b) {
        System.out.println("a * b = " + (a * b));
    }

    static void program2 () throws IOException {
        System.out.println("-----Программа 2-----");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку a: ");
        String s1 = reader.readLine();
        System.out.print("Введите строку b: ");
        String s2 = reader.readLine();
        reader.close();
        comparison(s1, s2);
        System.out.println("---------------------" + '\n');
    }

    static void comparison(String s1, String s2) {
        if (s1.equals(s2))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }

    static void program3 () {
        System.out.println("-----Программа 3-----");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : array) {
            if (x % 2 == 0)
                System.out.print(x + " ");
        }
        System.out.println('\n' + "---------------------");
    }
}