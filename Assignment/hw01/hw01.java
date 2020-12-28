package Assignment.hw01;

public class hw01 {

  public static void windowPosSum(int[] arr, int n) {
    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i] < 0) {
        continue;
      }

      int val = arr[i];
      for (int j = i+1; j <= i + n; j++) {
        if (j >= arr.length) {
          break;
        }
        val += arr[j];
      }
      arr[i] = val;
    }
    return;
  }

  public static int max(int[] num) {
    int max = 0;
    for (int i = 0; i < num.length; i++) {
      if (num[i] > max) {
        max = num[i];
      }
    }
    return max;
  }

  public static void drawTriangle(int N) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    return;
  }
  public static void main(String[] args) {
    // exercise 1a
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // exercise 1b
    drawTriangle(10);

    // exercise 2 & 3
    int[] num = new int[]{1, 2, 3, 5, 10, 7, 0, 2};
    int max_num = max(num);
    System.out.println(max_num);

    // exercise 4
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
    return;
  }
}