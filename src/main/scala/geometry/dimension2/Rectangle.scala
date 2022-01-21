package geometry.dimension2

/**
 *
 * @param length
 * @param width
 */
class Rectangle(length:Double, width:Double) {
  def area(): Double = length * width

  def circumference(): Double = 2*length + 2*width

}
