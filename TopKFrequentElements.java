//Time Complexity - O(n log n)
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        
        int [] output = new int[k];
        // int final;

        //base case
        if (k == 1){
            output[k-1] = k;
        }
        else {
            HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> table.get(b) - table.get(a));

            //putting values in the hashmap
            for (int i = 0; i < nums.length; i++){
                if (table.containsKey(nums[i])){
                    table.put(nums[i], table.get(nums[i])+1);
                }
                else {
                    table.put(nums[i], 1);
                }
            }
            
            pq.addAll(table.keySet());

            for (int ktop = 0; ktop < k; ktop++){
                output[ktop] = pq.remove();
            }    
        }
            
        return output;

        }
    
}
