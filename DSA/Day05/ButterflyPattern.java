public class ButterflyPattern {

    public static void butterfly_pattern(int n)
    {
        //for 1st half
        for(int i = 1; i<=n; i++)
        {
            {
                //for stars to print till-i
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                //for spaces - 2*(n-i)
                for(int j = 1; j<=2*(n-i); j++)
                {
                    System.out.print("  ");
                }

                //for stars to print till-i
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        //for 2nd half
        for(int i = n; i>=1; i--)
        {
            {
                //for stars-i
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                //for spaces - 2*(n-i)
                for(int j = 1; j<=2*(n-i); j++)
                {
                    System.out.print("  ");
                }

                //for stars-i
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly_pattern(5);
    }
}
