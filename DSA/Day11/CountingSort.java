class CountingSort {
    public static void countingSort(int nums[])
    {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            largest = Math.max(largest,nums[i]);
        }

        int count[] = new int[largest+1];
        //For counting frequency
        for(int i=0; i<nums.length; i++)
        {
            count[nums[i]]++;
        }

        //Now Sorting
        int j=0;

        for(int i=0; i<count.length; i++)
        {
            while (count[i] > 0)
            {
                nums[j] = i;
                j++;
                count[i]--;
            }
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
        countingSort(arr);
        printArray(arr);
    }
}
