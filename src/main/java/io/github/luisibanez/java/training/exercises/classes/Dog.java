/**
 * This class implements the abstraction of a Dog, man's best friend.
 */
package io.github.luisibanez.java.training.exercises.classes;

public class Dog {

  double weight;   // measured in poinds
  int age;         // measured in integer years
  double speed;    // measured in meters per second

  public enum HairColor {
    BLACK, WHITE, YELLOW, BROWN
  }

  public enum HairLength {
    SHORT, LONG, VERYLONG
  }

  private HairColor hairColor;
  private HairLength hairLength;

  public HairColor hairColor() {
    return this.hairColor;
  }

  public HairLength hairLength() {
    return this.hairLength;
  }

  public double weight() {
    return this.weight;
  }

  public int age() {
    return this.age;
  }

  public void setHairColor(HairColor color) {
    this.hairColor = color;
  }

  public void setHairLength(HairLength length) {
    this.hairLength = length;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void walk() {
    this.speed = 1.4;   // set walking speed
  }

  public void sit() {
    this.speed = 0.0;   //  stop moving
  }

  public void sleep() {
    this.speed = 0.0;
    System.out.println("Zzzzzz");
  }
  public void bark() {
    System.out.println("Whoof!");
  }

  public void whineForFood() {
    System.out.println("Feed me, or I will eat your sandwich!");
  }

  public void eat() {
    this.speed = 0.0;
    System.out.println("Munch, munch!");
  }

      
  public void aDogsDay() {
    this.sleep();
    this.whineForFood();
    this.eat();
    this.walk();
    this.bark();
    this.sit();
    this.sleep();
  }

  public double speed() {
    return this.speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

}
