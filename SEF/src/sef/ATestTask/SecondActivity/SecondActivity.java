package sef.ATestTask.SecondActivity;

// Complete Code
public class SecondActivity {

    public static void main(String[] args) {
        //SecondActivity calculator = new SecondActivity();
        Calculator calculator = new Calculator(Calculator.CALC_TYPE_BASIC);


        //TODO Use the calculator to calculate different values
        //Example ->
        //calculator.sum(10.2, 5);
        //calculator.divide(100, 33);
        // and more
        double result = calculator.add(10.2, 5);
        System.out.println("1) Add result is " + result);
        result = calculator.subtract(100, 33);
        System.out.println("1) Subtract result is " + result);
        // Multiply
        double[] mul = {2, 3, 4};
        result = calculator.multiply(mul);
        System.out.println("2) Multiplication result is " + result);
        result = calculator.divide(3, 4);
        System.out.println("1) Divide result is " + result);

    }

    //TODO create the Calculator (here or in additional class)
}