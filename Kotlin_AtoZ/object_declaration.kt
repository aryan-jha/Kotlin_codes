interface clickable{
    fun click()
    fun notClick()
}

object A{
    val age : Int = 20
    val name : String = "Aryan"
}

fun main(){
    // object declartion
    

    println(A.age)
    println(A.name)

    // object as an expression

    var testObj = object{
        val age :Int = 20
        fun hi() = println("Returning hello")
    }

    testObj.hi()
    println(testObj.age) 

    //other eg i.e of inheritance
    var testobj2 = object : clickable{
        override fun click(){
            val noOfClick :Int = 20
            println("This $noOfClick many time it has been clicked")
        }

        override fun notClick() = println("Dont click")

        val name :String = "Nokia"
        val year : Int = 2000
    }

    println(testobj2.name)
    println(testobj2.year)
    testobj2.click()
    testobj2.notClick()
}