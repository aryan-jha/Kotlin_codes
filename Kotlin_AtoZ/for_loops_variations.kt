fun main(){

    // print from 0 to 10
    for(i in 0..10){
        print("$i ")
        // equal to for(int i = 0; i<=10;i++)
    }
    println("\n")
    //print(from 0 to 9)
    for(i in 0 until 10){
        print("$i ")
        // equal to for(int i = 0; i<10;i++)
    }
    println("\n")

    //print by incrementing by 2 from 0 till 16
    for(i in 0..16 step 2){
        print("$i ")
    }
    println("\n")
    
    //print by incrementing by 5 from 1 till 49
    
    for(i in 1 until 50 step 5){
        print("$i ")
    }
    println("\n")
    
    //print from 10 to 0 
    
    for(i in 10 downTo 0){
        print("$i ")
    }
    println("\n")

    

}