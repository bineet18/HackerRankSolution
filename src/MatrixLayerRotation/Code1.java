package MatrixLayerRotation;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);

    	int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp;
        
        for(int i=0;i<m; i++)
        {
        	temp = new ArrayList<Integer>();
        	for(int j=0;j<n;j++)
        	{
        		temp.add(in.nextInt());
        	}
        	matrix.add(temp);
        }
        
        for(int i=0;i<m;i++)
        {
        	System.out.println(matrix.get(i));
        }
        System.out.println("");
        int temp1=0,temp2=0,temp3=0,temp4=0;
        
        temp1 = matrix.get(0).get(0);// 0 has to be parametrised
        temp2 = matrix.get(m-1).get(0);// 0 has to be parametrised
        temp3 = matrix.get(m-1).get(n-1);// 0 has to be parametrised
        temp4 = matrix.get(0).get(n-1);// 0 has to be parametrised
        
        for(int i=0;i<n-1;i++)
        {
        	matrix.get(0).set(i, matrix.get(0).get(i+1));
        }
        for(int i=0;i<m;i++)
        {
        	System.out.println(matrix.get(i));
        }
        System.out.println("");
        
        
        
        for(int i=m-1;i>0;i--)
        {
        	matrix.get(i).set(0, matrix.get(i-1).get(0));
        }
        for(int i=0;i<m;i++)
        {
        	System.out.println(matrix.get(i));
        }
        System.out.println("");
        
        
        
        for(int i=n-1;i>0;i--)
        {
        	matrix.get(m-1).set(i, matrix.get(m-1).get(i-1));
        }
        for(int i=0;i<m;i++)
        {
        	System.out.println(matrix.get(i));
        }
        System.out.println("");
        
        
        
        for(int i=0;i<m-1;i++)
        {
        	matrix.get(i).set(n-1, matrix.get(i+1).get(n-1));
        }
        for(int i=0;i<m;i++)
        {
        	System.out.println(matrix.get(i));
        }
        
        
        
        
        
        System.out.println("");
        
        for(int i=0;i<m;i++)
        {
        	System.out.println(matrix.get(i));
        }
        
        in.close();
    }
}
