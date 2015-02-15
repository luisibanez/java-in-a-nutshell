/**
 * This class implements the abstraction of a Dog, man's best friend.
 */
package io.github.luisibanez.java.training.exercises.classes;

public class Dog {

  double weight;   // measured in poinds
  int age;         // measured in integer years
  double speed;    // measured in meters per second

  public enum Color {
    BLACK, WHITE, YELLOW, BROWN
  }

  public enum Hair {
    SHORT, LONG, VERYLONG
  }

  private Color color;
  private Hair hair;

  public void walk() {
    this.speed = 1.4;   // set walking speed
  }

  public void bark() {
    System.out.print("Whoof!");
  }

  public void whineForFood() {
    System.out.print("Feed me, or I will eat your sandwich!");
  }

  public void eat() {
    this.speed = 0.0;
    System.out.print("Munch, munch!");
  }

  public void sleep() {
    this.speed = 0.0;
    System.out.print("Zzzzzz");
  }
      
  public void aDogsDay() {
    this.sleep();
    this.whineForFood();
    this.eat();
    this.walk();
    this.bark();
    this.sleep();
  }

  public double speed() {
    return this.speed;
  }

}
