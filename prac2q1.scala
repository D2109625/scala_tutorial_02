object que01{
    def main(args: Array[String])= {
        var i,j,k :Int = 2;
        var m,n :Int = 5;
        var f :Double = 12.0f;
        var g :Double = 4.0f
        var c :Char = 'X';

        println(k+12*m);
        println(m/j);
        println(n%j);
        println(m/j*j);
        println(f+10*5 +g);
        i += 1;
        println(i*n);
    }       
}





/*Differences Between Java and Scala
>> Syntax:

Scala is more concise and often has less boilerplate code compared to Java.
Java requires more explicit type declarations and boilerplate.

>> Variable Declaration and Initialization:
   
In Scala, multiple variables can be declared and initialized in a single line (e.g., var i, j, k: Int = 2).
In Java, each variable needs to be declared and initialized separately (e.g., int i, j, k; i = j = k = 2). 
 
>> Type Inference:

Scala has type inference, meaning it can often deduce the type of a variable from the context, reducing the need for explicit type declarations.
Java requires explicit type declarations for variables.

>>Immutable vs Mutable Variables:

Scala distinguishes between mutable (var) and immutable (val) variables.
Java uses final for immutability, but by default, variables are mutable */

