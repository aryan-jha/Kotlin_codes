fun main(){

    Myclass.f()
    Myclass.hello.f()

}
class Myclass{
    companion object hi{
        fun f(){
            println("Hello world")
        }
    }
    object hello{
        fun f(){
            println("In non companion object")
        }
    }
}