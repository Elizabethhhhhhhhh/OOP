public class Activity {
    public static void
     main(String[] args) {
      Dog myDog = new Dog("Chocolate", true);
      myDog.setNumberOfPuppies(3); 
 
      Dog puppy1 = new Dog("Whitey", true);
      Dog puppy2 = new Dog("Brownie", false);
      Dog puppy3 = new Dog("Milky", true);
 
      myDog.addPuppy(puppy1);
      myDog.addPuppy(puppy2);
      myDog.addPuppy(puppy3);
 
      System.out.println("My dog's name is " + myDog.showName());
      myDog.bark(); 
      System.out.println("My dog has " + myDog.showNumberOfPuppies() + " puppies.");
      myDog.showPuppies();
    }
  }
