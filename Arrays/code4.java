
//Reverse an array using new array

//Brute Force

// class Arrays{
//     public static void main(String[] args){
//         int[] arr = new int[]{1,2,3,4,5,6};
//         int[] rev_arr = new int[arr.length];

//         for(int i=0; i<arr.length; i++){
//             rev_arr[arr.length -i-1] = arr[i];
//         }

//         for(int i=0; i<arr.length; i++){
//             System.err.println(rev_arr[i]);
//         }
//     }
// }


//Bit Optimized

class Arrays{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};

        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i]=arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.err.println(arr[i]);
        }
    }
}