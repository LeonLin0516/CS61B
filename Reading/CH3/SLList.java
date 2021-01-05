public class SLList {

  private class IntNode {
    public int item;
    public IntNode next;
    public IntNode(int item, IntNode next) {
      this.item = item;
      this.next = next;
    }
  }

  private IntNode first;

  public void addFirst(int x) {
    first = new IntNode(x, first);
  }

  public void insert(int x, int position) {
    if (first == null || position == 0) {
      addFirst(x);
      return;
    }
    IntNode currentNode = first;
    while (position > 1 && currentNode.next != null) {
    position--;
    currentNode = currentNode.next;
    }
    IntNode newNode = new IntNode(x, currentNode.next);
    currentNode.next = newNode;
  }


  public void removeItem(int x) {
    first = removeItemHelper(x, first);
  }

  private IntNode removeItemHelper(int x, IntNode current) {
    if (current == null) {
      return current;
    } else if (current.item == x) {
      return removeItemHelper(x, current.next);
    } else {
      current.next = removeItemHelper(x, current.next);
      return current;
    }
  }

  public void reverse() {
    if (first == null || first.next == null) {
      return;
    }
    IntNode p = first.next;
    first.next = null;
    while (p != null) {
      IntNode temp = p.next;
      p.next = first;
      first = p;
      p = temp;
    }
  }

  public void printList() {
    IntNode p = first;
    while (p != null) {
      System.out.print(p.item);
      p = p.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    SLList p = new SLList();
    p.addFirst(3);
    p.addFirst(2);
    p.addFirst(1);
    p.printList();
    p.insert(4, 2);
    p.printList();
    p.removeItem(4);
    p.printList();
    p.reverse();
    p.printList();
  }
}