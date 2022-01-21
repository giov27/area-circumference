package geometry.dimension3

import geometry.dimension2.Triangle

class Prism(prismHeight: Double, base:Double, height:Double) extends Triangle(base, height ) {
   def volume():Double = {
     area() * prismHeight
   }

  def surfaceArea():Double = {
    area() + base*prismHeight
  }

}
