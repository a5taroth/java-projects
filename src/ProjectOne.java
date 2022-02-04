import java.io.*;

public class ProjectOne {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        double length, breadth;

        System.out.print("Enter the unit: ");
        String unit = BR.readLine();

        System.out.print("Enter the req. length: ");
        length = Double.parseDouble(BR.readLine());

        System.out.print("Enter the req. breadth: ");
        breadth = Double.parseDouble(BR.readLine());

        double rectPerimeter = 2*(length + breadth);
        double squareEdge = rectPerimeter/4;

        double squareArea = squareEdge*squareEdge;

        System.out.println("The area of the square with perimeter equivalent to the perimeter of a rectangle of given dimensions is " + squareArea + " " + unit + " squared.");
    }
}