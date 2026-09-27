// Find the second largest element in an array

//Brute force

class Arrays{
    public static void main(String[] args){
        int[] arr = new int[]{1,4,7,3,4,7,5,9,4,2,3};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
        }

        System.out.println(second_largest);
    }
}