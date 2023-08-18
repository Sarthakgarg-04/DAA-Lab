//program for binary search in java

import java.util.*;

public class binaarysearch {
    public static void main(String[] args)
     {
        System.out.println("enter the no. of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array");
        int i=0;
        while(i<n)
        {
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("enter the element to be searched");
        int a=sc.nextInt();
        binarysearch(arr,0,n-1,a);
    }
    public static void binarysearch(int[] arr, int l,int r,int a)
    {
        if(l>r)
        {
            return;
        }
        int mid=(l+r)/2;
        if(arr[mid]==a)
        {
            System.out.println(mid);
            System.out.println("Element found at position "+ mid); 
        }
        else if(arr[mid]<a)
        {
            binarysearch(arr,mid+1,r,a);
        }
        else
        {
            binarysearch(arr,l,mid-1,a);
        }
    }
}
