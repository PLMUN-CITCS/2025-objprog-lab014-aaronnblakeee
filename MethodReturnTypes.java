public class Main {

    // Method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two integers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;  // Use 2.0 to ensure result is a decimal (double)
        return average;
    }

    // Main method - program entry point
    public static void main(String[] args) {
        // Display the welcome message
        displayWelcomeMessage();

        // Declare two integer values
        int value1 = 20;
        int value2 = 30;

        // Call the calculateAverage method and store the result
        double result = calculateAverage(value1, value2);

        // Print the calculated average
        System.out.println("The average is: " + result);
    }
}

