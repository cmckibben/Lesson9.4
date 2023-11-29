package org.example;
class Animal {
  Animal() {System.out.println("animal is created");}
}
class Dog extends Animal {
  Dog() {
    super();
    System.out.println("dog is created");
  }
}

public class Example4 {
  public static void main(String[] args) {
    Dog d = new Dog();
  }
}
