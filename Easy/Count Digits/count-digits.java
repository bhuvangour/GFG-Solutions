//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
 static int evenlyDivides(int N){
        // code here
        
        int count = 0;
        int x = N;
      
        while(x > 0) {
            
           int womp = x % 10;
           
           if(womp != 0 && N % womp == 0) {
               count++;
           }
           
           x = x / 10;
        }
        
        return count;
        
    }
}