import java.io.*;

class FileIOExample {
    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, this is Java File I/O.");
            writer.write("\nThis is a second line.");

            writer.close();

            System.out.println("Data written successfully.");

            // Reading from file
            FileReader reader = new FileReader("example.txt");

            int ch;

            System.out.println("\nFile content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
