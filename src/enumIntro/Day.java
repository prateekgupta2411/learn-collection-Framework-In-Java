package enumIntro;

/**
 * Enum in Java:
 * - Enum is a special class in Java that represents a fixed set of constants.
 * - It provides type safety and improves code readability.
 * - Enums can have methods, constructors, and instance variables.
 * - Internally, each enum constant is an instance of the enum class.
 */
public enum Day {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;

    public static void main(String[] args) {
        // Printing enum constants directly
        System.out.println(Day.Sunday);
        System.out.println(Day.Monday);

        // Comparing two enum values (Returns the difference between their ordinal values)
        System.out.println(Day.Sunday.compareTo(Day.Monday));

        // Getting ordinal (position) of an enum constant (Index starts from 0)
        System.out.println(Day.Friday.ordinal());

        // Storing an enum value in a variable
        Day today = Day.Friday;
        System.out.println(today.ordinal()); // Printing ordinal of today
        System.out.println(today.name()); // Getting name of enum constant
        System.out.println("Today is: " + today);

        // Checking equality using == operator
        if (today == Day.Friday) {
            System.out.println("Weekend is near!");
        }

        // Printing all enum constants using values() method
        System.out.print("Days of the week: ");
        for(Day d : Day.values()){
            System.out.print(d + " ");
        }
        System.out.println(); // For new line

        // Getting enum constant from a string using valueOf() method
        Day d1 = Day.valueOf("Tuesday");
        System.out.println("Selected Day: " + d1);

        // Using toString() method (by default it returns the enum constant's name)
        Day today1 = Day.Saturday;
        System.out.println("Today is: " + today1.toString()); // Output: Saturday
    }
}
