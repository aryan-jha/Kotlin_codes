class human(val name:String, var age:Int, var height:Float){

    fun canVote():Boolean{
        return age>=18
    }

}
class person(nameparam:String, ageparam:Int){

    var age:Int = ageparam
    set(value){
        if(age>1){
            field = value
        }
    }
    


}
fun main() {
    val me = human("Aryan", 20, 5.9f)

    println(me.canVote())

    var per1 = person("Aryan", 20)
    per1.age = 80
    println(per1.age)
}