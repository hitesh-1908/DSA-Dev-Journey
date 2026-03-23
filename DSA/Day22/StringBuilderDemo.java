class StringBuilderDemo {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("");
        System.out.println("Before Appending: "+sb);
        System.out.println("Length = "+sb.length());

        for(char ch = 'A'; ch <= 'Z';ch++)
        {
            sb.append(ch);
        }
      // Time Complexity will be O(26) & not O(26 * N^2) as if String is given as a input
      
        System.out.println("After Appending: "+sb);
        System.out.println("Length = "+sb.length());
    }
}
