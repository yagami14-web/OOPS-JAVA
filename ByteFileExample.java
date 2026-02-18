package lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("charfile.txt",true);
            String data = "atharva raghuvanshi is not my name";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully");

            FileInputStream fis = new FileInputStream("charfile.txt");
            int i;
            System.out.println("Reading from file");
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();

        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
