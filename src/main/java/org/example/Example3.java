package org.example;
class Animal {
  void eat() {System.out.println("eating...");}
}
class Dog extends Animal {
  void eat() {System.out.println("Eating dogfood....");}
  void bark() {System.out.println("barking...");}
  void work() {
    super.eat();
    bark();
  }
}

public class Example3 {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.work();
  }
}
