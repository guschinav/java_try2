package ru.stqa.pft.sandbox;

public class Square {
  public double l;

  public Square (double l) { //конструктор не имеет возвращаемого значения, но может принимать параметр
    this.l = l; // первая l - атрибут функции... вторая l - переменная, которая объявлена как аргумент функции
  }

  public double area() {
    return this.l * this.l;
  }
}