public class GenericsinEnum {
    public static void main(String[] args) {
        Day day = Day.Monday;
        // Day day2  = "Monday"; // error
    }
}

enum Day{
    Sunday,Monday,Tuesday
} // enums are inherently type safe