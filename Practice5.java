package week_2_Day1;

public class Practice5 {
    public static void main(String[] args) {
  
      float[] marks = {56.5f, 68.3f, 89.2f, 90.0f, 78.6f};
      float[] reversedMarks = new float[marks.length];
  
      for (int i = 0; i < marks.length; i++) {
        reversedMarks[i] = marks[marks.length - 1 - i];
      }
  
      System.out.print("Reversed marks array: ");
      for (int i = 0; i < reversedMarks.length; i++) {
        System.out.print(reversedMarks[i]);
        if (i < reversedMarks.length - 1) {
          System.out.print(", ");
        }
      }
      System.out.println();
    }
  }
  