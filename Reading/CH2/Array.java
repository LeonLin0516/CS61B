public class Array {
  public static void main(String[] args) {
    int[] z = null;
    int[] x, y;

    System.out.println(z);
    x = new int[]{1, 2, 3, 4, 5};
    y = x;
    y[2] = 3;
    x = new int[]{-1, 2, 5, 4, 99};
    y = new int[3];
    z = new int[0];
    int xL = x.length;
    System.out.println(xL);

    String[] s = new String[6];
    s[4] = "ketchup";
    s[x[3] - x[1]] = "muffins";

    int[] b = {9, 10, 11};
    // x[3:5] = b[0:2]
    System.arraycopy(b, 0, x, 3, 2);
  }
}