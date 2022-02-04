import java.io.*;

public class ProjectThree {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the unit: ");
        String unit = BR.readLine();

        System.out.print("Enter the length of side one: ");
        double sideOne = Double.parseDouble(BR.readLine());
        
        System.out.print("Enter the length of side two: ");
        double sideTwo = Double.parseDouble(BR.readLine());
        
        System.out.print("Enter the length of side three: ");
        double sideThree = Double.parseDouble(BR.readLine());

        double perimeter = sideOne + sideTwo + sideThree;        
        double halfPerimeter = perimeter / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));

        System.out.println("The perimeter of the triangle is " + perimeter + " " + unit + ".");
        System.out.println("The area of the triangle is " + String.format("%.2f", area) + " " + unit + " squared.");
    }
}