package binaryheap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Printer
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File text = new File("input.txt");
        Scanner scnr = new Scanner(text);
        int numItems = 1000000;
        BinaryHeap h = new BinaryHeap(numItems);
        
        while(scnr.hasNextLine())
        {
            String line = scnr.nextLine();
            String[] temp = line.split("\t");
            if(temp[3].equals("I"))
            {
                PrintJob obj = new PrintJob(temp[0], Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
                try
                {
                    h.insert(obj);
                } 
                catch (Overflow e)
                {
                    System.out.println( "Overflow expected! ");
                }
            }
            else 
            {
                OutsidePrintjob obj = new OutsidePrintjob(temp[0], Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
                try
                {
                    h.insert(obj);
                } 
                catch (Overflow e)
                {
                    System.out.println( "Overflow expected! ");
                }
            }
        }
        
        while(!h.isEmpty())
        {
            PrintJob temp = (PrintJob)h.deleteMin();
            System.out.println(temp);
        }
    }
}


 class Overflow extends Exception
{
}