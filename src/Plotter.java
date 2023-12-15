import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Plotter
{
    ArrayList<String> stockData = new ArrayList<String>();
    //ArrayList<Integer> a = new ArrayList<Integer>();
    
    Random generator = new Random();
    
    //y=mx+b
    public ArrayList<Integer> createOutput(ArrayList<Integer> a, int range)  throws FileNotFoundException{
        //y = mx + b
        ArrayList<Integer> points = new ArrayList<Integer>();
        
        int m = 2;
        int b = 4;
        
        
        for(int i = 0; i < range; i++) {
            int x = generator.nextInt(range);
            int y = (m * x) + b;
            points.add(i,y);
        }
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Output File: ");
        String outputFile = scnr.next();
        
        PrintWriter out = new PrintWriter(outputFile);
        for(int i = 0; i < points.size(); i++) {
            out.println(points.get(i));
        }
        for(int i = 0; i < points.size(); i++) {
            a.add(i, points.get(i));
        }
        
        out.close();
        return a;
    }
    
    public void printData(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
