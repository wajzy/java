public class Application {
    @SafeVarargs
    // Provide a detailed description, why it is safe. Actually, it isn't :(
    public static <T> T[] returnVarArgAsArray(T ...args) { // Possible heap pollution from parameterized vararg type T
        System.out.println("returnVarArgAsArray: " + args.getClass());
        return args;
    }

    public static <U> U[] twice(U arg) {
        return returnVarArgAsArray(arg, arg); // unchecked generic array creation for varargs parameter of type U[]
    }

    public static void main(String[] args) {
        String[] fruits = twice("lemon"); // ClassCastException
        //String[] fruits = returnVarArgAsArray("apple", "banana");
        System.out.println("main: " + args.getClass());
        for(var fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
