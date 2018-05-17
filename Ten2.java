// Everything Is an Object.Exercise 10: (2)

import java.util.Scanner;

public class Ten2 {

  public static void main(String[] args) {
    
    String[] st = new String[3];
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите последовательно 3 слова:");

    for (int i = 0; i < st.length; i++) {
         st[i] = scan.next();
    }

    for (int i = 0; i < st.length; i++) {
      System.out.print(st[i] + " ");
    }
  }
}