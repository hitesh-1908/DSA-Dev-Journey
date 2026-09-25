public class HollowRectangle {
    public static void hollowPattern(int lines,int cols) {
        for(int i=1; i<=lines; i++)
        {
            for(int j=1; j<=cols; j++)
            {
                if(i == 1 || j == 1 || i == lines || j == cols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
\
    static void main(String[] args) {
        hollowPattern(7,15);
    }
}
