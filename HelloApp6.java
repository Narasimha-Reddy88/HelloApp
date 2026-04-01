public class HelloApp6 {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // No arguments provided, use default
            name = "World";
        } else {
            // Build a comma-separated list of names
            StringBuilder nameBuilder = new StringBuilder();
            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }

            // Remove the trailing comma and space
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                name = "World";
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}
