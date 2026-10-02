// Convert tht matrix of size N X N to its transpose matrix

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         System.out.println();

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1 ; j < arr[i].length; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "\t");
//             }
//             System.out.println();
//         }
//     }
// }


//Given matrix of N X N. 
//My Logic - first make the transpose and then exchange the columns.

// class Matrix {

//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         System.out.println();

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1 ; j < arr[i].length; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0 ; j < arr[i].length/2; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[i][arr.length-j-1];
//                 arr[i][arr.length-j-1] = temp;
//             }
//         }


//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "\t");
//             }
//             System.out.println();
//         }
//     }
// }

//Print the boundary in clockwise fashion

// class Matrix{
//     public static void main(String[] args) {
//         int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         for(int i = 0; i<arr.length-1; i++){
//             System.out.println(arr[0][i]);
//         }
//         System.out.println("");

//         for(int i = 0; i<arr.length-1; i++){
//             System.out.println(arr[i][arr.length-1]);
//         }
//         System.out.println("");

//         for(int i = arr.length - 1; i >=1; i--){
//             System.out.println(arr[arr.length-1][i]);
//         }
//         System.out.println("");

//         for(int i = arr.length - 1; i >=1; i--){
//             System.out.println(arr[i][0]);
//         }
//         System.out.println("");

//     }
// }

//Given a N X N Matrix . Print it in spiral fashion.

class Matrix{
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int N = arr.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(N>=0){
            i = j = k;
            for(int x = 0; x < N-1; x++){
                System.out.println(arr[i][j]);
                j++;
            }
            System.out.println("");

            for(int x = 0; x < N-1; x++){
                System.out.println(arr[i][j]);
                i++;
            }
            System.out.println("");

            for(int x = 0; x < N-1; x++){
                System.out.println(arr[i][j]);
                j--;
            }
            System.out.println("");

            for(int x = 0; x < N-1; x++){
                System.out.println(arr[i][j]);
                i--;
            }

            N-=2;
            k++;

        }

    }
}