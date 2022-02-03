import java.io.*;

public class ProjectOne {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader StdIn = new BufferedReader(In);

        double length, breadth;

        System.out.print("Enter the unit: ");
        String unit = StdIn.readLine();

        System.out.print("Enter the req. length: ");
        length = Double.parseDouble(StdIn.readLine());

        System.out.print("Enter the req. breadth: ");
        breadth = Double.parseDouble(StdIn.readLine());

        double rectPerimeter = 2*(length + breadth);
        double squareEdge = rectPerimeter/4;

        double squareArea = squareEdge*squareEdge;

        System.out.println("The area of the square with perimeter equivalent to the perimeter of a rectangle of given dimensions is " + squareArea + " " + unit + "squared.");
    }
}