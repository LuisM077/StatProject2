import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestSalter
{
    public static void main(String[] args) throws FileNotFoundException {
        Salter test = new Salter();
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        test.addData(arrayList, 10);
        System.out.println("Data: ");
        test.printData(arrayList);
        
        test.saltData(arrayList);
        System.out.println("Salted: ");
        test.printData(arrayList);
        
        System.out.println();
        
        String input = "saltInput.txt";
        ArrayList<Integer> arrayX = new ArrayList<Integer>();
        ArrayList<Integer> arrayY = new ArrayList<Integer>();
        
        
        arrayX = test.loadX(input);
        arrayY = test.loadX(input);
        
        System.out.println("X");
        test.printData(arrayX);
        
        System.out.println("Y");
        test.printData(arrayY);
        
        test.saltData(arrayY);
        
        
    }
}
