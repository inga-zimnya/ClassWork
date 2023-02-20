public class Airplane implements Flying, Falling{
    public void fall(){
        System.out.println("I am falling");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
