package main.java.com.alexey.javacore.chapter02;

/*
    Продемонстрировать применение условного оператора if

    Присвоить исходному файлу имя "IfSample"
 */
public class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x теперь равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        // этот оператор не будет ничего выводить
        if (x == y) System.out.println("вы не увидите этого");
    }
}
