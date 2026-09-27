//Code for sum of elements of array, where Q is query number (Q contains starting index and endng index)

//Brute Force -O(n*2)

// import java.util.*;

// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{2,5,3,11,7,9,4};

//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter Number of Queries: ");
//         int Q = sc.nextInt();

//         int sum = 0;

//         for(int i=1; i<=Q; i++){
//             System.out.println("Enter start index");
//             int start = sc.nextInt();
//             System.out.println("Enter end index");
//             int end = sc.nextInt();
//             for(int j=start; j<=end; j++){
//                 sum+=arr[j];
//             }
//             System.out.println("sum of range"+start+"-"+end+"is:"+sum);
//         }
//     }
// }

//Using Prefix sum - O(n)

import java.util.*;

class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Queries: ");
        int Q = sc.nextInt();

        int N = arr.length;
        int[] psArr = new int[N];

        psArr[0] = arr[0];

        for(int i = 1; i<N; i++){
            psArr[i] = psArr[i-1] + arr[i];
        }

        int sum = 0;

        for(int i=1; i<=Q; i++){
            System.out.println("Enter start index");
            int start = sc.nextInt();
            System.out.println("Enter end index");
            int end = sc.nextInt();

            if(start == 0){
                sum = psArr[end];
            }else{
                sum = psArr[end] - psArr[start-1];
            }
            System.out.println("sum of range "+start+" - "+end+" is: "+sum);
        }
    }
}
