# AP_LAB4
design pattern: general sol for common prob.

DP triplet : Recurring problem , standard solution, circumstance

characterstics: purpose, class diagram, code.
-------------------------------------------------------------------------------------

singleton pattern: restrict instantiation of class , ensures that only 1 instance exists 
make : static data member and function.

-make constructor private (restricted instantiation)

lazy sol: 
public class Singleton{
 private static Singleton uniqueInstance;
 private Singleton(){
	//take counter for testing.
 };
 public static Singleton getInstance(){
  if(uniqueInstance==null){
   uniqueInstance=new Singleton();
   return uniqueInstance;
  }
 }
}

eager solution:
public class Singleton{
 private static Singleton uniqueInstance = new Singleton();
 private Singleton();
 public static Singleton getInstance(){
   return uniqueInstance;
 }
}
