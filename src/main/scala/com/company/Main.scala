package com.company

import geometry.dimension2.{Circle, Rectangle, Triangle}
import geometry.dimension3.{Prism, Tube}

import scala.io.StdIn.{readDouble, readLine}

object Main {
  def main(args: Array[String]): Unit = {

    print("Choose shape: ")
    val shape = readLine().toLowerCase()
    shape match{
      case "circle" =>
        println("---Circle---")
        println("Radius of the circle: ")
        val radius = readDouble()
        val circle = new Circle(radius)
        println("Area: " + circle.area())
        println("Circumference: " + circle.circumference())
      case "triangle" =>
        println("---Triangle---")
        println("Base of the triangle: ")
        val base = readDouble()
        println("Height of the triangle: ")
        val height = readDouble()
        val triangle = new Triangle(base, height)
        println("Area: " + triangle.area())
        println("Circumference: " + triangle.circumference())
      case "rectangle" =>
        println("---Rectangle---")
        println("Length of the rectangle: ")
        val length = readDouble()
        println("Width of the rectangle: ")
        val width = readDouble()
        val rectangle = new Rectangle(length, width)
        println("Area: " + rectangle.area())
        println("Circumference: " + rectangle.circumference())
      case "prism" =>
        println("--Prism--")
        println("Base of the prism:")
        val base = readDouble()
        println("Height base of the prism:")
        val heightBase = readDouble()
        println("Height of the prism:")
        val height = readDouble()
        val prism = new Prism(base, height, heightBase)
        println("Volume: " + prism.volume())
        println("Surface Area: " + prism.surfaceArea())
      case "tube" =>
        println("--Tube--")
        println("Radius of the tube:")
        val radius = readDouble()
        println("Height of the tube:")
        val height = readDouble()
        val tube = new Tube(radius, height)
        println("Volume: " + tube.volume())
        println("Surface Area: " + tube.surfaceArea())
    }
  }
}
