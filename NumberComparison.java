
// Write a Java program to compare two numbers using ==, !=, >, <, >=, <= and display the results.

public class NumberComparison {
    public static void main(String[] args) {
     

    
        int num1 = 20;
        int num2 = 10;

        // Comparing numbers and displaying results
        System.out.println("\nComparison Results:");
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
    }
}
