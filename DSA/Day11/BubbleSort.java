class BubbleSort {
    public static void bubbleSort(int nums[])
    {
        for(int turn=0; turn < nums.length-1; turn++)
        {
            int swap = 0;
            
            for(int j=0; j < nums.length-1-turn; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    //if the 1st element is greater than next element then swap them
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0)
                break;
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
        bubbleSort(arr);
        printArray(arr);
    }
}
