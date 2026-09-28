//Maximun Element from index 0 to i

// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{3,4,5,1,2,7,9,8};

//         int start = 0;
//         int end = 3;

//         int max =Integer.MIN_VALUE;

//         for(int i=start; i<=end; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         System.out.println("Max: "+ max);
//     }
// }

//Leftmax Array (Carry Forward)

// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
//         int[] Leftmax = new int[arr.length];

//         Leftmax[0] = arr[0];

//         for(int i=1; i<Leftmax.length; i++){
//             if(arr[i] > Leftmax[i-1]){
//                 Leftmax[i] = arr[i];
//             }else{
//                 Leftmax[i] = Leftmax[i-1];
//             }
//         }
//         for(int i=0; i<Leftmax.length; i++){
            
//             System.out.print(Leftmax[i] + ",");
//         }
//     }
// }

//Rightmax Array (Carry Forward)

class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int[] Rightmax = new int[arr.length];

        Rightmax[arr.length - 1] = arr[arr.length -1];

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > Rightmax[i+1]){
                Rightmax[i] = arr[i];
            }else{
                Rightmax[i] = Rightmax[i+1];
            }
        }
        for(int i=0; i<Rightmax.length; i++){
            
            System.out.print(Rightmax[i] + ",");
        }

    }
}