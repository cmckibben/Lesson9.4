package org.example;
class Pokemon {
  protected int attackPower = 60;
  public int getAttackPower() {return attackPower;}
}

class Pikachu extends Pokemon {
  Pikachu() {
    super.attackPower *= 2;
  }
}

public class Example1 {
  public static void main(String[] args) {
    Pikachu pika = new Pikachu();
    System.out.println(pika.attackPower);
  }
}
