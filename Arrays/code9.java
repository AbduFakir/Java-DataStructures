//Array Rotation

//Brute Force

class Arrays{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};

        int R =2;

        int N = arr.length;


        int rArray[] = new int[N];

        int index = 0;

        for(int i = 0; i<N; i++){
            if(i<R){
                rArray[i] = arr[N - R +i];
            }else{
                rArray[i] = arr[index];
                index++;
            }
        }

        for(int i = 0; i<N; i++){
            System.out.println(rArray[i]);
        }
    }
}