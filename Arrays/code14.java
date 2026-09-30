//Subarray

// In an array of size n , total no. of subarrays = n*(n+1)/2
//Count the the total number of subarrays - Brute Force - O(n*2)
// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{4,2,10,3,12,-2,15};
//         int count = 0;
//         for (int i = 0; i<arr.length; i++){
//             for(int j = i; j < arr.length; j++){
//                 count++;
//             }
//         }
//         System.out.println("Total SubArrays: " + count);
//     }
// }
//Printing the particular subarray(i,j) from the array
// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//         int start = 3;
//         int end = 7;
//         for (int i = start; i<=end; i++){
//             System.out.print(arr[i] + "\t");
//         }
//         System.out.println();
//     }
// }
//Printing all the subarrays
// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{2,4,1,3};
//         for (int i = 0; i<arr.length; i++){
//             for(int j = i; j < arr.length; j++){
//                 for(int k = i; k<=j;k++){
//                     System.out.print(arr[k]+"\t");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }
//Sum of all subarrays using Brute Force Approach - ){n**3}
// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{2,4,1,3};
//         int sum = 0;
//         for (int i = 0; i<arr.length; i++){
//             for(int j = i; j < arr.length; j++){
//                 sum = 0;
//                 for(int k = i; k<=j;k++){
//                     System.out.print(arr[k]+"\t");
//                     sum+=arr[k];
//                 }
//                 System.out.println("==>" + sum);
//             }
//         }
//     }
// }
//Sum of all sub arrays using prefix sum approach - O{n**2}
// class Arrays {

//     public static void main(String[] args) {
//         int[] arr = new int[]{2, 4, 1, 3};
//         int[] pArr = new int[arr.length];
//         int sum = 0;

//         pArr[0] = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             pArr[i] = arr[i] + pArr[i - 1];
//         }

//         // for (int i = 1; i < arr.length; i++) {
//         //     System.out.print(pArr[i]+" ");
//         // }
//         // System.out.println("");

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 if (i == 0) {
//                     sum = pArr[j];
//                 } else {
//                     sum = pArr[j] - pArr[i - 1];
//                 }
//                 System.out.println("==>" + sum);
//             }
//         }
//     }
// }


//Sum of all sub arrays using carry forward approach - O{n**2}
// class Arrays {

//     public static void main(String[] args) {
//         int[] arr = new int[]{2, 4, 1, 3};

//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum+=arr[j];
//                 System.out.println("==>" + sum);
//             }
//         }
//     }
// }

//Sum of all (sum of subarray)

class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                totalSum+=sum;
                System.out.println("==>" + sum);
            }
        }
        System.out.println("==>" + totalSum);
    }
}