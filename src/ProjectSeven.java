import java.io.*;

public class ProjectSeven {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        System.out.print("Enter any natural number: ");
        int n = Integer.parseInt(BR.readLine());

        for (int i = 1; i <= n; i++) sum += i;

        System.out.println("The sum of " + n + " consecutive natural numbers is " + sum + ".");
    }
}