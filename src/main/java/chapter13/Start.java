package chapter13;

import java.util.List;

public class Start {
  public static void main(String[] args) {
    Egg penguin = new Penguin();
    List<Egg> list = List.of(penguin);
  }
}
