package endOfFile;

import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        int j = 0;
		while(sc.hasNext())
		{
			StringBuilder para = new StringBuilder(sc.nextLine());
			para.replace(0, 0, String.valueOf(++j)+ " ");
			System.out.println(para);
		} 
        sc.close();
    }
}
