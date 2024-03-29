fun main(){

    // initializing null 
    var gender : String? = "abcd"

    //checking if null 
    println(gender?.uppercase()) // if null then will print null else execute the given code


    //using elvis op
    var gender2 : String = gender?: "Null found"

    println(gender2)

    //when known that if won't be null
    var value : String = gender!!.uppercase()

    // when wanted to execute multiple statements if not null then use "let"

    gender2?.let{
        println("1")
        println("2")
        println("3")

    }



}