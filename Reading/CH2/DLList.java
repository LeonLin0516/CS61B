// <> generic types
public class DLList<type> {

  private class IntNode {
    public type item;
    public IntNode next;
  
    public IntNode(type i, IntNode n) {
      item = i;
      next = n;
    }
  }

  private IntNode sentinal;
  private int size;
  
  public DLList(type x) {
    sentinal.next = new IntNode(x, null);
    size = 1;
  }

  public void addFirst(type x) {
    sentinal.next = new IntNode(x, sentinal.next);
    size += 1;
  }

  public void addLast(type x) {
    IntNode p = sentinal;
    while (p.next != null) {
      p = p.next;
    }
    p.next = new IntNode(x, null);
    size += 1;
  }

  public type getFirst() {
    return sentinal.next.item;
  }

  public type getLast() {
    IntNode p = sentinal;
    while (p.next != null) {
      p = p.next;
    }
    return p.item;
  }

  // private static int size(IntNode p) {
  //   if (p.next == null) {
  //     return 1;
  //   } else {
  //     return 1 + size(p.next);
  //   }
  // }

  public int size() {
    return size;
  }

  public static void main(String[] args) {
    DLList<String> L = new DLList<>("world");
    L.addFirst(",");
    L.addFirst("hello");

    // add last is slow O(n)
    L.addLast("!");
    // 1. Doubly Linked List
    // 2. Circular Linked List

    String x = L.getFirst();
    System.out.println(x);
    System.out.println(L.size());
  }
}