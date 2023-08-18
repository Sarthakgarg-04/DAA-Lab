//program for linear search in java using recursion

public class linearsearchrecursive {

    public static int linearsearch(int arr[], int len, int n)
    {
        if (len == 0) {
            return -1;
        }
        else if (arr[len - 1] == n) {
            return len - 1;
        }
        return linearsearch(arr, len - 1, n);
    }

    public static void main(String[] args)
    {
        int arr[] = { 15,43,6,67,23,756,45,345,2,3,234,78 };
        // n is the number being searched for in the array
        int n = 3;

        int index = linearsearch(arr, arr.length, n);
        if (index != -1)
            {System.out.println("The element ," + n + " is found at position " + index );}

        else
            {System.out.println("Element not found");}
    }
}