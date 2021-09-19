import kotlin.random.Random

fun main(){
    val RandomNumber= Random.nextInt(10)
    print("Enter First number: ")
    val num1 = readLine()
    print("Enter Second number: ")
    val num2 = readLine()
    try {
        var answer = num1!!.toInt()*RandomNumber+num2!!.toInt()
        println(num1+" * X + "+num2+" = "+answer)
        print("What is X? >>")
        val guess = readLine()
        if(guess!!.toInt()==RandomNumber)
            println("You got it")
        else println("No, X= >> "+RandomNumber)
    }
    catch (e: Exception){
        println("Only numbers!!")}


}

