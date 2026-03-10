class MaxSubarrayPrefixSum {

    public static void maxSumOfSubArray(int nums[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        //For calculating Prefix Sum of array
        for(int i = 1; i< nums.length; i++)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i < nums.length; i++)
        {
            int start = i;
            for(int j=i; j < nums.length; j++)
            {
                int end = j;
                currSum = 0;

                //Ternary Operation used bcoz in last we are doing prefix[start-1]
                //& suppose it goes to -1 as -1 is out of bounds so it will give us an error therefore we used this condition
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum)
                    maxSum = currSum;
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }

    public static void main(String[] args) {

        int arr[] = {1,-2,4,16,-4,20};
        maxSumOfSubArray(arr);
    }
}
