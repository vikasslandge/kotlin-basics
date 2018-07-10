import java.awt.geom.Path2D
import java.util.*

fun main(args: Array<String>)
{
    println("vikas")
    val a=listOf(1,2,3,"A","B")

    val msg= "hello !!!"
    println(a)
    println(msg)
    val b: Double = 33.0/5
    println(b)
    b.toDouble()
    println(b)
    var ran = Random().nextInt(50)

    println(ran)

    when(ran){
        in 1..10 -> println("value in 1 to 10")
        in 11..20 -> println("value in 11 to 20")
        in 21..30 -> println("value in 21 to 30")
        in 31..40 -> println("value in 31 to 40")
        in 41..50 -> println("value is greater than 40")
    }
    return
}
