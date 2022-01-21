package geometry.dimension2

class Triangle(val base:Double, val height:Double) {
  def area(): Double = 0.5 * base * height

  def circumference(): Double = base + height
}
