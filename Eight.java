// Everything Is an Object.Exercise 8: (3)

public class Eight {
  static int i = 8;
  
  public static void main(String[] args) {
    Eight eight1 = new Eight();
    Eight eight2 = new Eight();
    Eight eight3 = new Eight();
    
    System.out.println("---------------------");
    System.out.println(eight1.i + " == " + eight2.i + " == " + eight3.i);
    
    Eight.i++;
    
    System.out.println("---------------------");
    System.out.println(eight1.i + " == " + eight2.i + " == " + eight3.i);
  }
}