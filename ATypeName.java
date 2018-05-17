// Everything Is an Object.Exercise 3: (1)

public class ATypeName {
  
  String name;
  
  public void consoleLog() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    ATypeName a = new ATypeName();
    a.name = "A Type Name";
    a.consoleLog();
  }
}