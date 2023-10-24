public class Main {
    int[] numArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = 0;
    
    int findMaxSubArray() {
        for (int i = 0; i < numArray.length; i++) {
            int sum = 0;
            for (int j = i; j < numArray.length; j++) {
                sum = numArray[j] + sum;
                maxSum = Math.max(sum, maxSum);
            }
        }
        
        return maxSum;
    }


    int maxSUM = numArray[0];
    int sum = numArray[0];
    
    int kadanesAlgorithm() {
        for (int i = 1; i < numArray.length; i++) {
            if (sum >= 0)
                sum = sum + numArray[i]; // Extend the current subarray
            else
                sum = numArray[i]; // Start a new subarray
        
            if (sum > maxSUM)
                maxSUM = sum;
        }
        return maxSUM;
    }
    


    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println(obj.findMaxSubArray());
        System.out.println(obj.kadanesAlgorithm());
    }
}