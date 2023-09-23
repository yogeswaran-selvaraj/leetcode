class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        char[] sAr = s.toCharArray();
        char[] tAr = t.toCharArray();
        for(char ch : sAr){
            int count = sMap.getOrDefault(ch, 0);
            sMap.put(ch, count + 1);
        }
        
        for(char ch : tAr){
            int count = tMap.getOrDefault(ch, 0);
            tMap.put(ch, count + 1);
        }
        
        if(tMap.size() != sMap.size()){
            if(tMap.size() > sMap.size()){
                for (Map.Entry<Character,Integer> entry : tMap.entrySet()) {
                    char ch = entry.getKey();
                    int tMapVal = entry.getValue();
                    int sMapVal = sMap.getOrDefault(ch, 0);
                    if(sMapVal != tMapVal){
                        return false;
                    }

                }
            }else{
                for (Map.Entry<Character,Integer> entry : sMap.entrySet()) {
                    char ch = entry.getKey();
                    int sMapVal = entry.getValue();
                    int tMapVal = tMap.getOrDefault(ch, 0);
                    if(sMapVal != tMapVal){
                        return false;
                    }

                }
            }
        }else{
            for (Map.Entry<Character,Integer> entry : sMap.entrySet()) {
                char ch = entry.getKey();
                int sMapVal = entry.getValue();
                int tMapVal = tMap.getOrDefault(ch, 0);
                if(sMapVal != tMapVal){
                    return false;
                }

            }
        }
        
        
        
        return true;
            
    }
}