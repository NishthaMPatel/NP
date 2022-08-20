fun main(){
    var x=500
    var y=100
    var t:Int
    println("Swapping using a third variable")
    println("Before Swapping:")
    println("The value of a is:$x and Value of B is:$y")
    t=x
    x=y
    y=t
    println("After swapping")
    println("The value of a is:$x and Value of B is:$y")

    println("************************")

    println("Swapping without using third variable")
    println("Before Swapping:")
    println("The value of a is:$x and Value of B is:$y")
    x=x-y
    y=x+y
    x=y-x
    println("After swapping")
    println("The value of a is:$x and Value of B is:$y")
}
