public class ExtraIntListPractice {
  public static void main(String[] args) {
    IntList L = new IntList(15, null);
    L = new IntList(10, L);
    L = new IntList(5, L);
    System.out.println(L.get(2));

    IntList L1 = IntList.incrList(L, 2);
    System.out.println("incrList:");
    System.out.println(L1.get(0));
    System.out.println(L1.get(1));
    System.out.println(L1.get(2));

    IntList L2 = IntList.dincrList(L, 3);
    System.out.println("dincrList:");
    System.out.println(L2.get(0));
    System.out.println(L2.get(1));
    System.out.println(L2.get(2));
  }
}
