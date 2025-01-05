package Lab_10_z_3;

import  java.io.*;

public class FileProcessor {
    public static void main(String[] args) {
        // File paths
        String inputFilePath = "C:\\Users\\macie\\IdeaProjects\\Lab_10_z_3\\src\\Lab_10_z_3\\input.txt";
        String outputFilePath = "C:\\Users\\macie\\IdeaProjects\\Lab_10_z_3\\src\\Lab_10_z_3\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append("Modified: ").append(line).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("Content modified and saved to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}