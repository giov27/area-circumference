package geometry.dimension3

import geometry.dimension2.Triangle

class Prism(var prismHeight: Double,override val base:Double, override val height:Double) extends Triangle(base, height ) {
   def volume():Double = {
     area() * prismHeight
   }

  def surfaceArea():Double = {
    area() + base*prismHeight
  }

}
