package geometry.dimension2

class Circle(radius:Double, val pi:Double = 3.14) {
  def area():Double = pi*radius*radius

  def circumference():Double = 2 * pi * radius
}
