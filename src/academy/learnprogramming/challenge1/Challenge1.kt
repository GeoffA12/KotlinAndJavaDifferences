package academy.learnprogramming.challenge1

fun main(args: Array<String>) {
    // Declare two immutable string variables called hello1 and hello2. Assign
    // 'hello' to both variables.
    val hello1: String
    val hello2 : String
    hello1 = "Hello"
    hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referntially equal. and print the result
    println(hello1 === hello2)

    // Do the same thing as above, but test for structural equality
    println(hello1 == hello2)

    // Declare a mutable variable of type Int and assign it the value of 2988
    var i = 2988

    // Declare an immutable variable of type Any and assign it the string "The Any type is the root of the Kotlin
    // class hiearchy". Then using a smart cast, print out the uppercased string.
    val aString: Any = "The Any type is the root of the Kotlin class hiearchy"
    if (aString is String) {
        println(aString.toUpperCase())
    }

    // Using one line of code, print out the following. Make sure your code is nicely indented.
    /*
           1
          11
         111
     */
    println("""
        1
       11
      111
     1111
    """.trimIndent())
}