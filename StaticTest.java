// Everything Is an Object.Exercise 7: (1)

public class StaticTest {
  static int i = 47;

  public static void main(String[] args) {
    Incrementable.increment();
    System.out.println(i);
  }
}

class Incrementable {
  static void increment() {
    StaticTest.i++;
  }
}
