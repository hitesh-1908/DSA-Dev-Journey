class MaxSubarrayBruteForce {

    public static void maxSumOfSubArray(int nums[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++)
        {
            int start = i;
            for(int j=i; j < nums.length; j++)
            {
                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++)
                {
                    System.out.print(nums[k]+" ");
                    currSum += nums[k];
                }
                System.out.println(" -> Sum = "+currSum);

                if(maxSum < currSum)
                    maxSum = currSum;
            }
            System.out.println();
        }
        System.out.println("Max Sum = "+maxSum);
    }

    public static void main(String[] args) {

        int arr[] = {1,-2,4,16,-4,20};
        maxSumOfSubArray(arr);
    }
}
