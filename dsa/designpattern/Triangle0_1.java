public class Triangle0_1 {
    public static void triangle_0_1Pattern(int n)
    {
        for(int i=1; i<=n ; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        triangle_0_1Pattern(6);
    }
}
