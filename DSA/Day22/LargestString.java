class LargestString {
    public static String printLargestString(String str[])
    {
        String largest = str[0];

        for(int i=1; i<str.length; i++)
        {
            if(largest.compareToIgnoreCase(str[i]) < 0)
            {
                largest = str[i];
            }
        }

        return largest;
    }

    public static void main(String[] args)
    {
        String word[] = {"apple", "Mango","banaNa"};
        System.out.println(printLargestString(word));
    }
}
