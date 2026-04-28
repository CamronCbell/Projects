import java.io.*;
import java.text.DecimalFormat;

public class M8A1 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            br.readLine();

            String line;
            DecimalFormat df = new DecimalFormat("$0.00");

            bw.write("Employee,Pay Rate,Hours Worked,Weekly Pay");
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hours = Double.parseDouble(data[2]);

                double weeklyPay;

                if (hours <= 40) {
                    weeklyPay = payRate * hours;
                } else {
                    double overtimeHours = hours - 40;
                    weeklyPay = (40 * payRate) + (overtimeHours * payRate * 1.5);
                }

                String formattedPay = df.format(weeklyPay);

                String outputLine = name + "," 
                                  + payRate + "," 
                                  + hours + "," 
                                  + formattedPay;

                bw.write(outputLine);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Processing complete. Check output.csv.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}