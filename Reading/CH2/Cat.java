public class Cat {
  public String name;
  public static String noise;

  public Cat(String name, String noise) {
    this.name = name;
    this.noise = noise;
  }

  public void play() {
    System.out.println(noise + " I'm " + name + " the cat!");
  }

  public void nickname(String newName) {
    name = newName;
  }

  public static void anger() {
    noise = noise.toUpperCase();
  }

  public static void calm() {
    noise = noise.toLowerCase();
  }

  public static void main(String[] args) {
    Cat a = new Cat("Cream", "Meow!");
    Cat b = new Cat("Tubbs", "Nyan!");
    a.play();
    // Nyan! I'm Cream the cat!
    b.play();
    // Nyan! I'm Tubbs the cat!
    Cat.anger();
    a.calm();
    a.play();
    // nyan! I'm Cream the cat!
    b.play();
    // nyan! I'm Tubbs the cat!
    a.nickname("Kitty");
    a.play();
    // nyan! I'm Kitty the cat!
    b.play();
    // nyan! I'm Tubbs the cat!
  }
}
