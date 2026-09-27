//Sum of elements of an array

//Brute Force

// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{1,2,3,4,5,6};

//         int sum = 0;

//         for(int i=0; i<arr.length; i++){
//             sum+=arr[i];
//         }

//         System.err.println(sum);
//     }
// }

//Print the sum of particular range in array
import java.util.*;

class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,11,7,9,4};

        Scanner sc = new Scanner(System.in);
        
        System.err.println("Enter start index");
        int start = sc.nextInt();
        System.err.println("Enter end index");
        int end = sc.nextInt();

        int sum = 0;

        for(int i=start; i<=end; i++){
            sum+=arr[i];
        }

        System.err.println(sum);
    }
}