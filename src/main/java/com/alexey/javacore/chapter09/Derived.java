package main.java.com.alexey.javacore.chapter09;


class Derived extends Protection {
    Derived(){
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

        // доступно только для класса
        // System.out.println("n_pri =" 4 + n_pri);

        System.out.println("n_pri = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
