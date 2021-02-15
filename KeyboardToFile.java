//*************************************************************
//  Author: Steven Smail
//
//  KeyboardToFile.java
//
//  This program reads an arbitrary number of strings from
//  the keyboard and writes them to a text file.
//*************************************************************
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class KeyboardToFile
{
    public static void main( String[] args)
    {
        String n, x = "";

        System.out.println("This is program KeyboardToFile.");
        System.out.println();

        try
        {
            // Get filename from the user
            System.out.print("Please enter name for file to be written: ");
            Scanner keyboardScanner = new Scanner(System.in);
            String filename = keyboardScanner.nextLine();

            System.out.println("Enter strings to be written to the file.");
            System.out.println("Press Enter with no text to end the program.");

            FileOutputStream fos = 
                new FileOutputStream(filename, false);

            PrintWriter pw = new PrintWriter(fos);

        do
        {
            System.out.print("Enter string: ");
            Scanner stringScanner = new Scanner(System.in);
            n = stringScanner.nextLine();
            if (!(n.equals(x)))
            {
                pw.println(n);
            }
        } while (!(n.equals(x)));

            pw.close();

            System.out.println("File " + filename + " written.");
        }

        catch (FileNotFoundException ex)
        {
            System.out.println("Failed to create output file.");
        }
        System.out.println("Program complete.");
        System.out.println();
    }
}
