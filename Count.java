import java.io.*;
import java.util.*;
public class Count
{
  
  public static void main(String args[])throws IOException
  {
    
 
    int n;
     // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Scanner s=new Scanner(System.in);
          n=s.nextInt();
          int sum=0;
            int rem=0;
          while(n!=0)
          {
           rem=n%10;
           sum++;
           n=n/10;
           }
           System.out.println(sum);
           }
           } 
            
