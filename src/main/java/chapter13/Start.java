package chapter13;

class Bird {
    public void fly() {
        System.out.println("하늘을 날다.");
    };
}

class Penguin extends Bird{
    public Penguin() {
        System.out.println("펭귄 ");
    }
}
public class Start {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly();
    }
}
