//Return the count of pairs(i,j) with Arr[i] + Arr[j] = K ---------(K=10)


// Brute Force

class Arrays{
    public static void main(String[] args){
        int[] arr = new int[]{3,5,2,1,-3,7,8,15,6,13};
        int K = 10;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length;j++){
                if((i !=j)&&(arr[i] + arr[j] == K)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}