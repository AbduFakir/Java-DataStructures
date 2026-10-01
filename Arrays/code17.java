//Matrix

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "\t");
//             }
//             System.out.println("");
//         }
//     }
// }

//Iterate through matric column by coulmn

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//         for (int i = 0; i < arr[0].length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[j][i] + "\t");
//             }
//             System.out.println("");
//         }
//     }
// }

// //Row-wise sum of entire array

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum = 0;
//             for (int j = 0; j < arr[i].length; j++) {
//                 sum+=arr[i][j];
//             }
//             System.out.println("Sum of row " + i+1 + ": " + sum);
//         }
//     }
// }

//Column-wise sum of entire array

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//         int sum = 0;
//         for (int i = 0; i < arr[0].length; i++) {
//             sum = 0;
//             for (int j = 0; j < arr.length; j++) {
//                 sum+=arr[j][i];
//             }
//             System.out.println("Sum of Column " + i+1 + ": " + sum);
//         }
//     }
// }

//Sum of entire matrix

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 sum+=arr[i][j];
//             }
//         }
//         System.out.println("Sum of matrix " + sum);
//     }
// }

//Print left diagonal of matrix

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

//         for (int i = 0; i < arr.length; i++) {
    
//             System.out.print(arr[i][i] + "\t");
            
//         }
//         System.out.println("");
//     }
// }


//Print right diagonal of a square matrix

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//         for (int i = 0; i < arr.length; i++) {
    
//             System.out.print(arr[i][arr.length - i -1] + "\t");
            
//         }
//         System.out.println("");
//     }
// }

//Matrix of size N X M => print all the diagonals (R->L)

class Matrix {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}};

        for (int i = 0; i < arr.length; i++) {
    
            System.out.print(arr[i][i] + "\t");
            
        }
        System.out.println("");
    }
}