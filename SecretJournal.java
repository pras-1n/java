import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecretJournal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename = "journal.txt";

        System.out.println("--- Secret Journal ---");
        System.out.println("[1] Read Journal [2] Write Entry");
        System.out.println("Choose an option: ");
        String choice = input.nextLine();

        if (choice.equals("1")) {
            try {
                File myFile = new File(filename);

                if(myFile.exists()) {
                    Scanner fileReader = new Scanner(myFile);

                    System.out.println("\n--- Past Entries ---");
                    while (fileReader.hasNextLine()) {
                        System.out.println(fileReader.nextLine());                        
                    }
                    fileReader.close();
                } else {
                    System.out.println("Your journal is empty! Write something first.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred while reading the file.");
            }
        } else if (choice.equals("2")) {
            System.out.println("Write your secret entry: ");
            String entry = input.nextLine();

            try {
                FileWriter writer = new FileWriter(filename, true);
                writer.write("- " + entry + "\n");
                writer.close();

                System.out.println("Entry saved securely!");
            } catch (IOException e) {
                System.out.println("An error occurred while saving.");
            }
        } else  {
            System.out.println("Invalid option.");
        }
        input.close();
    }
}
