package AlmostSorted;

import java.util.*;

public class Code1 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> rev = new ArrayList<Integer>();
        ArrayList<Integer> revPos = new ArrayList<Integer>();
        ArrayList<Integer> swap = new ArrayList<Integer>();
        ArrayList<Integer> swapPos = new ArrayList<Integer>();
        
        //int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr.add(scanner.nextInt());
        }
        /*
        for(int i=0;i < n && arr.length > 2; i++)
        {
        	if(swap.size()==0)
        	{
        		if(arr[i] > arr[i+1])
        		{swap.add(arr[i]);swapPos.add(i);}
        	}
        	else if(swap.size() != 0 && i < n-1)
        	{
        		//if(arr[i] < arr[i-1] && arr[i]<arr[i+1] && swap.get(0) > arr[i-1] && swap.get(0)<arr[i+1])
        		if(arr[i] < arr[i-1] && swap.get(0) > arr[i-1])
        		{swap.add(arr[i]);swapPos.add(i);}
        	}
        	else if(swap.size() != 0 && i == n-1)
        	{
        		if(arr[i] < arr[i-1] && swap.get(0) > arr[i-1])
        		{swap.add(arr[i]);swapPos.add(i);}
        	}
        	
        }*/
        
        for(int i=0, j = n-1; i<n-1 && j>0; i++,j--)
        {
        	if(arr.get(i) > arr.get(i+1))
    		{
        		if(swap.size() == 2){break;}
        		swap.add(arr.get(i));swapPos.add(i);
    		}
        	if(arr.get(j) < arr.get(j-1))
    		{
        		if(swap.size() == 2){break;}
        		swap.add(arr.get(j));swapPos.add(j);
    		}
        }
        
        
        //System.out.println(swap);
        //System.out.println(swapPos);
        ArrayList<Integer> arr1 = new ArrayList<Integer>(arr);
        int temp = arr1.get(swapPos.get(1));
        arr1.set(swapPos.get(1), arr1.get(swapPos.get(0)));
        arr1.set(swapPos.get(0), temp);
        
        int sorted = 1;
        
        for(int i=0;i<n;i++)
        {
        	//System.out.println(arr1.get(i)+" "+arr.get(i));
        }

        for(int i=0;i<n-1;i++)
        {
        	if(arr1.get(i) > arr1.get(i+1))
        	{sorted = 0; break;}
        }

        Collections.sort(swapPos);
        int revSorted = 1;
        for(int i=0;i<n && arr.size()>2;i++)
        {
        	if(i<n-1 && arr.get(i) > arr.get(i+1) )
        	{
        		//System.out.println("Pivot point is: "+arr.get(i));
        		rev.add(arr.get(i));
        		revPos.add(i);
        	}
    		if(i<n-1 && arr.get(i)<arr.get(i+1) && rev.size()!=0)
    		{rev.add(arr.get(i));revPos.add(i);}
    		if(i == n-1 && rev.size()!=0 && arr.get(i)<arr.get(i-1) && arr.get(i) > arr.get(revPos.get(0)-1))
    		{rev.add(arr.get(i));revPos.add(i);}
    		
        	//System.out.println(arr.get(i)+" --> "+rev);
        }
        if( n > 2 && rev.get(rev.size()-1) < revPos.get(0)-1)
        {revSorted = 0;}
        Collections.sort(revPos);
        
        if(sorted == 0 && revSorted ==1 && revPos.size()!=0)
        {
        	System.out.println("yes");
        	System.out.println("reverse "+ (revPos.get(0)+1)+" "+(revPos.get(revPos.size()-1)+1));
        }        
        if(sorted == 1 && revSorted == 1 && swapPos.size() == 0)
        {
        	System.out.println("yes");
        }
        if(sorted == 1 && swapPos.size() == 2)
        {
        	System.out.println("yes");
        	System.out.println("swap "+ (swapPos.get(0)+1)+" "+(swapPos.get(1)+1));
        }
        if(sorted == 0 && revSorted ==0 && revPos.size()==0)
        {System.out.println("no");}
        
        //System.out.println(revPos);

        scanner.close();
    }
}
