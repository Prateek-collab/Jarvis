import java.util.*

fun main(){


    val user=Jarvis("Jarvis")

    /*Print the details of the Robot along with a greeting*/
    println("Hey, there. My name is ${user.name} and I will be your personal assistant!!")
    println()

    user.ringAlarm("5.30 A.M",Calendar.getInstance().get(Calendar.DAY_OF_WEEK ))
    user.makeCoffee(Coffee(true, 1))
    user.heatWater(30.0)
    user.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    user.cook(mutableListOf("Sushi","Burger","Pasta","Tandoori"))
    user.ironClothes("Suit")
}