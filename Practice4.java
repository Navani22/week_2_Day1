package week_2_Day1;

public class Practice4 {
    public static void main(String[] args) {
  
      int[][] m1 = { { 1, 2, 3 },
          { 4, 5, 6 } };
      int[][] m2 = { { 2, 3, 4 },
          { 5, 6, 7 } };
      int[][] sum = { { 0, 0, 0 },
          { 0, 0, 0 } };
  
      for (int i = 0; i < m1.length; i++) {
        for (int j = 0; j < m1[i].length; j++) {
          sum[i][j] = m1[i][j] + m2[i][j];
          System.out.print(sum[i][j]+" ");
  
        }
        System.out.println(" ");
  
      }
  
  
    }
  
  }