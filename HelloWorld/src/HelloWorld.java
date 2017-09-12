public class HelloWorld {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide atleast one command line argument. Exiting ...");
            return;
        }
        System.out.println("Hello, " + args[0] + "!");
    }
}
