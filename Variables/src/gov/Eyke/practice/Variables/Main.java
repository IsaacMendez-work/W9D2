package gov.Eyke.practice.Variables;

public class Main {

    public static void main(String[] args) {

//      To store a whole number in Java, you can use an int variable as seen below:
        int myVar;
        myVar = 50;
        System.out.println(myVar);

//      The variable can also be defined in the same line it's declared in, as seen below:
        int yourVar = 100;
        System.out.println(yourVar);

//      The int variables can also be reassigned, as seen below:
        myVar = 75;
        System.out.println(myVar);

//      To set a variable to not be reassigned, simple use the final modifier as seen below:
        final int unchangingVar = 30;
        System.out.println(unchangingVar);
//      Trying to reassign this variable as we did the second time we called myVar will result in an error.

//      The final modifier can be added to variables even if they are not assigned when they are declared, as seen below:
        final int totalResult;
        int something = 5;
        int morething = 10;
        totalResult = something + morething + 8;
        System.out.println(totalResult);
//      So the totalResult was declared and made final, then we didn't assign it a value until after we had run some other code. Yet, totalResult cannot be changed now that it has been set.



System.out.println("A more complicated idea is that once values are assigned, they remain unchanced until reassigned.");
//      First, we will make a variable equal to 20
        int firstValue = 20;
        System.out.println(firstValue);

//      Next, we will make a second variable equal to the first variable, which will result in it also equaling 20
        int secondValue = firstValue;
        System.out.println(secondValue);

//      Now, if we change the value of the first variable from 20 to 70, the result in the Terminal will show that it has been updated to 70.
        firstValue = 70;
        System.out.println(firstValue);

//      However, if we call the second value now, its value will be complete unchanged by the first values recent reassignment.
        System.out.println(secondValue);
//      The reason is because Java reads from top to bottom, and (unless we update the value of the second variable to equal the first variable *after* the first variable was changed) the value will remain as it was when it was first declared, regardless of the changes to the first variable.

    }
}
