// Everything Is an Object.Exercise 9: (2)

public class Nine {
  
  public static void main(String[] args) {
    
    Character ch = 'x';
    char c = ch;
    
    Integer in = 9;
    int i = in;
    
    Float fl = 9.999f;
    float f = fl;
    
    Double db = 3.14;
    double d = db;
    
  
    System.out.println(ch + " = " + c);
    System.out.println(in + " = " + i);
    System.out.println(fl + " = " + f);
    System.out.println(db + " = " + d);
  }
}