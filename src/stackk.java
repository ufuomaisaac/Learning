import java.util.HashSet;
import java.util.Stack;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class stackk{
    public static void main(String [] args){
        String str = "aaa";
        int result = longestSubstring(str);
        System.out.println(result);
    }
    public static int longestSubstring(String s) {
        HashSet<Character> hs = new HashSet();
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                j++;
                max = Math.max(max, hs.size());
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

}

