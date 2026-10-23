public class MergeSort {
    
    public static void merging(int[] arr, int low, int mid, int high)
    {
        int temp[] = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        //compare
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //Copying remaining Values
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copying back to original array
        for(i = low, k = 0; i <= high; i++, k++)
        {
            arr[i] = temp[k];
        }
    }

    static void mergeSort(int[]arr, int low, int high)
    {
        if(low >= high)
        {
            return;
        }

        int mid = low + (high - low ) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid+1, high);

        merging(arr, low, mid, high);
    }

    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 4, 8, 5, 6, 3, 7, 2, 1};

        System.out.println("Before Sorting: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length-1);
        System.out.println("\nAfter Sorting: ");
        printArray(arr);

    }
}
