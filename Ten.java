// Everything Is an Object.Exercise 10: (2)

import java.util.Scanner;

public class Ten {

  public static void main(String[] args) {
    
    int[] nums = new int[3];
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите последовательно 3 числа:");

    for (int i = 0; i < nums.length; i++) {
         nums[i] = scan.nextInt();
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
  }
}