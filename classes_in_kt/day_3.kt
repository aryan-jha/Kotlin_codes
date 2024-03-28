fun main(){
    var coffeeForMe = CoffeeDetails(45,"Aryan")
    makeCoffee(coffeeForMe)
    // makeCoffee(2, "Aryan")
    // makeCoffee(1, "Mickey")
    // makeCoffee(40, "Kittu")

    // println("Enter the two numbers to add ")
    // val a = readln().toInt()
    // val b = readln().toInt()
    // val ans = add(a,b)
    // println(ans)
}
fun makeCoffee(CoffeeDetails:CoffeeDetails){
    if(CoffeeDetails.sugarCount == 1)
        println("Coffee with ${CoffeeDetails.sugarCount} spoon of sugar for ${CoffeeDetails.name}")
    else
        println("Coffee with ${CoffeeDetails.sugarCount} spoons of sugar for ${CoffeeDetails.name}")
}

// fun add(num1: Int, num2: Int):Int{
//     return num1+num2
// }

data class CoffeeDetails(
    var sugarCount:Int,
    var name : String
)

