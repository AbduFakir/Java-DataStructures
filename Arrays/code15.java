//Maximum subarray sum

//1.Brute Force - O(N^3)
// class Arrays {
//     public static void main(String[] args) {
//         int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += arr[k];
//                 }
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         System.out.println("MAx Sum:" + maxSum);
//     }
// }
//Using Carry Forward method O(N^2)
// class Arrays {
//     public static void main(String[] args) {
//         int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//                 int sum = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
//         System.out.println("MAx Sum:" + maxSum);
//     }
// }
//Using Prefix sum - O(N^2)
class Arrays {

    public static void main(String[] args) {

        int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] pArr = new int[arr.length];

        pArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pArr[i] = pArr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(pArr[i]+" ");
        }
        System.out.println("");

        int maxSum = Integer.MIN_VALUE;
        int sum ;

        for(int i = 0; i<arr.length; i++){
            // int sum = 0;
            for(int j =i ; j<arr.length; j++){
                if(i==0){
                    sum = pArr[j];
                }
                else{
                    sum = pArr[j] - pArr[i-1];
                }

                if (sum > maxSum)
                    maxSum = sum;
            }
        }

        System.out.println("Max Sum : " + maxSum);
    }
}

