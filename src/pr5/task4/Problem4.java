package pr5.task4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Problem4 {
    public static void main(String[] args) {
        String fileName = "src/pr5/task4/sensor.bin";

        try {
            writeTemperatures(fileName);
            patchTemperature(fileName);
            readAndAnalyze(fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void writeTemperatures(String fileName) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));

        for (int i = 0; i < 60; i++) {
            double temp = 15.0 + Math.random() * 20.0; 
            out.writeDouble(temp);
        }

        out.close();
        System.out.println("60 temperatures were written to the file");
    }

    public static void patchTemperature(String fileName) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

        int index = 29; 
        raf.seek(index * 8); //1 double 8 байт
        raf.writeDouble(999.9);

        raf.close();
        System.out.println("30th temperature was replaced with 999.9");
    }

    public static void readAndAnalyze(String fileName) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream(fileName));

        double sum = 0;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < 60; i++) {
            double temp = in.readDouble();
            sum += temp;

            if (temp > max) {
                max = temp;
            }
        }

        in.close();

        double average = sum / 60;

        System.out.println("Average temperature: " + average);
        System.out.println("Maximum temperature: " + max);
    }
}