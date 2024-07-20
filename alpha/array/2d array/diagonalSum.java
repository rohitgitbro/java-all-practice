// package 2d array;

public class diagonalSum {

    public static int dSum(int matrix[][]){
        int sum=0;
        // time complexity o(n^2)

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         // for primary diagonal
        //         if(i==j){
        //             sum+=matrix[i][j];

        //         }
        //         else if(i+j==matrix.length-1){
        //               sum+=matrix[i][j];
        //         }
        //     }
        // }
         
        //time complexity o(n)
        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            sum+=matrix[i][i];
            // for secondary diagonal
            if(i != matrix.length-1-i) // jyare (odd n hoi tyare)3 row valo matrix hoi tyare check i != j
            sum+=matrix[i][matrix.length-1-i];  // i+j = n-1 parthi so j=n-1-i

         }
         return sum;
    }
    public static void main(String args[]){
        int matrix[][]={ {1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10,11,12}
                    };
      System.out.println(dSum(matrix));             
    }
    
}
