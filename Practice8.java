package week_2_Day1;

public class Practice8 {
    public static void main(String[] args) {
  
      boolean isSorted = true;
      float[] arr = { 56.5f, 68.3f, 89.2f, 90.0f, 78.6f, 20000.9f };
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[i + 1]) {
  
          isSorted = false;
          break;
        }
      }
      System.out.println("Is the array sorted? " + isSorted);
    }
  
  }