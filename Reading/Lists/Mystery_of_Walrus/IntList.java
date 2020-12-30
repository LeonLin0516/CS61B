public class IntList {

  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }

  public int size() {
    if (rest == null) {
      return 1;
    } else {
      return 1 + this.rest.size();
    }
  }

  public int iterativeSize() {
    IntList p = this;
    int count = 0;
    while (p != null) {
      count += 1;
      p = p.rest;
    }
    return count;
  }

  public int get(int index) {
    if (index == 0) {
      return first;
    } else {
      return rest.get(index - 1);
    }
  }

  public static IntList incrList(IntList L, int x) {
    IntList newList = new IntList(0, null);
    IntList dummyHead = L;
    IntList newDummyHead = newList;
    while (dummyHead != null) {
      newDummyHead.first = dummyHead.first + x;
      newDummyHead.rest = new IntList(0, null);
      dummyHead = dummyHead.rest;
      newDummyHead = newDummyHead.rest;
    }
    return newList;
  }

  public static IntList dincrList(IntList L, int x) {
    IntList dummyHead = L;
    while (dummyHead != null) {
      dummyHead.first = dummyHead.first + x;
      dummyHead = dummyHead.rest;
    }
    return L; 
  }
}