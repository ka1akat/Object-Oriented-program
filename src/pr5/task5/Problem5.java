package pr5.task5;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Problem5 {
    public static void main(String[] args) {
        String inputFile = "src/pr5/task5/expressions.txt";
        String resultFile = "src/pr5/task5/results.txt";
        String logFile = "src/pr5/task5/log.txt";

        
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter resultWriter = new BufferedWriter(new FileWriter(resultFile));
                BufferedWriter logWriter = new BufferedWriter(new FileWriter(logFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    double result = evaluateExpression(line);
                    resultWriter.write(line + " = " + result);
                    resultWriter.newLine();
                } catch (NoSuchElementException e) {
                    logWriter.write("Error in expression: " + line + " -> NoSuchElementException");
                    logWriter.newLine();
                } catch (NumberFormatException e) {
                    logWriter.write("Error in expression: " + line + " -> NumberFormatException");
                    logWriter.newLine();
                } catch (UnsupportedOperationException e) {
                    logWriter.write("Error in expression: " + line + " -> UnsupportedOperationException");
                    logWriter.newLine();
                }
            }

            System.out.println("Check results.txt and log.txt");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public static double evaluateExpression(String expression) {
        StringTokenizer st = new StringTokenizer(expression, "+-*/^", true);

        String firstToken = st.nextToken();
        String operator = st.nextToken();
        String secondToken = st.nextToken();

        double a = Double.parseDouble(firstToken);
        double b = Double.parseDouble(secondToken);

        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("*")) {
            return a * b;
        } else if (operator.equals("/")) {
            return a / b;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
