//Code for sum of elements of array, where Q is query number (Q contains starting index and endng index)

//Brute Force

import java.util.*;

class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,11,7,9,4};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Queries: ");
        int Q = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=Q; i++){
            System.out.println("Enter start index");
            int start = sc.nextInt();
            System.out.println("Enter end index");
            int end = sc.nextInt();
            for(int j=start; j<=end; j++){
                sum+=arr[j];
            }
            System.out.println("sum of range"+start+"-"+end+"is:"+sum);
        }
    }
}

