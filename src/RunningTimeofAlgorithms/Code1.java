package RunningTimeofAlgorithms;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        
        int counter = 0;
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
                counter++;
            }
            arr[j + 1] = value;

        }       
        
        System.out.println(counter);
        scanner.close();
    }
}
