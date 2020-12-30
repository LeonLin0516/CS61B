public class DogLauncher {
  public static void main(String[] args) {
    Dog d = new Dog(20);
    d.makeNoise();

    Dog[] dogs = new Dog[]{new Dog(8), new Dog(20)};
    dogs[0].makeNoise();

    // static vs. non-static methods
    // static: actions taken by the class
    // non-static: actions taken by a instance of the class
    Dog biggerDog = Dog.maxDog(dogs[0], dogs[1]);
    System.out.println(biggerDog.weightInPounds);
  } 

}
