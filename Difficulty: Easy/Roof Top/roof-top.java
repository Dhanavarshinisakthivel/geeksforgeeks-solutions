class Solution {
    public int maxStep(int arr[]) {

        int maxSteps = 0;
        int steps = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                steps++;
                maxSteps = Math.max(maxSteps, steps);
            } 
            else {
                steps = 0;
            }
        }

        return maxSteps;
    }
}