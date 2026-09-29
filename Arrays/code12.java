//Equilibrium Index

//Brute Force

// class Arrays{
//     public static void main(String[] args) {
//         int[] arr = new int[]{-7,1,5,2,-4,3,0};

//         int leftSum = 0;
//         int rightSum = 0;

//         int flag = 0;

//         for(int i = 0; i<arr.length; i++){
//             leftSum = 0;
//             rightSum = 0;
//             for(int j = 0; j<arr.length; j++){
//                 if (j==i)
//                     continue;
//                 if(j<i)
//                     leftSum+=arr[j];
//                 if(j>i)
//                     rightSum+=arr[j];
//             }
//             if (leftSum == rightSum){
//                 flag = 1;
//                 System.out.println("Equilibrium index: "+i);
//                 break;
//             }
//         }

//         if(flag==0)
//             System.out.println("-1");
//     }
// }

//Optimized Using Prefix-Sum


class Arrays{
    public static void main(String[] args) {
        int[] arr = new int[]{-7,1,5,2,-4,3,0};

        int leftSum = 0;
        int rightSum = 0;
        int flag = 0;

        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i]; 
        }

        for(int i = 0; i<arr.length; i++){
            if(i ==0){
                if((arr[arr.length-1])-arr[i] == 0){
                    System.out.println("Equilibrium Index :"+i);
                    flag =1;
                    break;
                }
            }else{
                leftSum = arr[i-1];
                rightSum = arr[arr.length-1] - arr[i];

                if (leftSum == rightSum){
                    System.out.println("Equilibrium Index : "+i);
                    flag= 1;
                    break;
                }

            }
        }

        if(flag==0)
            System.out.println("-1");

    }
}