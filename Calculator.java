// Method Overloading:

// Method overloading is the process of defining multiple methods in a class with the same name 
// but different parameters. The compiler determines which method to invoke based on the arguments
//  provided. Here's an example:

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));             // Output: 15 (int version)
        System.out.println(calc.add(2.5, 3.5));          // Output: 6.0 (double version)
        System.out.println(calc.add(1, 2, 3));           // Output: 6 (int version)
    }
}

// In the above example, the `Calculator` class has three `add` methods. The first method accepts 
// two integers, the second method accepts two doubles, and the third method accepts three integers. 
// By providing different parameter types or different number of parameters, we can overload the method.

