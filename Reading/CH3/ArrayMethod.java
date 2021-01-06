public class ArrayMethod {

  public static int[] insert(int[] arr, int item, int position) {
    int[] result = new int[arr.length + 1];
    for (int i = 0; i < position; i++) {
      result[i] = arr[i];
    }
    result[position] = item;
    for (int i = position; i < arr.length; i++) {
      result[i+1] = arr[i];
    }
    return result;
  }

  public static int[] replicate(int[] arr) {
    int length = 0;
    for (int a: arr) {
      length += a;
    }
    int[] result = new int[length];
    int i = 0;
    for (int num: arr) {
      for (int counter = 0; counter < num; counter++) {
        result[i] = num;
        i++;
      }
    }
    return result;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    int[] test = new int[]{1,2,3,4,5,6,7};
    insert(test, 3, 6);
    printArray(test);
    int[] check = replicate(test);
    printArray(check);
  }
}
