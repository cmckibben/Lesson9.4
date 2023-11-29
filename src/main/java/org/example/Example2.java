package org.example;

class Animal {
  String color ="white"; //What access field?
}

class Dog extends Animal{
  String color = "black";
  void printColor() {
    System.out.println(color);
    System.out.println(super.color);
  }
}

public class Example2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
