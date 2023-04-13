package copyFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void copyFileUsingJava7File (File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream (File source, File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file: ");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
//            copyFileUsingJava7File(sourceFile, destFile);
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy complete: ");
        } catch (IOException ioe){
            System.out.printf("Can't copy taht file");
            System.out.printf(ioe.getMessage());
        }
    }
}
