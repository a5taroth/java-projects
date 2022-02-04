import java.io.*;

public class ProjectTwo {

    public static void main(String[] args) throws IOException {
        
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        float totalMarks = 0f;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter grade in subject " + i + " (out of 100) : ");
            float marks = Float.parseFloat(BR.readLine());

            totalMarks += marks;
        }

        float aggregateMarks = totalMarks/ 5;
        float percentage = aggregateMarks * 100 / 100;

        System.out.println("The aggregate marks obtained was " + String.format("%.2f", aggregateMarks) + ".");
        System.out.println("The percentage obtained was " + Math.round(percentage) + "%");
    }
}