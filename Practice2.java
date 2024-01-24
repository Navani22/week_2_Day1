package week_2_Day1;

public class Practice2 {
    public static void main(String[] args) {
  
      int[] a = { 22, 18, 2, 6, 17, 4, 26, 25, 27, 3 };
      int num = 9;
      boolean inArray = false;
      for (int element : a) {
        if (num == element) {
          inArray = true;
          break;
        }
      }
      if (inArray == true) {
        System.out.println("Number is present in the array");
      } else {
        System.out.println("Number is not present in the array");
      }
    }
  }