import java.util.*

/*Class Jarvis defines the tasks which will be performed by the Robot
* You can customize this class according to your preferences*/

class Jarvis(val name:String){

    fun ringAlarm(time: String, day: Int) {
        //time parameter holds the value passed during object creation.
        //day-the days of the week
        when (day) {
            //Below mentioned is the alarm table which Jarvis needs to follow.
            Calendar.MONDAY -> println("Your alarm for $time is ringing!!")
            Calendar.TUESDAY -> println("Your alarm for $time is ringing!!")
            Calendar.WEDNESDAY -> println("Your alarm for $time is ringing!!")
            Calendar.THURSDAY -> println("Your alarm for $time is ringing!!")
            Calendar.FRIDAY -> println("Your alarm for $time is ringing!!")
            Calendar.SATURDAY -> println("It's a holiday!")
            Calendar.SUNDAY -> println("It's a holiday!")
            else -> println("Invalid Entry!Try Again.")
        }
    }

    fun makeCoffee(coffee: Coffee) = if (coffee.black) {
        println("Your black coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
    } else {
        println("Your coffee with ${coffee.spoonsOfSugar} spoons of sugar is ready!")
    }

    fun heatWater(temperature:Double){
        //temperature is the parameter which holds the value of temperature passed.
        println("Water has been heated to $temperature degree celsius. Ready for a bath?")

    }

    fun packBag(day:Int){
    //day- the days of the week
        when(day){
            //Below mentioned is the time table which Jarvis needs to follow.
            Calendar.MONDAY->println("Today is your Mechanics class. Your bag has been packed accordingly.")
            Calendar.TUESDAY->println("Today is your Control System class. Your bag has been packed accordingly.")
            Calendar.WEDNESDAY->println("Today is your Kotlin Programming class. Your bag has been packed accordingly.")
            Calendar.THURSDAY->println("Today is your Digital Electronics class. Your bag has been packed accordingly.")
            Calendar.FRIDAY->println("Today is your Practical class. Your bag has been packed accordingly.")
            Calendar.SATURDAY->println("No classes today. Have a nice day!")
            Calendar.SUNDAY->println("No classes today. Have a nice day!")
            else->println("Invalid Entry!Try Again.")

            }
        }




    fun cook(menu: MutableList<String>){
        /*menu parameter is a mutable list which is a  user defined menu,
        the program is made to draw random values from this list for breakfast and lunch
        using the .random() function.*/
        println("${menu.random()} is ready for Breakfast")
        println("${menu.random()} is ready for Lunch")

    }

    fun ironClothes(clothes:String){
        //clothes parameter tells us the clothes entered by the user.
        println("Your $clothes is ironed and ready!")

    }

}