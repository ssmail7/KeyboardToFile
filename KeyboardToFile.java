//************************************************************
//  Author: Steven Smail
//
//  KeyboardToFile.java
//
//  This program reads an arbitrary number of strings from
//  the keyboard and writes them to a text file.
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

        String n, x = "";


            // Get filename from the user

            System.out.println("Enter strings to be written to the file.");
            System.out.println("Press Enter with no text to end the program.");


            PrintWriter pw = new PrintWriter(fos);

        do
        {
            System.out.print("Enter string: ");
            Scanner stringScanner = new Scanner(System.in);
            if (!(n.equals(x)))
            {
                pw.println(n);
            }
        } while (!(n.equals(x)));


            System.out.println("File " + filename + " written.");

        System.out.println();
    }