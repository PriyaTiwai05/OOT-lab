// User-defined exception class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
class ExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above!"
            );
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        try {
            int age = 20;

            checkAge(age);

        } catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("Program execution completed.");
        }
    }
}
