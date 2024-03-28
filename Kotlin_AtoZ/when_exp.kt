fun main(args: Array<String>) {
    val number = 2
    val result = 4
    
    when(number){
        11 -> print("Eleven")
        12 -> print("Twelve")
        13 -> print("Thirteen")
        in 1..5 -> print("Yes in range block it's there!")
        else -> print("Not there")
    }
    print(result)
}