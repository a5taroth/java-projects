import java.io.*;

public class ProjectFive {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        String reverse = "";

        System.out.print("Enter a number for palindrome check: ");
        String num = BR.readLine();

        int numLen = num.length();

        for (int i = numLen - 1; i >= 0; i--) reverse += num.charAt(i);

        if (num.equals(reverse)) System.out.println("The number is a palindrome.");
        else System.out.println("The number isn't a palindrome.");
    }
}