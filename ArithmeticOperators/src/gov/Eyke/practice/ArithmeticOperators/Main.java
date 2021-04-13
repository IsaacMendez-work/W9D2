package gov.Eyke.practice.ArithmeticOperators;

public class Main {

    public static void main(String[] args) {
/*
Arithmetic operators are broken up into three categories:
    The basic operators are those that behave as they do in traditional math, such as addition, multiplication, subtraction, and division.
    The prefix/postfix operators those that increase or decrease a value by 1, and replace the original value with the result.
    The compound assignment operators are those that operate on a value in a similar way to using the basic operators, and then replace the original value with the result in a similar way to the prefix/postfix operators.
 */

System.out.println("\nExamples of basic operators:"); // Note: The backslash+n adds a new line, which helps with spacing in the Terminal.
//      Both floating points and integers are valid here. (See gov.Eyke.practice.Variables.Main for detail about those two.)
//      Using integer returns a whole number
        byte adding = 1 + 2;
        System.out.println(adding);

//      Using floating point returns a fractional (even if it is just appending a ".0")
        double subtracting = 5 - 4d;
        System.out.println(subtracting);

//      When using integer, be aware that it will always return the whole number of times a one number falls in another. (For simple equations, it seems like it always rounds down, but it gets more complicated as the project grows.)
        short dividing = 13 / 5;
        System.out.println(dividing);

//      Whereas floating points will return the exact results
        float dividing2 = 13 / 5f;
        System.out.println(dividing2);

//      The last basic operator is modulus (%), which returns the remainder of a division
        int modulus = 27 % 4;
        System.out.println(modulus);
    }
}
