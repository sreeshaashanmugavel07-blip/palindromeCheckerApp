public class palindromeCheckerApp {
  // Application metadata
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "1.0.0";
    private static final String DEVELOPER = "Pavan Medam";

    // Main method: Entry point
    public static void main(String[] args) {
        displayWelcomeMessage();
        // Next use cases (UC2, UC3...) will be invoked from here
    }

    // UC1: Display welcome message
    private static void displayWelcomeMessage() {
        System.out.println("===================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" Version: " + APP_VERSION);
        System.out.println(" Developed by: " + DEVELOPER);
        System.out.println("===================================\n");
    }
}

}
