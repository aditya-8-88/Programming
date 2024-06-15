


public class Solution {

public static int numSteps(String s) {
char[] numbers = s.toCharArray();
int result = 0;
for(int i = numbers.length - 1; i >= 0; i--) {
if(numbers[i] == '1') {
result += 1 << (numbers.length - i - 1); // Bitwise left shift is faster than
Math.pow
}
}

int c = 0;
while (result != 1) {
if ((result & 1) == 1) {
result += 1; // If odd, add 1
} else {
result >>= 1; // If even, right shift
}
c++;
}
return c;
}

public static void main(String[] args) {
String binaryString =
"1111011110000011100000110001011011110010111001010111110001";
int result = numSteps(binaryString);
System.out.println("Number of steps to reduce " + binaryString + " to 1: " +
result);
}
}

// import java.util.ArrayList;
// import java.util.List;

// public class NumberCombinations {

// public static void permute(String prefix, String remaining, List<String>
result) {
// int n = remaining.length();
// if (n == 0) {
// result.add(prefix);
// } else {
// for (int i = 0; i < n; i++) {
// permute(prefix + remaining.charAt(i),
// remaining.substring(0, i) + remaining.substring(i + 1, n),
// result);
// }
// }
// }

// public static List<String> getCombinations(String number) {
// List<String> result = new ArrayList<>();
// permute("", number, result);
// return result;
// }

// public static void main(String[] args) {
// String number = "123";
// List<String> combinations = getCombinations(number);
// System.out.println("Combinations of " + number + " are: " + combinations);
// }
// }

// // import java.io.BufferedWriter;
// // import java.io.File;
// // import java.io.FileWriter;
// // import java.io.IOException;

// // public class CreateFileExample {
// // public static void main(String[] args) {
// // String fileName = "new_file.txt";

// // try {
// // File file = new File(fileName);

// // if (file.createNewFile()) {
// // System.out.println("File created: " + file.getAbsolutePath());
// // } else {
// // System.out.println("File already exists.");
// // }

// // BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
// // writer.write("This is the content of the new file.");
// // writer.newLine();
// // writer.close();

// // System.out.println("Content has been written to the file: " +
fileName);
// // } catch (IOException e) {
// // System.err.println("An error occurred: " + e.getMessage());
// // }
// // }
// // }

// // import java.io.BufferedReader;
// // import java.io.BufferedWriter;
// // import java.io.FileReader;
// // import java.io.FileWriter;
// // import java.io.IOException;

// // public class ReadWriteFileExample {
// // public static void main(String[] args) {
// // String sourceFileName = "new_file.txt";
// // String destinationFileName = "output_file.txt";

// // try {
// // // Read content from the source file
// // BufferedReader reader = new BufferedReader(new
FileReader(sourceFileName));
// // StringBuilder content = new StringBuilder();
// // String line;
// // while ((line = reader.readLine()) != null) {
// // content.append(line);
// // content.append("\n"); // Append newline character for each line
// // }
// // reader.close();

// // // Write content to the destination file
// // BufferedWriter writer = new BufferedWriter(new
FileWriter(destinationFileName));
// // writer.write(content.toString());
// // writer.close();

// // System.out.println("Content has been copied from " + sourceFileName + "
to " + destinationFileName);
// // } catch (IOException e) {
// // System.err.println("An error occurred: " + e.getMessage());
// // }
// // }
// // }