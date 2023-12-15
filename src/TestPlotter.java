import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestPlotter
{
    public static void main(String[] args) throws FileNotFoundException { 
        Plotter test = new Plotter();
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        
        test.createOutput(array,100);
        test.printData(array);
        
    }
}
