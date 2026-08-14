class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        int i, index;
        HashMap<List<Integer>, List<String>> hmap = new HashMap<>();  
        for (String str : strs){
            List<Integer> charList = new ArrayList<>(Collections.nCopies(26, 0));
            List<String> string_list = new ArrayList<>(); 
            for (i=0; i<str.length(); i++)
            {
                index = str.charAt(i) - 'a';
                charList.set(index, charList.get(index) + 1);
            }
            if (hmap.containsKey(charList)){
                string_list =  hmap.get(charList);   
                string_list.add(str);
                hmap.put(charList, string_list);
            }
            else {
                string_list.add(str);
                hmap.put(charList, string_list);
            }
            
        }

        List<List<String>> hmapList = new ArrayList(hmap.values());

        return hmapList;
    }
}
