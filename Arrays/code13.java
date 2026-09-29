//Sub-Array

//Find the length of smallest subarray which contains bot minimum and maximum element
class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 3, 4, 6, 4, 6, 3};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIndex = i;
            } else if (arr[i] == max) {
                maxIndex = i;
            }

            if (minIndex != -1 && maxIndex != -1) {

                if (Math.abs(maxIndex - minIndex) + 1 < minLength) {
                    minLength = Math.abs(minIndex - maxIndex) + 1;
                    System.out.println("Max: " + maxIndex);
                    System.out.println("Min: " + minIndex);
                }
            }
        }

        // System.out.println("Max: " + maxIndex);
        // System.out.println("Min: " + minIndex);
        System.out.println("Min Lenght: " + minLength);

    }
}
