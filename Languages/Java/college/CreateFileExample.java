import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String fileName = "new_file.txt";

        try {
            File file = new File(fileName);

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

            // Write content into the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("This is the content of the new file.");
            writer.newLine(); // Add a newline character
            writer.close();
            
            System.out.println("Content has been written to the file: " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}





















// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class ReadWriteFileExample {
//     public static void main(String[] args) {
//         String sourceFileName = "new_file.txt";
//         String destinationFileName = "output_file.txt";

//         try {
//             // Read content from the source file
//             BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
//             StringBuilder content = new StringBuilder();
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 content.append(line);
//                 content.append("\n"); // Append newline character for each line
//             }
//             reader.close();

//             // Write content to the destination file
//             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));
//             writer.write(content.toString());
//             writer.close();

//             System.out.println("Content has been copied from " + sourceFileName + " to " + destinationFileName);
//         } catch (IOException e) {
//             System.err.println("An error occurred: " + e.getMessage());
//         }
//     }
// }
