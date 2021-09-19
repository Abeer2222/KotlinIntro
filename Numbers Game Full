import kotlin.random.Random

fun main(){
    val number = Random.nextInt(0,10)
for (count in 1..3) {
    print("guess a number between 0 and 10 ")
    val guess = readLine()
    if(guess == "quit"){
        println("Quit..")
        break    }
    try {
    when {
        guess!!.toInt() == number -> {
            println("You got it!! " + number)
            break
        }
        guess!!.toInt() != number -> println("Wrong guess!,the answer was " + number)
        }
        // else -> println("A")
    }
    catch (e: Exception){
        println("Somthing wrong")}
}
    println("Game Over")
}

