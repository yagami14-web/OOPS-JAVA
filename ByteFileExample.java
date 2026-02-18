package lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("charfile.txt");
            int i;
            System.out.println("Existing data in file:\n");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();

            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nEnter new data:");
            String newData = sc.nextLine();

            FileOutputStream fos = new FileOutputStream("charfile.txt");
            fos.write(("\n" + newData).getBytes());
            fos.close();

            System.out.println("Data added successfully.");
            sc.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
