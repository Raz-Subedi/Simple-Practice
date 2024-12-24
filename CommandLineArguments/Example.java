public class Example {

    public static void main(String... args) {
        // Check if command-line arguments are provided
        if (args.length > 0) {
            System.out.println("Arguments provided:");

            // Iterate through the arguments and print them
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments provided.");
        }
    }
}