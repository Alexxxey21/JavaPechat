package main.java.com.alexey.javacore.chapter02;

/*
    Продемонстрировать приминение блока кода.

    Присвоить исходному файлу имя "BlockTest"
 */
public class BlockTest {
    public static void main(String args[]) {
        int x, y;

        y = 20;

        // адресатом этого оператора цикла служит блок кода
        for (x = 0; x<10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
        y = y - 2;
        }
    }
}
