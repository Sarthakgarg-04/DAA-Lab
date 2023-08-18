// program for bubble sort in java

// import java.util.Scanner;

public class bubblesort
//time complexity = O(n squared)
{
    public static void main(String[] args)
    {
        int arr[]={9,8,4,6,4,2,1,2,5,6,7,20,21,5,7};
        int len= arr.length;

        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //printing the sorted array
        for(int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
            System.out.println("");
        }

    }
}

 // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter a string value");
        // String sample = scan.nextLine();

        // System.out.println("string entered is "+sample);

