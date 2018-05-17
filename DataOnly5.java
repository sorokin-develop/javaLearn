// Everything Is an Object.Exercise 5: (1)

public class DataOnly5 {
  static int i = 47; 
  static double d = 1.1;
  static boolean b = false;
  
  public static void main(String[] args) {
    
    DataOnly data = new DataOnly();

    System.out.println("-------------------------");
    System.out.println("i = " +i);
    System.out.println("d = " +d);
    System.out.println("b = " +b);
  }
}