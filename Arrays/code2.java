//count of atleast one number greater a number

//Brute Force Approach

// class Arrays {
//     public static void main(String[] args){
//         int[] arr = new int[]{2,5,1,4,8,0,8,1,3,8};

//         int isgreator = 0;

//         for(int i=0; i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if (arr[j]>arr[i]){
//                     isgreator++;
//                     break;
//                 }
//             }
//         }
//         System.out.println("Number of elements greater than their preceding elements: " + isgreator);
//     }
// }


//Optimized Approach

class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,4,8,0,8,1,3,8};

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int max_count = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==max){
                max_count++;
            }
        }

        System.out.println("final answer: " + (arr.length - max_count));
    }
}