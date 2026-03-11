class SelectionSort {
    public static void selectionSort(int nums[])
    {
        for(int turn=0; turn < nums.length-1; turn++)
        {
            int minPos = turn;

            for(int j=turn+1; j < nums.length; j++)
            {
                //for asc use > & for desc use <
                if(nums[minPos] > nums[j])
                {
                    minPos = j;
                }
            }
            //Swap
            int temp = nums[minPos];
            nums[minPos] = nums[turn];
            nums[turn] = temp;
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
        selectionSort(arr);
        printArray(arr);
    }
}
