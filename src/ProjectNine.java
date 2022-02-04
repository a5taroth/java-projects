import java.io.*;

public class ProjectNine {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        int sumOfFactors = 0;

        System.out.print("Enter any natural number: ");
        int num = Integer.parseInt(BR.readLine());

        for (int i = 1; i < num; i++) if (num % i == 0) sumOfFactors += i;
        
        if (num == sumOfFactors) System.out.println("The number is a perfect number.");
        else System.out.println("The number is not a perfect number.");
    }
}