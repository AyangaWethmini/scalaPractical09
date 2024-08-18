import scala.io.StdIn.readLine 

object Q1 extends App {

  val calculateInterest: (Double, Double) => Double = (amount: Double, rate: Double) => amount * (rate / 100)

  val interest: Double => Double = (Amount: Double) => {
    Amount match {
      case a if Amount <= 2000 => calculateInterest(Amount, 2)
      case a if Amount <= 20000 => calculateInterest(Amount, 4)
      case a if Amount <= 200000 => calculateInterest(Amount, 3.5)
      case _ => calculateInterest(Amount, 6.5)
    }
  }

  val deposit = readLine("Enter the deposit amount: ").toDouble

  println("Interest for the deposit amount is: " + interest(deposit).toFloat)

}
