
import java.util.ArrayList;


public class TestSmoother
{
     public static void main(String[] args) {
        Smoother test = new Smoother();

        ArrayList<Integer> array = new ArrayList<Integer>();
    
        test.addData(array, 100);
        System.out.println("Generated Data: ");
        test.printData(array);
        
        test.saltData(array);
        System.out.println("Salted Data: ");
        test.printData(array);
        
        test.smoothData(array, 3);
        System.out.println("Smooth Data: ");
        test.printData(array);
        
        test.smoothData(array, 3);
        System.out.println("Smooth Data: ");
        test.printData(array);
        
        test.smoothData(array, 3);
        System.out.println("Smooth Data: ");
        test.printData(array);
        
        
    }
}
