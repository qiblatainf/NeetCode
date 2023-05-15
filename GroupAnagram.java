

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> output = new ArrayList<>();
        List<String> anagram = new ArrayList<>();
      
        //base case
        if (strs[0].isEmpty()){
            anagram.add("");
            output.add(anagram);
            
        }
        else if (strs.length == 1 && !strs[0].isEmpty()){
            anagram.add(strs[0]);
            output.add(anagram);
        }
        else {
        for (int i = 0; i < strs.length; i++){
            char [] characters = strs[i].toCharArray();
            anagram = new ArrayList();
         
            if (anagram.contains(strs[i]) == false){
                anagram.add(strs[i]);
                System.out.println("adding:" + strs[i]);
            }

            boolean isAnagram = false;
            for (int j = i+1; j < strs.length; j++){   
                System.out.println(strs[j]);
                    for (char c : characters){
                        if (strs[j].contains(String.valueOf(c))){
                            isAnagram = true;
                            
                        }
                        else {
                            isAnagram = false;
                            break;
                        }
                    
                    }
                    if (isAnagram == true && (strs[i].length() == strs[j].length())){
                        anagram.add(strs[j]); 
                        strs[j] = "";
                    }
                    
            }
            
            output.add(anagram);

            if (anagram.contains("")){
                output.remove(anagram);
            }

          }
        }

        return output;
    }
    
}
