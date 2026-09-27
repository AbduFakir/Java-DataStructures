

//In Place Prefix Sum

class Arrays{
    int[] rangeSum(int[] arr){

        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }
}

class Client{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        
        Arrays obj = new Arrays();

        int[] psArr = obj.rangeSum(arr);

        for(int i = 0; i<psArr.length;i++){
            System.out.print(psArr[i]+ " ");
        }
    }
}