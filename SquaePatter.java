import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		int n;
        Scanner sc=new Scanner(System.in);
        
         n=sc.nextInt();
        if(n>=0 && n<=50)
        {
            int i=1;
            while(i<=n)
            {
                
                int spaces=1;
                while(spaces<=n-i)
                {
                    System.out.print(" ");
                    spaces++;
                }
                int j=1;
                    while(j<=i)
                    {
                        
                        System.out.print("*");
                        j++;
                    }
                int remain=1;
                while(remain<=i-1)
                {
                    System.out.print("*");
                    remain++;
                }
                
                
                
                i++;
                System.out.println();
            }
        }
		
	}

}
