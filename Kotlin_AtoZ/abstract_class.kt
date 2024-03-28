fun main(){

    var obj1 : Shape = square(10)
    println(obj1.area())
    obj1.display()

    // type checking and smart checking
    if(obj1 is square){
        println("In smart checking block")
    }else{
        println("In type checking regular block")
    }

}

interface dragable{
    fun drag()
}


abstract class Shape: dragable{

    val name:String = ""
    abstract fun area() : Int
    abstract fun display()

}

class square(val side: Int) : Shape(){
    override fun area() : Int{
        return side*side
    }
    override fun drag() = println("hello")
    override fun display(){
        println("This is a Square")
    }
}