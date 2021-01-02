public class TestBody {

  public static void test1() {
    Body a = new Body(10.0, 12.0, -3.0, 7.0, 5.0, "dummy1");
    Body b = new Body(17.0, -8.0, 1.0, 3.0, 15.0, "dummy2");
    System.out.println("B exerted on A: " + a.calcForceExertedBy(b));
    System.out.println("A exerted on B: " + b.calcForceExertedBy(a));
  }
  public static void main(String[] args) {
    test1();
  }
}
