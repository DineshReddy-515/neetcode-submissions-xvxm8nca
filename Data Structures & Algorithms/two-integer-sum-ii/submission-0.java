class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            h.put(numbers[i],i);
        }

        for(int i=0;i<numbers.length;i++){
            int t=target -numbers[i];
            if(h.containsKey(t)){
                return new int[] {i+1,h.get(t)+1};
            }

        }
        return new int[0];

    }
}
