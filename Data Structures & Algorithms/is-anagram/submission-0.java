class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length())
        {
            return false;
        }
        //there are 25 alphabets in english we solve using the frequency count
        int[] freqCount = new int[26];
        for (int i = 0 ; i < s.length() ; i++)
        {
            freqCount[s.charAt(i) - 'a']++;
            freqCount[t.charAt(i) - 'a']--;
        }

        for(int num : freqCount){
            if (num != 0)
            {
                return false;
            }
        }
        return true;
    }
}
