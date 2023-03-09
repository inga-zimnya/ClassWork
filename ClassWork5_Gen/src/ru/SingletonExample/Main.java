package ru.SingletonExample;
import static ru.SingletonExample.SingletonExample.getInstance;

public class Main {
    public static void main(String[] args) {
        SingletonExample a = getInstance();
        System.out.println(a.number);

        SingletonExample b = getInstance();
        System.out.println(b.number);

        //возвращается только 1 Instance
        


    }
}
