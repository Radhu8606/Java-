public class ArgumentSearch {
    public static void main(String[] args) {
        boolean hasError = false;

        for (String arg : args) {
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                hasError = true;
                break;
            }
        }

        if (!hasError) {
            System.out.println("All arguments begin with uppercase letters.");
        }
    }
}