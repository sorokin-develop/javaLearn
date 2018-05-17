// Everything Is an Object.Exercise 4: (1)

public class DataOnly {
  static int i; 
  static double d;
  static boolean b;
  
  public static void main(String[] args) {
    
    DataOnly data = new DataOnly();
    
    data.i = 47;
    data.d = 1.1;
    data.b = false;

    System.out.println("-------------------------");
    System.out.println("i = " +i);
    System.out.println("d = " +d);
    System.out.println("b = " +b);
  }
}