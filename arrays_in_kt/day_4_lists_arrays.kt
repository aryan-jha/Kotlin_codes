fun main(){

    //creating the immutable list
    var arr = listOf(3,4,5,6,7)

    // creating the mutable list
    var arr2 = mutableListOf(2,3,4,46,47,48,49)

    // indexing same starts with 0
    println(arr[0])
    println(arr2[0])

    //to add element is only possible in mutable list
    arr2.add(89)
    arr2.add(2,90) // adds at the given index

    println(arr2)

    // to remove 
    arr2.removeAt(2)
    println(arr2)

    // to change the value at a particular index we have 2 methods
    // 1:- old method
    arr2[6] = 2000

    //2:- using set
    arr2.set(5,3000) // at 5th position 3000 will be replaced

    println(arr2)

    // to check whether an element is there in list or not

    val check:Boolean = arr2.contains(2000) // returns a bool type

    if(check) println("Yes it's there!")
    else println("No it's not there!")



}