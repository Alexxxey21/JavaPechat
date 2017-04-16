package main.java.com.alexey.javacore.chapter05;

// Продемонстрировать приминение оператора цикла do-while
public class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("такт " + n);

        }
        while (--n > 0);
    }
}
