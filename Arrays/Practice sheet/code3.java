//Sum of left diagonal and right diagonal and total sum.


class Matrix{
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        int leftSum = 0;
        int rightSum = 0;

        for(int i =0; i<arr.length; i++){
       
                leftSum += arr[i][i];
                rightSum+= arr[i][arr.length-i-1];
            }
     


            System.out.println("LeftSum: "+leftSum);
            System.out.println("RightSum: "+rightSum);
            System.out.println("TotalSum: "+ (leftSum+rightSum));
    }
}