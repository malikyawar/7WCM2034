/**
 * A utility class providing basic arithmetic and string operations.
 * Demonstrates method overloading for integer and String types.
 */
package default;
public class MyClass {

    /**
     * Adds two integers together.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b){
        return a + b;
    }

    /**
     * Concatenates two strings together.
     * @param a The first String.
     * @param b The second String.
     * @return A new String consisting of a followed by b.
     */
    public String add(String a, String b){
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * @param a The integer to subtract from.
     * @param b The integer to subtract.
     * @return The result of a minus b.
     */
    public int sub(int a, int b){
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int mult(int a, int b){
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * Note: does not handle division by zero.
     * @param a The dividend.
     * @param b The divisor.
     * @return The integer result of a divided by b.
     */
    public int div(int a, int b){
        return a / b;
    }

    /**
     * Returns the remainder of dividing a by b.
     * @param a The dividend.
     * @param b The divisor.
     * @return The remainder of a divided by b.
     */
    public int mod(int a, int b){
        return a % b;
    }

    /**
     * Returns a greeting string for the given name.
     * @param name The name to greet.
     * @return A String in the format "Hello[name]".
     */
    public String sayHello(String name){
        return "Hello" + name;
    }
}
