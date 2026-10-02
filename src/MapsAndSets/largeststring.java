package MapsAndSets;

import java.util.Arrays;
import java.util.HashSet;

public class largeststring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 1;
        HashSet<Character> set =new HashSet<>();
        int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }else {
                int len=j-i;
                maxLength=Math.max(len,maxLength);
                while(s.charAt(i)!=s.charAt(j))
                {
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;

            }
        }
        int len=j-i;
        maxLength=Math.max(len,maxLength);
        return  maxLength;
    }
}
