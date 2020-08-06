object Assignment_6_caseClass {

    case class Point(x:Int, y:Int){

        def +(p:Point)= Point(this.x + p.x, this.y + p.y)

        def move(dx:Int, dy:Int)= Point(this.x + dx, this.y + dy)

        def distance(p:Point)= scala.math.pow(scala.math.pow((this.x - p.x), 2) + scala.math.pow((this.y - p.y), 2), 0.5)

        def invert()= Point(this.y, this.x)
    }

    def main(args :Array[String]):Unit={
        val p1 = Point(2,3)
        val p2 = Point(4,5)
        println(p1)
        println(p2)
        
        val p3 = p1 + p2
        println(p3)        

        val p4 = p1.move(8, 9)
        println(p4)
        
        println(p1.distance(p2))

        val p5 = p1.invert()
        println(p5)
    }
}