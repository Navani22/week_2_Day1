package week_2_Day1;

public class Practice3 {
    public static void main(String[] args) {
  
      float[] marks = { 56.5f, 68.3f, 89.2f, 90.0f, 78.6f };
      float sum = 0;
      for (float element : marks) {
        sum = sum + element;
      }
      System.out.println("Average is : " + sum / marks.length);
  
    }
  
  }