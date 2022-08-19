import java.util.*
fun main(args: Array<String>)
{
    val reader = Scanner(System.`in`)
    print("Enter a number :- ")
    val a = reader.nextInt()

    if ((a % 2) == 0)
        println("Number is even")
    else
        println("Number is odd")
}