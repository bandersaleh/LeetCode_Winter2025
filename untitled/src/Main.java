//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("github.com/bandersaleh\n");

        //Problem #1 "Plus One" (easy-sorting)      {InitializeComponent(UnitTesting)}
        //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
        //Increment the large integer by one and return the resulting array of digits.
        Main main = new Main();  //Initialize an instance of Main Class
        // Testcase 1, 2, 3
//        int[] digits = {1, 2, 3};
        int[] digits = {4,3,2,1};
//        int[] digits = {9};

        // Call the method to increment the number by one
        int[] result = main.plusOne(digits);

        // Print the result
        System.out.print("Output: [");
        // forLoop to print each instance of the array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            // ifElse statement to
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        //Problem #389. Find the Difference (easy-sorting)      {InitializeComponent(UnitTesting)}
        // Testcase 1: Input "abcd" and "abcde", expected output is 'e'
        System.out.println(main.findTheDifference("abcd", "abcde")); // Output: e
        // Testcase 2: Input "" and "y", expected output is 'y'
        System.out.println(main.findTheDifference("", "y")); // Output: y

        //Problem #...

    }

    //Problem #1 "Plus One" (easy-sorting)      { MethodFunction(CODE_FOR_GitHub) }
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move towards the first one
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply increment it and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and move to the next digit
            digits[i] = 0;
        }

        // If we reached here, it means the number was all 9's (e.g., [9, 9, 9])
        // Create a new array with one extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // The first digit will be 1 (e.g., [1, 0, 0, 0])

        return result;
    }


    //Problem #389. Find the Difference (easy-sorting)          { MethodFunction(CODE_FOR_GitHub) }
    public char findTheDifference(String s, String t) {
        // Step 1: Initialize a variable to hold the result of XOR operations
        char result = 0;

        // Step 2: XOR all characters in string s
        for (char c : s.toCharArray()) {
            // Add each character to the XOR result
            result ^= c;
        }

        // Step 3: XOR all characters in string t
        for (char c : t.toCharArray()) {
            // Add each character in t to the XOR result
            result ^= c;
        }

        // Step 4: Return the final result, which is the extra character in t
        return result;
    }






}