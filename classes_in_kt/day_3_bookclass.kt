class Book (var title:String, var author:String = "unknown",var yearPublished:Int = 2019){
    
    init{
        println("Hello, constructor is called!!")
    }

}
fun main(){
    var myBook = Book("Hello_World")
    println("Title is ${myBook.title}, Author is ${myBook.author}, Year is ${myBook.yearPublished}")
    var customBook = Book("Kotlin","Aryan")
    customBook.yearPublished = 2024
    println("Title is ${customBook.title}, Author is ${customBook.author}, Year is ${customBook.yearPublished}")
}