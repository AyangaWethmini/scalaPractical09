object Q3 extends App{

    val toUpper : String => String = (str : String) => str.toUpperCase()

    val toLower : String => String = (str : String) => str.toLowerCase()

    val formatNames: (String, String => String) => String = 
    (name: String, formatFunction: String => String) => formatFunction(name)



    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", name => toUpper(name.substring(0, 2) + name.substring(2))))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", name => 
      toUpper(name.substring(0, 1)) + 
      toLower(name.substring(1, 5)) + 
      toUpper(name.substring(5))
    ))


}
