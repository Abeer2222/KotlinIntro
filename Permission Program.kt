fun main(){
    print("Enter your age")
try {
    val age=readLine()!!.toInt()

    if(age > 25)
        println("Welcome!")
    else
        println("You are not old enough")
}
catch (e: Exception){
    println("enter only numbers!!")
}
}
