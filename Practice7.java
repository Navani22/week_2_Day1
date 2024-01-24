package week_2_Day1;

public class Practice7 {
    public static void main(String[] args) {
  
      float[] marks = { 56.5f, 68.3f, 89.2f, 90.0f, 78.6f, 20000.9f };
      float min = Float.MAX_VALUE;
      for (float element : marks) {
        if (element < min) {
          min = element;
        }
      }
      System.out.println("Smallest number in the array is : " + min);
  
    }
  
  }