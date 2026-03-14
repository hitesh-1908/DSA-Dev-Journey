import java.util.Scanner;

class 2DArrayCreation {
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        //Calculating size of rows & columns
        // use matrix.length for rows & matrix[0].lenght to find columns
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("Enter value of Index ("+i+","+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
