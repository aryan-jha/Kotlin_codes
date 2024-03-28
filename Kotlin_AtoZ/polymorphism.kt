fun main(){

    var obj1 : Shape = traingle(3,4)
    var obj2 : Shape = square(10)

    println(obj1.area())
    println(obj2.area())


}
open class Shape(){
    open fun area() : Double{
        return 0.0
    }
}

class traingle(val base:Int, val height: Int) : Shape(){
    override fun area() : Double{
        // println(super.area())
        return 0.5 * base * height
    }
}
class square(val side: Int): Shape(){
    override fun area() : Double{
        // println(super.area())
        return side.toDouble()*side.toDouble()
    }
}