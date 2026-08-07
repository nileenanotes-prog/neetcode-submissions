class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];
        int i, index1, index2;

        if (s.length() != t.length())
            return false;

        for (i=0; i<s.length(); i++){

            index1 = s.charAt(i) - 'a';
            arr[index1] += 1;

            index2 = t.charAt(i) - 'a';
            arr[index2] -= 1;
        }

        for (i=0; i<26; i++){
            if (arr[i] != 0)
                return false;
        }

        return true; 
    }
}
