import scala.io.StdIn.readLine

object Q2 extends App{

    val patternMatch : Int => String = (num : Int) => {
        num match {
            case n if  num <= 0 => "Negative/Zero"
            case n if  num % 2 == 0 => "Even Number"
            case _ => "Odd Number"
        }
    }

    val inputNum = readLine("Enter a number : ").toInt

    println("The number you entered is : " + patternMatch(inputNum))


}
