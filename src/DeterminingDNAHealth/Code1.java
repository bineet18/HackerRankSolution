package DeterminingDNAHealth;

import java.util.*;

public class Code1 {
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> genes = new ArrayList<String>();
        String[] genesItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) 
        {
        	String genesItem = genesItems[i];
            genes.add(genesItem);
        }

        ArrayList<Integer> health = new ArrayList<Integer>();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) 
        {
            health.add(scanner.nextInt());
        }

        int s = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int unhealtiest = 0;
        int healtiest = 0;        

        for (int sItr = 0; sItr < s; sItr++) 
        {
        	HashMap<String, Integer> arr = new HashMap<String, Integer>();
            int first = scanner.nextInt();
            int last = scanner.nextInt();
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String d = scanner.nextLine();
            
            for(int i=first; i<=last;i++)
            {
            	if(!arr.containsKey(genes.get(i)))
            	{arr.put(genes.get(i), health.get(i));}
            	else
            	{{arr.put(genes.get(i), health.get(i) + arr.get(genes.get(i)));}}
            	
            }
            System.out.println(arr);
            
            Object[] obj = arr.keySet().toArray(); 

            int healthcount = 0;
            for(int j=0;j<obj.length;j++)
            {
                int lastIndex = 0;
                int count = 0;
            	while(lastIndex != -1)
	            {
	
	                lastIndex = d.indexOf(obj[j].toString(),lastIndex);
	
	                if(lastIndex != -1)
	                {
	                    count ++;
	                    if(obj[j].toString().length() > 1) lastIndex += (obj[j].toString().length()-1);
	                    else lastIndex += (obj[j].toString().length());
	                }
	            }
            	System.out.println(obj[j]+" --> "+count);
            	
            	healthcount += (count*arr.get(obj[j]));
            }
            
            healtiest = Math.max(healtiest, healthcount);
            unhealtiest = Math.min(unhealtiest, healthcount);
            
        }
        
        System.out.println(unhealtiest + " " + healtiest);

        scanner.close();
    }
}
