class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> m=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            s=new String(ch);

            m.putIfAbsent(s,new ArrayList<>());   
            m.get(s).add(strs[i]);            
        }

        return new ArrayList<>(m.values());
         
        
    }
}
