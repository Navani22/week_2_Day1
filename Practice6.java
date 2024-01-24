package week_2_Day1;

public class Practice6 {
    public static void main(String[] args) {
  
      float[] marks = { 56.5f, 68.3f, 89.2f, 90.0f, 78.6f, 20000.9f };
      float max = 0;
      for (float element : marks) {
        if (element > max) {
          max = element;
        }
      }
      System.out.println("Greatest number in the array is : " + max);
  
    }
  
  }