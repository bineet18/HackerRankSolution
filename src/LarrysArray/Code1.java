package LarrysArray;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) 
        {
            int n = scanner.nextInt();
            ArrayList<Integer> A = new ArrayList<Integer>();


            for (int i = 0; i < n; i++) 
            {
                A.add(scanner.nextInt());
            }
            System.out.println(A.indexOf(3));

            
            for(int i=0;i<n;i++)
            {

            	if(A.size() == 1 || A.size() == 2)
            	{System.out.println("NO");break;}
            	else if(A.size() ==3 &&(A.get(0) == 1 && A.get(1)!=2))
            	{System.out.println("NO");break;}
            	else if(A.size() ==3 &&(A.get(0) == 1 && A.get(1)==2))
            	{System.out.println("YES");break;}
            	
            	else
            	{

                    if(A.get(i)==i+1)
	            	{continue;}
	            	else
	            	{
		            	int index = A.indexOf(i+1);
		            	int NoOfRotations = 0;
		            	
		            	while((index-i) !=0)
		            	{
			            	ArrayList<Integer> arr= new ArrayList<Integer>();
		                    index = A.indexOf(i+1);
			            	System.out.println("For "+ (i+1)+" distance from Required position is "+ (index - i));
			            	
		            		if(index-i >= 1)
		            		{
		            			arr.add(A.get(index-2));arr.add(A.get(index-1));arr.add(A.get(index));
		            			System.out.println("Before rotation: "+arr);
		            			Collections.rotate(arr, -1);
		            			A.set(index-2, arr.get(0));
		            			A.set(index-1, arr.get(1));
		            			A.set(index, arr.get(2));
		            			System.out.println("After Rotation: "+arr);
		            		}
		            		else if(index - i == 0)
		            		{continue;}
		            		else
		            		{
		            			arr.add(A.get(index-1));arr.add(A.get(index)); arr.add(A.get(index+1));
		            			System.out.println("Before rotation: "+arr);
		            			Collections.rotate(arr, -1);
		            			A.set(index-1, arr.get(0));
		            			A.set(index, arr.get(1));
		            			A.set(index+1, arr.get(2));
		            			System.out.println("After Rotation: "+arr);
		            		}
		            		
		            		System.out.println("New Array:"+A);
		            		
		            		NoOfRotations++;
		            		
		            		
		            		
		            		if(NoOfRotations ==3)
	            			{break;}
		            	}
		            	
		            	//System.out.println("For "+(i+1)+ " index is "+index);
		            	//if(index - 1 == 0)
		            	//{arr.add(A.get(index-1));arr.add(A.get(index));arr.add(A.get(index+1));}
		            	//if(index - 2 == 0)
		            	//else
		            	//{arr.add(A.get(index-2));arr.add(A.get(index-1)); arr.add(A.get(index));}
		            	//System.out.println("For "+ (i+1)+" Array is: "+arr);
		            	
		            	//Collections.rotate(arr, -1);
		            	//System.out.println(arr);
		            	
	            	}
            	}
            	
            	
            }
        }
        scanner.close();
    }

}
