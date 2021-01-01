public class SLList {

  private static class IntNode {
    public int item;
    public IntNode next;
  
    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  private IntNode sentinal;
  private int size;

  public SLList() {
    sentinal = new IntNode(0, null);
    size = 0;
  }
  
  public SLList(int x) {
    sentinal = new IntNode(0, null);
    sentinal.next = new IntNode(x, null);
    size = 1;
  }

  public void addFirst(int x) {
    sentinal.next = new IntNode(x, sentinal.next);
    size += 1;
  }

  public void addLast(int x) {
    IntNode p = sentinal;
    while (p.next != null) {
      p = p.next;
    }
    p.next = new IntNode(x, null);
    size += 1;
  }

  public int getFirst() {
    return sentinal.next.item;
  }

  public int getLast() {
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
    SLList L = new SLList();
    L.addFirst(10);
    L.addFirst(5);
    L.addLast(17);
    int x = L.getFirst();
    System.out.println(x);
    System.out.println(L.size());
  }
}
