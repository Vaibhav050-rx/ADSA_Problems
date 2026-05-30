class Solution {
    public String frequencySort(String s) {
       
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        while(!mp.isEmpty()){
            char maxChar=' ';
            int max=0;
            for(char c:mp.keySet()){
                if(mp.get(c)>max){
                 maxChar=c;
                 max=mp.get(c);
                }
            }
            for (int i = 0; i < max; i++) {

                sb.append(maxChar);
            }

            // remove used character
            mp.remove(maxChar);
        }
        return sb.toString();
    }
}