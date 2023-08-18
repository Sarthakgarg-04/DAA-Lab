//Program for linear search in java

// import java.util.*;

public class linearsearch
{
    public static void main(String [] args)
    {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,};
        
        // number to find in the array
        int n = 13;
        int x = 0;

        for(int i=0;i<9;i++)
        {
            if (arr[i] == n)   
            {
                System.out.println("The number exists in the array at position " + i);
                x = x+1;
            }
            
        }

        if (x == 0)
        {
            System.out.println("The number does not exist in the given array");
        }
    }
}
