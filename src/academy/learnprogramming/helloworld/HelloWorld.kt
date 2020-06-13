package academy.learnprogramming.helloworld

/* How the Kotlin compilation process works..
1. The Kotlin compiler takes files with .kt extensions as input and generates bytecode as .class files.
2. At this point the .class file for Kotlin code is equivalent to the .class Java files and the JVM can run them
3. However. in order to execute the Kotlin .class bytecode, the Kotlin runtime library MUST be passed to the
JVM in addition to the JRE.
4. When distributing  a Kotlin application, we must distribute the Kotlin runtime library and the JRE otherwise
the application won't execute. */

// With Kotlin applications we can have code or functions outside of classes. However, under the covers, the Kotlin
// compiler will generate a class definition around this main method.
// Also notice that there's no return value defined on this main method, unlike in Java
fun main(args: Array<String>) {
    // Two major differences between Java and Kotlin are no semicolons and
    // no need to include System.out.println()
    println("Hello World")
}