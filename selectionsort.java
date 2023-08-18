//program for selection sort in java

public class selectionsort 
//time complexity = O(n squared)
{
    public static void main(String[] args)
    {
        int arr[]={9,8,4,6,4,2,1,2,5,6,7,20,21,5,7};
        int len= arr.length;
        
        for(int i=0; i<len-1; i++)
        {
            int min=i;
            for(int j=i+1; j<len; j++)
            {
                //for dercending order
                // if(arr[min]<arr[j])
                // {
                //     min=j;
                // }

                //for ascending order
                if(arr[min]>arr[j])
                {
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

         //printing the sorted array
         for(int i=0;i<len;i++)
         {
             System.out.println(arr[i]);
             System.out.println("");
         }

    }
}
