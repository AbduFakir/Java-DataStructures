//find the transition point

class Arrays{
    public static void main(String[] args) {
        int[] arr =new int[]{0,0,0,0,0};

        int flag = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                System.out.println("Transition Point: "+ i);
                flag = 1;
            }
        }

        if (flag == 0){
            System.out.println("-1");
        }

    
    }
}