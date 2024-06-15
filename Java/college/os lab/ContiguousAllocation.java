import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class File {
    String name;
    int startBlock;
    int length;

    File(String name, int startBlock, int length) {
        this.name = name;
        this.startBlock = startBlock;
        this.length = length;
    }

    void display() {
        System.out.print("File Name: " + name + ", Blocks: ");
        for (int i = 0; i < length; i++) {
            System.out.print((startBlock + i) + " ");
        }
        System.out.println();
    }
}

public class ContiguousAllocation {
    private static final int TOTAL_BLOCKS = 100;
    private static boolean[] disk = new boolean[TOTAL_BLOCKS];

    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add File\n2. Display Files\n3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter file name: ");
                    String name = scanner.next();
                    System.out.print("Enter starting block: ");
                    int startBlock = scanner.nextInt();
                    System.out.print("Enter file length: ");
                    int length = scanner.nextInt();

                    if (isContiguousFree(startBlock, length)) {
                        allocateBlocks(startBlock, length);
                        files.add(new File(name, startBlock, length));
                        System.out.println("File added successfully.");
                    } else {
                        System.out.println("Not enough contiguous free space available.");
                    }
                    break;

                case 2:
                    for (File file : files) {
                        file.display();
                    }
                    break;

                case 3:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static boolean isContiguousFree(int startBlock, int length) {
        if (startBlock + length > TOTAL_BLOCKS) {
            return false;
        }
        for (int i = startBlock; i < startBlock + length; i++) {
            if (disk[i]) {
                return false;
            }
        }
        return true;
    }

    private static void allocateBlocks(int startBlock, int length) {
        for (int i = startBlock; i < startBlock + length; i++) {
            disk[i] = true;
        }
    }
}
