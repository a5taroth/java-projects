import java.io.*;

public class ProjectTen {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        boolean prime = true;

        System.out.print("Enter any natural number: ");
        int num = Integer.parseInt(BR.readLine());

        for (int i = 2; i < num; i++) if (num % i == 0) prime = false;

        if (prime) System.out.println("The number " + num + " is prime.");
        else System.out.println("The number " + num + " is not prime.");
    }
}