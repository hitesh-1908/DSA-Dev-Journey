class InsertionSort {
    public static void insertionSort(int nums[])
    {
        for(int i=1; i<nums.length; i++)
        {
            int curr = nums[i];
            int prev = i-1;

            //finding out the correct position to insert & nums[prev] > curr this condN is for asc order if u reverse it will be in desc
            while(prev >= 0 && nums[prev] > curr)
            {
                nums[prev+1] = nums[prev];
                prev--;
            }

            //insertion
            nums[prev+1] = curr;
        }
    }

    public static void printArray(int num[])
    {
        for(int i=0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5,1,4,3,2};
        insertionSort(arr);
        printArray(arr);
    }
}
