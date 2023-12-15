
import java.util.ArrayList;
import java.util.Random;


public class Smoother
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
    //size = 10; range  = 3;
    public ArrayList<Integer> smoothData(ArrayList<Integer> a, int range) {
        int average;
        for(int i = 0; i < a.size(); i++) {
            int total = 0;
            int amount = 0;
            if(i < range) {
                int j = 0;
                // i = 0 { 0 1 2 3
                // i = 2 { 0 1 2 3 4 5
                while(j <= i + range) {
                    total = total + a.get(j); 
                    j++;
                    amount++;
                }
                average = total / amount;
                a.remove(i);
                a.add(i, average);
            }
            // i = 4
            // size = 10; 10 - 3 = 7 
            else if(i >= range && i < a.size() - range) {
                int j = i - range;
                //i = 4 { 1 2 3 4 5 6 7
                while(j < i + range + 1) {
                    total = total + a.get(j);
                    j++;
                    amount++;
                }
                average = total / amount;
                a.remove(i);
                a.add(i, average);
            }
            // 10 - 3 = 7
            //i = 7
            else {
                int j = i - range;
                //i = 8 { 5 6 7 8 9 
                while(j < a.size()) {
                    total = total + a.get(j);
                    j++;
                    amount++;
                }
                average = total / amount;
                a.remove(i);
                a.add(i, average);
            }
        }
        return a;
    }
    
    public void printData(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
