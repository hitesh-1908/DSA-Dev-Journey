class KadanesAlgorithm {
    public static void kadanesAlgorithm(int nums[])
    {
        //For MaxSum
        int ms = Integer.MIN_VALUE;

        //For Current Sum
        int cs = 0;

        for (int i=0; i < nums.length; i++)
        {
            cs = cs + nums[i];

            if(cs < 0)
            {
                cs = 0;
            }

            ms = Math.max(ms,cs);
        }
        System.out.println("Max Sum of Subarray = "+ms);
    }

    public static void main(String[] args) {

        int arr[] = {1,-2,4,16,-4,20};
        kadanesAlgorithm(arr);
    }
}
