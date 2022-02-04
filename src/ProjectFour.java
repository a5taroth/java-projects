import java.io.*;

public class ProjectFour {

    public static void main(String[] args) throws IOException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        double lateFine = 0d;

        System.out.print("Enter the number of late days: ");
        int lateDays = Integer.parseInt(BR.readLine());

        while (lateDays != 0) {
            if (lateDays <= 5)  {
                lateFine += (lateDays - 0) * 40;
                lateDays = 0;
            }
            else if (lateDays <= 10) {
                lateFine += (lateDays - 5) * 65;
                lateDays = 5;
            }
            else {
                lateFine += (lateDays - 10) * 80;
                lateDays = 10;
            }
        }

        System.out.println("The late fine to be paid is " + lateFine / 100 + " rupees or " + lateFine + " paise.");
    }
}