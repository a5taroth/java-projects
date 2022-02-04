import java.io.*;

public class ProjectSix {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any number: ");
        int num = Integer.parseInt(BR.readLine());

        System.out.println("");
        System.out.println("Input 1 to know if the number is even or odd.");
        System.out.println("Input 2 to know if the number is a multiple of 17 or not.");
        System.out.println("Input 3 to know if the number is two digit or not.");
        System.out.println("");
        System.out.print("> ");
        String menuOption = BR.readLine();
        System.out.println("");

        switch (menuOption) {
            case "1":
                if (num % 2 == 0) System.out.println("The number is even.");
                else System.out.println("The number is odd.");

                break;

            case "2":
                if (num % 17 == 0) System.out.println("The number is a multiple of 17.");
                else System.out.println("The number is not a multiple of 17.");

                break;

            case "3":
                int numLen = String.valueOf(num).length();

                if (numLen == 2) System.out.println("The number is two digits long."); 
                else System.out.println("The number is not 2 digits long but rather " + numLen + " digits long.");

                break;
        }
    } 
}