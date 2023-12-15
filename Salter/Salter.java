
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Salter
{
    Random generator = new Random();
    
    public ArrayList<Integer> addData(ArrayList<Integer> a, int range) {
        for(int i = 0; i < range; i++) {
            int data = 10 + generator.nextInt(100);
            a.add(data);
        }
        return a;
    }
    
    public ArrayList<Integer> saltData(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            int randValue = generator.nextInt(10);
            int choice = generator.nextInt(2);
            int newData;
            
            if(choice == 0) {
                newData = a.get(i) + randValue;
                a.remove(i);
                a.add(i, newData);
            }
            else {
                newData = a.get(i) - randValue;
                a.remove(i);
                a.add(i, newData);
            }
        }
        return a;
    }
    
    public ArrayList<Integer>  loadX(String file) throws FileNotFoundException {
        File inputFile = new File(file);
        
        Scanner in = new Scanner(inputFile);
        
        ArrayList<Integer> xValues = new ArrayList<Integer>();
        ArrayList<Integer> yValues = new ArrayList<Integer>();
        //in.useDelimiter("");
        int k = 0;
        while(in.hasNextInt()) {
            int x = in.nextInt();
            xValues.add(k,x);
            int y = in.nextInt();
            yValues.add(k,y);
            k++;
        }
        
        in.close();
        return xValues;
    }
    
    public ArrayList<Integer>  loadY(String file) throws FileNotFoundException {
        
        File inputFile = new File(file);
        
        Scanner in = new Scanner(inputFile);
        
        ArrayList<Integer> xValues = new ArrayList<Integer>();
        ArrayList<Integer> yValues = new ArrayList<Integer>();
        
        int k = 0;
        while(in.hasNextInt()) {
            int x = in.nextInt();
            xValues.add(k,x);
            int y = in.nextInt();
            yValues.add(k,y);
            k++;
        }
        
        in.close();
        return yValues;
        
    }
    
    public void printData(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
