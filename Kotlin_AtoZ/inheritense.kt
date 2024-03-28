open class Phone(){
    var name:String = ""
    var model : String = ""
    var yor : Int = 0

    init{
        println("Parent constructor called!")
    }
    fun makeCall(){}
    fun endCall(){}
    fun powerOff(){}
    fun dial(){}
    open fun display(){
        println("Phone's display")
    }
}
class basicPhone : Phone(){
    init{
        println("Child constructor called!")
    }
    fun callInBasicPhone(){}
    override fun display(){
        super.display() // will first print the non changed method i.e parent's method before overriding
        println("basic phone's display")
    }
}


fun main(){
    var obj = basicPhone()
    obj.display()
    
    
}