package main.java.com.alexey.javacore.chapter05;

// Применение оператора break для выхода из цикла while
public class BreakLoop2 {
    public static void main(String args[]) {
        int i = 0;
        while (i<100) {
            if (i == 10) break; // выход из лцикла, если значение
                                // переменной i равно 10
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл заврешен.");
    }
}
