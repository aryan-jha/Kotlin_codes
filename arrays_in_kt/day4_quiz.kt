fun main(){
    var fruitsList = mutableListOf("Apple","Mango","Orange","Kiwi","Grapes",)
    fruitsList.add("Watermelon")
    fruitsList.remove("Mango")

    if(fruitsList.contains("Orange")) println("Yes Orange is there in the list!")
    println(fruitsList)

    val numbers = mutableListOf(1, 2, 3, 4, 5)

    for(key in 0..numbers.size){
        print(key)
    }
} 