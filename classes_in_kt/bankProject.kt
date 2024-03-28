class BackAccount(var name: String, var balance: Float){

    private val transactionHistory = mutableListOf<String>()   


    fun depositMoney(money : Int){
        balance += money
        transactionHistory.add("Deposited $$money by $name")
    }

    fun withdrawMoney(money:Int){
        if(money <= balance){
            balance -= money
            transactionHistory.add("Withdrawn $$money by $name")
        }else{
            println("You don't have enough balance!!")
        }
    }

    fun viewTransactionHistory(){
        for(transaction in transactionHistory){
            println(transaction)
        }
    }


    fun acctBalance(): Float {
        return balance
    }


}

fun main (){

    var newAccount = BackAccount("Aryan", 500000f)

    newAccount.depositMoney(100000)
    newAccount.withdrawMoney(1000)
    newAccount.depositMoney(5000)
    newAccount.withdrawMoney(200000)
    newAccount.viewTransactionHistory()
    println(newAccount.balance)

}