package gov.Eyke.practice.DataTypes;

public class Main {

    public static void main(String[] args) {
//      In Java, primitive data types are the data types that are build into the language, and so are the foundation of all other types.
//      The four categories of data types are the integer type, the floating point type, the character type, and the boolean type.

/*
INTEGER:
The integer type stores whole numbers.
The integer type is divided into subtypes based on the size of the value it can hold.
*/
System.out.println("\nInteger data type examples:"); // Note: The backslash n adds a new line, which helps with spacing in the Terminal.

//      byte holds 8 bits; its minimum value is -128 and its maximum value is 127.
        byte numberOfEnglishLetters = 26;
        System.out.println(numberOfEnglishLetters);

//      short holds 16 bits; its minimum value is -32768 and its maximum value is 32767.
        short feetInAMile = 5280;
        System.out.println(feetInAMile);

//      int holds 32 bits; its range is over 2 billion into the positives and into the negatives.
        int milesToSun = 92960000;
        System.out.println(milesToSun);

//      long-L holds 64 bits; its range is over nine quintillion in the positives and into the negatives.
        long milesInALightYear = 5879000000000L;
//      Note that long-L uses long to declare the variable and at the end of the value includes an L.
        System.out.println(milesInALightYear);

/*
FLOATING POINT:
The floating point type can store a value containing a fractional amount (viz., a decimal).
The floating point type is divided into subtypes based on the amount of data the variable can hold.
 */
System.out.println("\nFloating point data type examples:"); // Note: The backslash n adds a new line, which helps with spacing in the Terminal.

//      float-f holds 32 bits; its range is roughly seven decimal places.
        float absoluteZeroInCelsius = -273.15f;
//      Note that float-f uses float to declare the variable and at the end of the value includes an f.
        System.out.println(absoluteZeroInCelsius);

//      double-d holds 64 bits; its range is roughly sixteen decimal places.
        double atomWidthInMeters = 0.0000000001d;
//      Unlike float-f, double-d does not require the letter d at the end of the value. However, it is considered best practice to include the d
        System.out.println(atomWidthInMeters);
//      NOTE: The Terminal will return an answer with an E, which stands for "exponent of 10", and is always followed by another number, which is the value of the exponent.


/*
CHARACTER TYPE:
The character type stores a singe Unicode character (not a string).
The character type literals are placed between single quotes.
*/
System.out.println("\nCharacter data type examples:"); // Note: The backslash n adds a new line, which helps with spacing in the Terminal.

//      char variables hold a single character.
        char letterU = 'U';
        System.out.println(letterU);
//      char variables can hold *any* Unicode character, which includes characters that aren't on the keyboard.
//      Call these by using the backslash and the letter u, followed by the 4-digit hex value of that single Unicode character.
        char accentedU = '\u00DA';
        System.out.println(accentedU);

/*
BOOLEAN TYPE:
The boolean type stores true or false values.
*/
System.out.println("\nBoolean data type examples:"); // Note: The backslash n adds a new line, which helps with spacing in the Terminal.
//      boolean variables can be assigned a value of true...
        boolean coughDropsAreGross = true;
        System.out.println(coughDropsAreGross);
//      ... or boolean variables can be assigned a value of false.
        boolean coughDropsAreGood = false;
        System.out.println(coughDropsAreGood);


    }
}
