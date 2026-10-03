//Check if the array is sorted in non-decreasing order

class Solution{
    public int isSorted(int[] arr){
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return 0;
            }
        }
        
        return 1;
    }
}

class Client{
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = new int[]{10,60,30,40,50};
        int ans = s.isSorted(arr);
        
        System.out.println(ans);
    }
}