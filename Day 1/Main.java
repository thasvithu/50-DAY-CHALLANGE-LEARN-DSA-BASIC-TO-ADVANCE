public class Main {
    int[] findTarget() {
        int numArray[] = {2, 7, 11, 15};
        int target = 9;
        
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == target) {
                    return new int[]{i, j}; // anonymous integer array 
                }
            }
        }
        return null; // If no such pair is found
    }

    public static void main(String[] args) {
        Main obj = new Main();

        int[] result = obj.findTarget();

        if (result != null)
            System.out.println("[" + result[0] + "," + result[1] + "]");
        else
            System.out.println("No pair found.");
    }
}
