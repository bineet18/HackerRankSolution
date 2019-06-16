package ModifiedKaprekarNumbers;

import java.util.*;

public class Code1 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int p = scanner.nextInt();
        int q = scanner.nextInt();
        ArrayList<Long> num = new ArrayList<Long>();
        for(long i=p;i<=q; i++)
        {
        	long sq = i*i;
        	String square = Long.toString(sq);
        	int l,r;
        	
        	if(square.length() % 2 ==0)
        	{l = square.length()/2; r = square.length()/2;}
        	else
        	{l=(square.length() - 1)/2; r = (square.length() +1)/2;}
        	String leftNumS = "0"; 
        	String rightNumS = "0";
        	
        	for(int j=0; j<l;j++)
        	{leftNumS += square.charAt(j);}
        	for(int j=l; j<(l+r);j++)
        	{rightNumS += square.charAt(j);}
        	int leftNum = Integer.parseInt(leftNumS);
        	int rightNum = Integer.parseInt(rightNumS);
             	
        	if(leftNum + rightNum == i)
        	{num.add(i);}
        }
        if(num.size() == 0)
        {System.out.print("INVALID RANGE");}
        else
        {
        	for(int i =0; i<num.size();i++)
        	{System.out.print(num.get(i)+" ");}
        }
        scanner.close();
    }
}
