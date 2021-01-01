public class AList<type> {
  private type[] array;
  private int length;

  public AList() {
    array = (type[]) new Object[100];
    length = 0;
  }

  public void addLast(type num) {
    if (length ==  array.length) {
      resize();
    }
    array[length] = num;
    length += 1;
  }

  public type removeLast() {
    type x = getLast();
    array[length-1] = null;
    length -= 1; 
    return x;
  }

  public type getLast() {
    return array[length-1];
  }

  public type get(int index) {
    return array[index];
  }

  public int size() {
    return length;
  }

  public void resize() {
    type[] newArray = (type[]) new Object[length * 2];
    System.arraycopy(array, 0, newArray, 0, length);
    newArray = array;
  }
}