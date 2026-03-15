import java.util.Scanner;

class SortedMatrix {
    public static boolean searchInSortedMatrix(int matrix[][], int key)
    {
        int row=0, col = matrix[0].length-1;
        
        while (row < matrix.length && col >= 0)
        {
            //Here we use the Staircase Approach 2nd logic i.e. we started from last column sell and searched for key if key > cell value then we move Bottom(row++) else key < cell value we move Left(col--) 
            if(matrix[row][col] == key)
            {
                System.out.println("Found "+key+" at ("+row+","+col+")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println(key+" Does not exist!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                            {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {30,33,39,50},
        };

        int key = 33;
        
        searchInSortedMatrix(matrix,key);
    }
}
