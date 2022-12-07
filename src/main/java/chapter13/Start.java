package chapter13;

class Bird {
    public void fly() {
        System.out.println("하늘을 날다.");
    };
}

class Penguin2 {
    public Penguin2() {
        System.out.println("펭귄 ");
    }
}

public class Start {
    public static void main(String[] args) {
//        Bird penguin = new Penguin2();
//        penguin.fly();
        UnFlying penguin = new Penguin();
        penguin.egg();
//        UnFlyingBird pepe = new Peng();
//        pepe.egg();
    }
}
