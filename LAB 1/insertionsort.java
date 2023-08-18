//program for insertion sort in java

public class insertionsort 
//time complexity = O (n squared)
{
    public static void main(String[] args) 
    {
        int arr[]={9,8,4,6,4,2,1,2,5,6,7,20,21,5,7};
        int len= arr.length;
        
        for(int i=1; i<len; i++)
        {
            int element = arr[i];
            int j = i-1;
            while(j>=0 && element<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]=element;
        }

            //printing the sorted array
            for(int i=0;i<len;i++)
            {
                System.out.println(arr[i]);
                System.out.println(" ");
            }

    }
}
