//Kadane's Algorithm - Joseph Kadane - O(N)

/*

Algorithm : 
    1. sum = sum + arr[i]
    2. maxSum = sum
    3. if sum < 0  =>  sum = 0

*/

// Finding the maximum sum of subarray using Kadane's Algo - O(N)

// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

//         int sum = 0;
//         int maxSum = Integer.MIN_VALUE;
        

//         for(int i = 0; i<arr.length; i++){
//             sum +=arr[i];

//             if(sum>maxSum){
//                 maxSum = sum;
//             }

//             if(sum<0)
//                 sum = 0;
//         }

//         System.out.println("Max Sum :" + maxSum);
//     }
// }

//printing the subarray with maximum sum using kadane's algo.

class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = -1;
        int end = -1;

        for(int i = 0; i<arr.length; i++){

            if(sum == 0){
                start = i;
            }
            sum +=arr[i];

            if(sum>maxSum){
                maxSum = sum;
                end = i;
            }

            if(sum<0){
                sum = 0;
            }
        }

        for(int i =start ; i <=end; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        System.out.println("Max Sum :" + maxSum);
    }
}