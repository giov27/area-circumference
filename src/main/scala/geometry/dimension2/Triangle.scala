package geometry.dimension2

class Triangle(base:Double, height:Double) {
  def area(): Double = 0.5 * base * height

  def circumference(): Double = base + height
}
