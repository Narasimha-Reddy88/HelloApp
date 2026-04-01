public class HelloApp3 {
    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            // Use the provided name
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}
