public class Sort {
  /** Sorts strings destructively. */
  public static void sort(String[] s) {
    sort(s, 0);
  }

  private  static void sort(String[] s, int start) {
    if (start == s.length) {
      return;
    }
    int smallestValueIndex = findSmallest(s, start);
    swap(s, start, smallestValueIndex);
    sort(s, start+1);
  }

  /* @source Got help with string compares from https://goo.gl/a7yBU5. */
  public static int findSmallest(String[] s, int start) {
    int smallestValueIndex = start;
    for (int i = start; i < s.length; i ++) {
      int cmp = s[i].compareTo(s[smallestValueIndex]);
      if (cmp < 0) {
        smallestValueIndex = i;
      }
    }
    return smallestValueIndex;
  }

  public static void swap(String[] s, int a, int b) {
    String temp = s[a];
    s[a] = s[b];
    s[b] = temp;
  }
}
