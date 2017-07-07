import java.io.*;
import java.util.*;
public class Count1
{
  
  public static void main(String args[])throws IOException
  {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String a=br.readLine();
  int l=a.length();
  int sum=0;
  int[]a1=new int[100];
  for(int i=0;i<l;i++)
  {
    char s=a.charAt(i);
        int n=(int)s;
        sum=sum+n;
         }sum=sum/l;
         char c=(char)sum;
         System.out.println(c);
         }
         }
