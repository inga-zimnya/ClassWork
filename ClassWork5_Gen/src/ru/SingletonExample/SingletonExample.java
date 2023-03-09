package ru.SingletonExample;

public class SingletonExample {
    int number = 0;
    private static SingletonExample instance;
    private SingletonExample(){
        number++;
    }

    public static SingletonExample getInstance(){
        if(instance == null){
            instance = new SingletonExample();
        }
        return instance;
    }

}
