import java.io.*;

public class ProjectEight {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        int numOne = 0, numTwo = 1, numThree;

        System.out.println("Input 1 to display the Fibonacci series for n terms.");
        System.out.println("Input 2 to display the sum of the series 1/1 + 1/3 + 1/5 + ... + 1/19.");
        System.out.println("");
        System.out.print("> ");
        String menuOption = BR.readLine();
        System.out.println("");

        switch (menuOption) {

            case "1": 

                System.out.print("Enter any natural number: ");
                int n = Integer.parseInt(BR.readLine());

                System.out.print(numOne + ", " + numTwo);

                for (int i = 2; i < n; i++) {

                    numThree = numOne + numTwo;    
                    numOne = numTwo;    
                    numTwo = numThree;    
                    System.out.print(", " + numThree);   
                }   
                
                System.out.println("");

                break;

            case "2":

                double numerator = 1;
                double denominator = 1;

                double sum = 0d;

                while (denominator <= 19) {
                    sum += (numerator/denominator);

                    denominator += 2;
                }

                System.out.println("The sum of the series 1 + 1/3 + 1/5 + ... + 1/19 is (approx.) " + String.format("%.2f", sum) + ".");

                break;
        }
    }
}