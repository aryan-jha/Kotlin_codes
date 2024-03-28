fun main() {
    var computer_choice = " "
    var user_choice = " "
    println("Rock, Paper, Scissors? Enter your choice! ")
    user_choice = readln()

    val istrue : Boolean = true

    while(istrue){
        if(user_choice == "Rock" || user_choice == "Paper" || user_choice == "Scissors"){
            break
        }else{
            println("Entered Option is wrong, please try again")
            user_choice = readln();
        }
    }

    val randomNumber = (1..3).random()
    
    if(randomNumber == 1){
        computer_choice = "Rock"
    }else if(randomNumber == 2){
        computer_choice = "Paper"
    }else {
        computer_choice = "Scissors"
    }

    if( user_choice == "Rock" && computer_choice == "Scissors" ||
        user_choice == "Paper" && computer_choice == "Rock" ||
        user_choice == "Scissors" && computer_choice == "Paper"
       )
    {
        println("You Won!")
    }else if(user_choice == computer_choice){
        println("It's a DRAW")
    }else{
        println("You LOSE")
    }

    // var winner = when{
    //     user_choice == computer_choice -> "Tie"
    //     user_choice == "Rock" && computer_choice == "Scissors" -> "Player"
    //     user_choice == "Paper" && computer_choice == "Rock" -> "Player"
    //     user_choice == "Scissors" && computer_choice == "Paper" -> "Player"
    //     else -> "Computer"
    // }

    // println(winner)

}