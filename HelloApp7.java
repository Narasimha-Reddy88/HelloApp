public class HelloApp7 {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // No arguments provided, use default
            name = "World";
        } else {
            // Join all arguments with a comma and space
            name = String.join(", ", args);
        }

        System.out.println("Hello, " + name + "!");
    }
}
