package geometry.dimension3

import geometry.dimension2.Circle

class Tube(radius:Double, height:Double) extends Circle(radius){
  def volume():Double ={
    area()*height
  }
  def surfaceArea():Double={
    2*area() + height*(2*pi*radius)
  }
}
