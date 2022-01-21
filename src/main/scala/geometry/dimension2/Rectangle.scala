package geometry.dimension2

class Rectangle(var length:Double, var width:Double) {
  def area(): Double = length * width

  def circumference(): Double = 2*length + 2*width

}
