class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        if(str.equals("#0")){
            res.add("");
            return res;
        }
        int i=0;
        
        while(i<str.length()){
            int len = 0;
            int prev = i;
            while(str.charAt(i) != '#'){
                len++;
                i++;
            }

            String num = str.substring(prev, i);
            System.out.println(num);
            len = Integer.parseInt(num);

            res.add(str.substring(i+1, i+len+1));
            i += len+1;
        }
        
        return res;

    }
}
