public class HelloApp5 {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            // No arguments provided, use default
            name = "World";
        } else {
            // Build a comma-separated list of names
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}
