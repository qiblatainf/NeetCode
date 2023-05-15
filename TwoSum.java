//Time Complexity - O(n^2)

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (i != j){
                    sum = nums[i] + nums[j];
                    // System.out.println(sum);
                    if (sum == target){
                        num1 = i;
                        num2 = j;
                        break;
                    }
                    else{
                        sum = 0;
                    }
                }

            }
        }
        int [] output = new int[]{num1, num2};
        return output ;
    }
}
